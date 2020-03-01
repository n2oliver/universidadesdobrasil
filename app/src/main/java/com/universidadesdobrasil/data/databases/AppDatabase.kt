package com.universidadesdobrasil.data.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.universidadesdobrasil.data.daos.UniversityDao
import com.universidadesdobrasil.data.entities.University

@Database(entities = [University::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun universityDao(): UniversityDao
}
