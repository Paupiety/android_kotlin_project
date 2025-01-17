package com.example.films_project.ui.compose.HomeScreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.films_project.Data.Entity.MovieFav
import com.example.films_project.MovieList
import com.example.films_project.SearchButton
import com.example.films_project.TopBar
import org.koin.androidx.compose.koinViewModel

//rememberNavController
//NavHost : navController, startDestination : la route id
//Screen1(navController)

@Composable
fun HomeScreen(navController: NavController, viewModel: HomeScreenViewModel = koinViewModel()) {
    Button(
        onClick = {viewModel.insert(MovieFav(1,"aa","aa","aa","aa"))}
    ) {
        Text(
            "un string"
        )
    }
    Column(
        Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        TopBar(modifier = Modifier.fillMaxSize())
        MovieList(movies = viewModel.allUsers)
        Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            SearchButton(
                onClick = { navController.navigate("searchScreen")},
                name = "Rechercher un film",
                image = Icons.Default.Search
            )
        }

    }

}