package com.universidadesdobrasil.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.google.firebase.database.FirebaseDatabase
import com.universidadesdobrasil.data.databases.AppDatabase
import com.universidadesdobrasil.data.entities.FavoriteUniversity
import com.universidadesdobrasil.data.models.University
import com.universidadesdobrasil.data.repositories.UniversityRepository
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


class UniversityViewModel : ViewModel() {
    private lateinit var db: AppDatabase
    fun initializeDatabase(context: Context){
        db = Room.databaseBuilder(
            context,
            AppDatabase::class.java, "app-database"
        ).build()
    }
    private val favoritesUniversities: MutableLiveData<List<FavoriteUniversity>> by lazy {
        MutableLiveData<List<FavoriteUniversity>>()
    }
    private val universities: MutableLiveData<Map<Int, University>?> by lazy {
        MutableLiveData<Map<Int, University>?>()
    }

    fun getFavoritesUniversities(): LiveData<List<FavoriteUniversity>> {

        var list: List<FavoriteUniversity>?
        doAsync {
            list = loadFavoritesUniversities()
            uiThread {
                favoritesUniversities.value = list
            }
        }

        return favoritesUniversities
    }

    fun getUniversities(state: String?): LiveData<Map<Int, University>?> {

        var list: Map<Int, University>?
        doAsync {
            list = loadUniversities(state)
            uiThread {
                universities.value = list
            }
        }

        return universities
    }

    fun deleteFavorite(id: Int){
        doAsync {
            db.favoriteUniversityDao().delete(id)
        }
    }

    fun addFavorite(favorite: FavoriteUniversity){
        doAsync {
            db.favoriteUniversityDao().insert(favorite)
        }
    }

    fun syncFavorite(favorites: ArrayList<Int>, uid: String){
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("favorites/$uid")
        myRef.setValue(favorites)
    }

    private fun loadFavoritesUniversities(): List<FavoriteUniversity> {
        return db.favoriteUniversityDao().getAll()
    }

    private fun loadUniversities(state: String?): Map<Int, University>? {
        return UniversityRepository.getByState(state)
    }
}