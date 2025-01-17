package com.example.films_project.repository

import Movie
import com.example.films_project.MoviesList
import kotlinx.coroutines.flow.StateFlow

interface MovieRepository {
    val getMoviesListFlow: StateFlow<MoviesList?>;
    suspend fun getMovie(input: String): StateFlow<MoviesList?>;
}