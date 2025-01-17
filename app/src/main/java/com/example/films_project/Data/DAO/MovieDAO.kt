package com.example.films_project.Data.DAO

import com.example.films_project.Data.Entity.MovieFav
import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(movieFav: MovieFav)

    @Update
    suspend fun update(movieFav: MovieFav)

    @Delete
    suspend fun delete(movieFav: MovieFav)

    @Query("SELECT * FROM Movie ORDER BY title ASC")
    fun getAllUsers(): LiveData<List<MovieFav>>
}
