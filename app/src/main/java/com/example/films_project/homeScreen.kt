package com.example.films_project


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//rememberNavController
//NavHost : navController, startDestination : la route id
//Screen1(navController)
@Composable
fun HomeScreen(navController: NavController){

    Column(
        Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {
        TopBar(modifier = Modifier.fillMaxSize())
//        MovieList(movies = movies)
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