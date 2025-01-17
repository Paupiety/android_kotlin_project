package com.example.films_project.ui.compose.search

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.films_project.ui.compose.search.components.MovieListRow
import com.example.films_project.ui.compose.search.components.SearchBar
import com.example.films_project.SearchButton
import org.koin.androidx.compose.koinViewModel

@Composable
fun SearchScreen(navController: NavController, viewModel: SearchScreenViewModel = koinViewModel()) {
    var inputValue by remember { mutableStateOf("") }

    val movies by viewModel.movies.collectAsState()

Box(
    modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
) {
    Column(modifier = Modifier.fillMaxSize()) {
        SearchBar(
            input = inputValue,
            onInputChange = { inputValue = it },
            onSearch = { viewModel.searchMovies(inputValue) },
            modifier = Modifier
                .fillMaxWidth()

        )

        MovieListRow(movies, modifier = Modifier.weight(1f).fillMaxWidth())

    }
        SearchButton(
            onClick = { navController.navigate("homeScreen") },
            name = "Ma librairie",
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )

}

}