package com.example.films_project.ui.compose.search.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.films_project.MoviesList

@Composable
fun MovieListRow(movies: MoviesList?, modifier: Modifier? = null) {
    Column (verticalArrangement = Arrangement.spacedBy(16.dp)) {
        if(movies != null){
            Text(
                text = "Résultats de votre recherche",
                color = Color.White,
                fontWeight = FontWeight(600),
                fontSize = 28.sp
            )
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(22.dp),
            modifier = Modifier.weight(1f)
        ) {
            items(movies?.results?:listOf()) { movie ->
                MovieRow(movie)
            }
        }

    }
}