package com.universidadesdobrasil.presentation.universities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.google.firebase.auth.FirebaseAuth
import com.universidadesdobrasil.BuildConfig
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.models.University
import com.universidadesdobrasil.presentation.AppBarTitle.Companion.changeAppBarTitle
import com.universidadesdobrasil.presentation.states.StatesActivity
import com.universidadesdobrasil.presentation.tips.TipsActivity
import com.universidadesdobrasil.viewmodels.UniversityViewModel
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_universities.*


class UniversitiesActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private var isLoggedIn: Boolean = false
    private lateinit var allUniversities: Map<Int, University>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universities)

        auth = FirebaseAuth.getInstance()

        val currentUser = auth.currentUser

        isLoggedIn = currentUser != null

        MobileAds.initialize(this)
        if(BuildConfig.DEBUG) {
            val testDeviceIds = listOf(getString(R.string.test_device_id))
            val configuration =
                RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build()
            MobileAds.setRequestConfiguration(configuration)
        }
        val adRequest  = AdRequest.Builder()
            .build()
        adView.loadAd(adRequest)

        val state = intent.getStringExtra("state")
        val stateInitials = intent.getStringExtra("stateInitials")

        val viewModel = ViewModelProviders.of(this)[UniversityViewModel::class.java]

        viewModel.initializeDatabase(this)

        viewModel.getUniversities(state).observe(this, Observer { universities ->
            val favorites: ArrayList<Int> = arrayListOf()
            viewModel.getFavoritesUniversities().observe(this, Observer { favoritesUnivertities ->
                favoritesUnivertities!!.forEach {
                    if(universities!!.keys.contains(it.id!!.toInt())) {
                        favorites.add(it.id.toInt())
                    }
                }
                allUniversities = universities!!
                findUniversities("", universities, stateInitials, state, favorites, viewModel)
            })
        })

        changeAppBarTitle(textView_appName, state)

        imageView_ublogo.setOnClickListener {
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }

        lightDicas.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun findUniversities(
        str: String,
        universitiesItems: Map<Int, University>?,
        stateInitials: String?,
        stateName: String?,
        favorites: ArrayList<Int>,
        viewModel: UniversityViewModel
    ){
        var universities = universitiesItems
        val universitiesFiltered = HashMap<Int, University>()

        val searchString = str.toLowerCase()

        if(searchString != "") {
            universities!!.forEach {
                if (searchString.toRegex().find(it.value.initials) != null ||
                    searchString.toRegex().find(it.value.neighborhood.toLowerCase()) != null ||
                    searchString.toRegex().find(it.value.name.toLowerCase()) != null ||
                    searchString.toRegex().find(it.value.city.toLowerCase()) != null) {
                    (universitiesFiltered as java.util.HashMap).put(it.key, it.value)
                }
            }
        }

        if(universitiesFiltered.isNotEmpty() && searchString != ""){
            noresults.visibility = View.GONE
            universities = universitiesFiltered
        } else if(universitiesFiltered.isEmpty() && searchString != "") {
            noresults.visibility = View.VISIBLE
            universities = universitiesFiltered
        } else {
            noresults.visibility = View.GONE
            universities = allUniversities
        }

        universitiesList.layoutManager = LinearLayoutManager(this)

        universitiesList.adapter =
            UniversitiesAdapter(
                this,
                universities,
                stateInitials,
                stateName,
                isLoggedIn,
                favorites,
                viewModel
            )

        searchInput.setOnQueryTextListener (object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                findUniversities(
                    newText,
                    universities,
                    stateInitials,
                    stateName,
                    favorites,
                    viewModel
                )
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                // task HERE
                return false
            }
        })
    }
}
