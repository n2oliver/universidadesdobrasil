package com.universidadesdobrasil.viewmodels

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.universidadesdobrasil.data.databases.AppDatabase
import com.universidadesdobrasil.data.entities.FavoriteUniversity
import com.universidadesdobrasil.data.models.University
import com.universidadesdobrasil.data.repositories.UniversityRepository
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


class UniversityViewModel : ViewModel() {
    private lateinit var db: AppDatabase
    private val database = FirebaseDatabase.getInstance()
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

    val remoteFavorites: MutableLiveData<ArrayList<Int>> by lazy {
        MutableLiveData<ArrayList<Int>>()
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

    fun deleteFavorite(universityId: Int, uid: String){
        doAsync {
            db.favoriteUniversityDao().delete(universityId)

            val myRef = database.getReference("favorites/$uid/$universityId")
            myRef.setValue(null)
        }
    }

    fun addFavorite(favorite: FavoriteUniversity, uid: String){
        doAsync {
            db.favoriteUniversityDao().insert(favorite)

            val myRef = database.getReference("favorites/$uid/${favorite.id}")
            myRef.setValue(favorite.id)
        }
    }

    private fun loadFavoritesUniversities(): List<FavoriteUniversity> {
        return db.favoriteUniversityDao().getAll()
    }

    private fun loadUniversities(state: String?): Map<Int, University>? {
        return UniversityRepository.getByState(state)
    }

    fun getRemoteFavoritesUniversities(uid: String) {
        val myRef = database.getReference("favorites/$uid/")
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) { // This method is called once with the initial value and again
// whenever data at this location is updated.
                val favoriteList = arrayListOf<Int>()
                try {
                    for (postSnapshot in dataSnapshot.children) {
                        val universityId: Int = postSnapshot.getValue<String>(String::class.java)!!.toInt()
                        favoriteList.add(universityId)
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                remoteFavorites.value = favoriteList
            }

            override fun onCancelled(error: DatabaseError) { // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })
    }
}