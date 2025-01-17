package com.example.films_project.network

import com.example.films_project.MoviesList
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiMovies {
    @GET("search/movie")
    suspend fun searchMovie(
        @Query("query") query: String,
        @Query("include_adult") includeAdult: Boolean=false,
        @Query("language") language: String="fr-FR",
        @Query("page") page: Int
    ): MoviesList
}