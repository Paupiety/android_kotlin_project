package com.example.films_project.repository

import Movie
import android.content.Context
import com.example.films_project.MoviesList
import com.example.films_project.network.ApiMovies
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MovieRepositoryImpl(private val apiMovies: ApiMovies, context: Context): MovieRepository {
    private val movieListFlow = MutableStateFlow<MoviesList?>(null)
    override  val getMoviesListFlow: StateFlow<MoviesList?> = movieListFlow.asStateFlow()

    override suspend fun getMovie(input: String): StateFlow<MoviesList?>{

        val response = apiMovies.searchMovie(
            query = input,
            page = 1,
            includeAdult = false,
            language = "fr-FR"
        )
        movieListFlow.value = response
        return getMoviesListFlow
    }
}