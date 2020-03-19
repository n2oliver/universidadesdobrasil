package com.universidadesdobrasil.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.universidadesdobrasil.data.models.State
import com.universidadesdobrasil.data.repositories.StateRepository
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class StateViewModel : ViewModel() {
    val states: MutableLiveData<List<State>> by lazy {
        MutableLiveData<List<State>>()
    }

    fun getStates() {

        var list: List<State>
        doAsync {
            list = loadStates()
            uiThread {
                states.value = list
            }
        }
    }

    private fun loadStates(): List<State> {
        return StateRepository.getStates()
    }
}