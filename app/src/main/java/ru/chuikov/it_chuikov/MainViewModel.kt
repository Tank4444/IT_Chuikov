package ru.chuikov.it_chuikov

import android.app.Application
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.chuikov.it_chuikov.network.EdamamApi
import ru.chuikov.it_chuikov.network.entity.EdamamResponce

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var hits:MutableLiveData<MutableList<EdamamResponce.Hit>> = MutableLiveData(mutableListOf())


    fun loadRecipes(q:String){
        viewModelScope.launch {
            hits.value = EdamamApi.retrofitService.listOfRecipes(q).hits.toMutableList()
        }

    }


}