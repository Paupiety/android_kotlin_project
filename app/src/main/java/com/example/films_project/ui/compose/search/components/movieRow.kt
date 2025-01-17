package com.example.films_project.ui.compose.search.components

import Movie
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.films_project.ui.compose.search.SearchScreenViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun MovieRow(movie: Movie, viewModel: SearchScreenViewModel = koinViewModel()) {
    var image = movie.image
    Row(modifier = Modifier.fillMaxSize()) {

        AsyncImage(
            model = "https://image.tmdb.org/t/p/w500$image",
            contentDescription = "image film",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(width = 100.dp, height = 150.dp)
                .clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.height(150.dp).fillMaxWidth()) {
            Column() {
                Text(
                    text = movie.title,
                    color = Color.White,
                    fontWeight = FontWeight(600)
                )
                Row {
                    Text(
                        text = movie.year.toString(),
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = movie.note.toString(),
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

//            Icon(
//                imageVector = if (viewModel.isFavorite(movie)) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
//                contentDescription = if (viewModel.isFavorite(movie)) "Enlever des favoris" else "Ajouter aux favoris",
//                tint = Color.White,
//                modifier = Modifier
//                    .size(28.dp)
//                    .clickable {
//                        viewModel.toggleFavorite(movie)
//                    }
//            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription =  "Ajouter aux favoris",
                tint = Color.White,
                modifier = Modifier
                    .size(40.dp)
                    .align(Alignment.End)
            )

        }

    }
}