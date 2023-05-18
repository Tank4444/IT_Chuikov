package ru.chuikov.it_chuikov

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.HttpException
import ru.chuikov.it_chuikov.network.EdamamApi
import ru.chuikov.it_chuikov.network.entity.EdamamResponce
import java.io.IOException

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val _hits = MutableLiveData<List<EdamamResponce.Hit>>(mutableListOf())
    val hits: LiveData<List<EdamamResponce.Hit>> = _hits
    fun loadRecipes(q: String) {
        viewModelScope.launch {
            val res: List<EdamamResponce.Hit> = try {
                EdamamApi.retrofitService.listOfRecipes(q).hits
            } catch (e: IOException) {
                Log.e("error", e.message.toString())
                listOf()
            } catch (e: HttpException) {
                Log.e("error", e.message.toString())
                listOf()
            }
            _hits.value = res
        }

    }
}