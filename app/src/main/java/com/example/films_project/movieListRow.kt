package com.example.films_project

import Movie
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MovieListRow(movies: MoviesList?) {
    Column () {
        Text(
            text = "Movies",
            color = Color.White,
            fontWeight = FontWeight(600),
            fontSize = 28.sp
        )
        LazyColumn(verticalArrangement = Arrangement.spacedBy(22.dp)) {
            items(movies?.results?:listOf()) { movie ->
                MovieRow(movie)
            }
        }

    }
}