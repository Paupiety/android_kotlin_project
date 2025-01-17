package com.example.films_project.Data.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Movie")
data class MovieFav(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val Title: String,
    val Date: String,
    val URL: String,
    val note: String
)