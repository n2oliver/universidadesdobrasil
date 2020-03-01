package com.universidadesdobrasil.presentation.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.universidadesdobrasil.R
import com.universidadesdobrasil.presentation.states.StatesActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        GlobalScope.launch {
            delay(1000)
            runOnUiThread {
                intent = Intent(applicationContext, StatesActivity::class.java)
                startActivity(intent)
                finishAffinity()
            }
        }
    }

}
