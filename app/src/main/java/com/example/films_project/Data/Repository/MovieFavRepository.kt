package com.example.films_project.Data.Repository

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.films_project.Data.DAO.MovieDao
import com.example.films_project.Data.DB.AppDatabase
import com.example.films_project.Data.Entity.MovieFav

interface MovieFavRepository{

    fun getAll(): LiveData<List<MovieFav>>

    suspend fun insert(user: MovieFav)

    suspend fun update(user: MovieFav)

    suspend fun delete(user: MovieFav)
}

class MovieFavRepositoryimpl(context: Context): MovieFavRepository {

    var db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()

    val allUsers: LiveData<List<MovieFav>> = db.userDao().getAllUsers()

    override fun getAll(): LiveData<List<MovieFav>> {
        return allUsers
    }

    override suspend fun insert(user: MovieFav) {
        db.userDao().insert(user)
    }

    override suspend fun update(user: MovieFav) {
        db.userDao().update(user)
    }

    override suspend fun delete( user: MovieFav) {
        db.userDao().delete(user)
    }
}