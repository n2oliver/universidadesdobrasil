package com.universidadesdobrasil.data.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.universidadesdobrasil.data.entities.University

@Dao
interface UniversityDao {
    @Query("SELECT * FROM university")
    fun getAll(): List<University>

    @Query("SELECT * FROM university WHERE uid IN (:universityIds)")
    fun loadAllByIds(universityIds: IntArray): List<University>

    @Query("SELECT * FROM university WHERE university_name LIKE :name AND " +
            "university_id LIKE :id LIMIT 1")
    fun findByName(name: String, id: String): University

    @Insert
    fun insertAll(vararg university: University)

    @Delete
    fun delete(university: University)
}
