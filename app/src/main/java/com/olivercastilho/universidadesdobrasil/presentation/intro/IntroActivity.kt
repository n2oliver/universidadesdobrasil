package com.olivercastilho.universidadesdobrasil.presentation.intro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.presentation.landing.LandingActivity
import com.olivercastilho.universidadesdobrasil.presentation.states.StatesActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class IntroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        GlobalScope.launch {
            delay(3000)
            runOnUiThread {
                intent = Intent(applicationContext, StatesActivity::class.java)
                startActivity(intent)
                finishAffinity()
            }
        }
    }

}
