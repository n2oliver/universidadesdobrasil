package com.universidadesdobrasil.presentation.states

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.facebook.ads.AdSize
import com.facebook.ads.AdView
import com.facebook.ads.AudienceNetworkAds
import com.google.firebase.auth.FirebaseAuth
import com.universidadesdobrasil.R
import com.universidadesdobrasil.presentation.tips.TipsActivity
import com.universidadesdobrasil.viewmodels.StateViewModel
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_main.*


class StatesActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        if(auth.currentUser == null){
            linearLayout_menu.visibility = View.GONE
        } else {
            imageView_signOut.setOnClickListener {
                AlertDialog.Builder(this)
                    .setMessage("Deseja mesmo sair de sua conta?")
                    .setPositiveButton("Sim") { _: DialogInterface, _: Int ->
                        auth.signOut()
                        AlertDialog.Builder(this)
                            .setMessage("Você saiu de sua conta!")
                            .setPositiveButton("Ok") { _: DialogInterface, _: Int ->
                                startActivity(Intent(this, StatesActivity::class.java))
                            }
                            .show()
                    }
                    .setNegativeButton("Não") { _: DialogInterface, _: Int -> }
                    .show()
            }
            imageView_star.setOnClickListener {
                AlertDialog.Builder(this)
                    .setMessage("Visite a loja e deixe sua avaliação!")
                    .setPositiveButton("Ok") { _: DialogInterface, _: Int ->
                        val url = "https://play.google.com/store/apps/details?id=com.universidadesdobrasil"
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(i)
                    }
                    .setNegativeButton("Mais tarde!") { _: DialogInterface, _: Int ->
                        Toast.makeText(this, "Ok!", Toast.LENGTH_SHORT).show()
                    }
                    .show()
            }
        }
        AudienceNetworkAds.initialize(this);
        val adView = AdView(this, getString(R.string.PLACEMENT_ID), AdSize.BANNER_HEIGHT_50)
        banner_container.addView(adView)
        adView.loadAd()

        val viewModel = ViewModelProviders.of(this)[StateViewModel::class.java]
        viewModel.getStates()
        viewModel.states.observe(this, Observer { states ->
            statesList.layoutManager = LinearLayoutManager(this)
            statesList.adapter =
                StatesAdapter(
                    this,
                    states
                )
        })

        lightDicas.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}
