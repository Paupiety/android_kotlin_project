package com.example.films_project

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(modifier: Modifier) {
Row(
    modifier = Modifier
        .fillMaxWidth(), horizontalArrangement = Arrangement.Center
) {
    Text(
    text = "Ma librairie",
    color = Color.White,
    fontWeight = FontWeight.Bold,
    textAlign = TextAlign.Center,
        fontSize = 24.sp
) }


}