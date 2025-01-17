package com.example.films_project.ui.compose.HomeScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.films_project.Data.Entity.MovieFav
import com.example.films_project.Data.Repository.MovieFavRepository
import kotlinx.coroutines.launch

class HomeScreenViewModel(val repository: MovieFavRepository) : ViewModel() {

    val allUsers: LiveData<List<MovieFav>> = repository.getAll()

    fun insert(movieFav: MovieFav) = viewModelScope.launch {
        repository.insert(movieFav)
    }

    fun update(movieFav: MovieFav) = viewModelScope.launch {
        repository.update(movieFav)
    }

    fun delete(movieFav: MovieFav) = viewModelScope.launch {
        repository.delete(movieFav)
    }
}