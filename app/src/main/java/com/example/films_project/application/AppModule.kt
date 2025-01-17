package com.example.films_project.application

import com.example.films_project.Data.Repository.MovieFavRepository
import com.example.films_project.Data.Repository.MovieFavRepositoryimpl
import com.example.films_project.network.ApiMovies
import com.example.films_project.repository.MovieRepository
import com.example.films_project.repository.MovieRepositoryImpl
import com.example.films_project.ui.compose.HomeScreen.HomeScreenViewModel
import com.example.films_project.ui.compose.search.SearchScreenViewModel
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val appModule = module {
    single<MovieRepository> {
        MovieRepositoryImpl(get(), androidContext())
    }

    single<MovieFavRepository> {
        MovieFavRepositoryimpl(androidContext())
    }


    viewModel{
        SearchScreenViewModel(get())
    }
    viewModel{
        HomeScreenViewModel(get())
    }

    single {
        Interceptor { chain ->
            val request = chain.request().newBuilder()
                    .addHeader("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJkYmI4MzliZmU4MDE0YWMyNTIxYzE3ZDljYTkzMGFlYyIsIm5iZiI6MTczNzAzNDM1NC40Nywic3ViIjoiNjc4OTBhNzJiOWQxZDEwZWYxOTc4ODhlIiwic2NvcGVzIjpbImFwaV9yZWFkIl0sInZlcnNpb24iOjF9.LeaT1Mq4VfAgNLTWt2fExDgJot2d2FM27qFGkDUnbBM")
                .build()
            chain.proceed(request)
        }
    }
    single {
        OkHttpClient.Builder()
            .addInterceptor(get<Interceptor>())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    single { get<Retrofit>().create(ApiMovies::class.java) }

    single {
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}