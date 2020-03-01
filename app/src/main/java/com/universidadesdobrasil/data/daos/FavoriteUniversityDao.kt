package com.universidadesdobrasil.data.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.universidadesdobrasil.data.entities.FavoriteUniversity

@Dao
interface FavoriteUniversityDao {
    @Query("SELECT * FROM favoriteuniversity")
    fun getAll(): List<FavoriteUniversity>

    @Query("SELECT * FROM favoriteuniversity WHERE uid IN (:universityIds)")
    fun loadAllByIds(universityIds: IntArray): List<FavoriteUniversity>

    @Query("SELECT * FROM favoriteuniversity WHERE university_id LIKE :id LIMIT 1")
    fun findByName(id: String): List<FavoriteUniversity>

    @Insert
    fun insert(vararg favoriteUniversity: FavoriteUniversity)

    @Query("DELETE FROM favoriteuniversity WHERE university_id = :id")
    fun delete(id: Int)
}
