package com.olivercastilho.universidadesdobrasil.presentation.states

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.repositories.StateRepository
import kotlinx.android.synthetic.main.activity_main.*

class StatesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val states = StateRepository.getStates()
        statesList.layoutManager = LinearLayoutManager(this)
        statesList.adapter =
            StatesAdapter(this, states)
    }
}
