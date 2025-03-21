package com.example.films_project.ui.compose.search

import Movie
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.films_project.MovieList
import com.example.films_project.MoviesList
import com.example.films_project.repository.MovieRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class SearchScreenViewModel(private val movieRepository: MovieRepository): ViewModel() {
    val movies: StateFlow<MoviesList?> = movieRepository.getMoviesListFlow
//    private val favourites: StateFlow<List<favourite>?> = favouriteRepository.getFavouritesListFlow

    fun searchMovies(input: String){
        viewModelScope.launch {
            movieRepository.getMovie(input)

        }

    }

//    fun isFavorite(movie: Movie): Boolean{
////        return
//    }
}

//val movies by viewModel.movies.collectAsState()