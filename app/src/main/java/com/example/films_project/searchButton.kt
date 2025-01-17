package com.example.films_project

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun SearchButton(onClick: () -> Unit, name: String, image: ImageVector? = null) {
    Button(
        onClick = { onClick() },
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults
            .buttonColors(
            containerColor = Color.Blue
    )){
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (image != null){
                Icon(
                    imageVector = image,
                    contentDescription = "icone",
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }

            Text(name, color = Color.White)
        }
    }

}