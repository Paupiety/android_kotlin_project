package com.example.films_project

import Movie
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MovieListRow(movies: MoviesList?) {
    Column (verticalArrangement = Arrangement.spacedBy(22.dp)) {
        Text(
            text = "Movies",
            color = Color.White,
            fontWeight = FontWeight(600),
            fontSize = 28.sp
        )
        movies?.results?.forEach { movie ->
            MovieRow(movie)
        }
    }
}