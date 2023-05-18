package ru.chuikov.it_chuikov.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.chuikov.it_chuikov.MainViewModel

@Composable
fun MainScreen(mainViewModel: MainViewModel = viewModel()) {
    val hits = mainViewModel.hits.observeAsState(listOf())

    Column(modifier = Modifier.fillMaxSize()) {
        val text = remember {
            mutableStateOf("")
        }
        Button(onClick = { mainViewModel.loadRecipes("chicken") }) {
            Text(text = "Update")
        }
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            itemsIndexed(hits.value) { index, item ->
                Text(text = item.recipe.label)
                Divider()
            }

        }
    }

}