package com.universidadesdobrasil.data.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.universidadesdobrasil.data.daos.FavoriteUniversityDao
import com.universidadesdobrasil.data.entities.FavoriteUniversity

@Database(entities = [FavoriteUniversity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteUniversityDao(): FavoriteUniversityDao
}
