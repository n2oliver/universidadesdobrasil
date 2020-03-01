package com.universidadesdobrasil.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.universidadesdobrasil.data.databases.AppDatabase
import com.universidadesdobrasil.data.entities.University
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
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
    private val universities: MutableLiveData<List<University>> by lazy {
        MutableLiveData<List<University>>()
    }

    fun getUniversities(): LiveData<List<University>>? {

        var list: List<University>?
        doAsync {
            list = loadUniversities()
            uiThread {
                universities.value = list
            }
        }

        return universities
    }

    private fun loadUniversities(): List<University> {
        return db.universityDao().getAll()
    }
}