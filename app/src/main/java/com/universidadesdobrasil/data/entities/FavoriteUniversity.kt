package com.universidadesdobrasil.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavoriteUniversity(
    @PrimaryKey(autoGenerate = true) val uid: Int?,
    @ColumnInfo(name = "university_id") val id: String?
)