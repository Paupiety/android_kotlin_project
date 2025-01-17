package com.example.films_project

import Movie
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Movie(movie: Movie){
    Column {
        AsyncImage(
            model = movie.image,
            contentDescription = "image film",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp)
                .clip(RoundedCornerShape(8.dp))
        )
//        Image(
//            painter = painterResource(movie.image),
//            contentDescription = "image du film",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .size(width = 200.dp, height = 300.dp)
//                .clip(RoundedCornerShape(8.dp))
//                .background(Color.Gray)
//        )
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
}