package com.example.films_project.ui.compose.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.films_project.MovieListRow
import com.example.films_project.SearchBar
import com.example.films_project.SearchButton
import org.koin.androidx.compose.koinViewModel

@Composable
fun SearchScreen(navController: NavController, viewModel: SearchScreenViewModel = koinViewModel()) {
    var inputValue by remember { mutableStateOf("") }

    val movies by viewModel.movies.collectAsState()


    Column {
        SearchBar(
            input = inputValue,
            onInputChange = { inputValue = it},
            onSearch = { viewModel.searchMovies(inputValue) },
            modifier = Modifier
                .fillMaxWidth()

        )

        MovieListRow(movies)
        Spacer(modifier = Modifier.weight(1f))
        SearchButton(
            onClick = { navController.navigate("homeScreen")},
            name = "Ma librairie"
        )
    }

}