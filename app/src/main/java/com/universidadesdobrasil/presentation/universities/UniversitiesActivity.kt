package com.universidadesdobrasil.presentation.universities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.SearchView.OnQueryTextListener
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.google.firebase.auth.FirebaseAuth
import com.universidadesdobrasil.BuildConfig
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.databases.AppDatabase
import com.universidadesdobrasil.data.models.University
import com.universidadesdobrasil.data.repositories.UniversityRepository
import com.universidadesdobrasil.presentation.AppBarTitle.Companion.changeAppBarTitle
import com.universidadesdobrasil.presentation.states.StatesActivity
import com.universidadesdobrasil.presentation.tips.TipsActivity
import com.universidadesdobrasil.viewmodels.UniversityViewModel
import kotlinx.android.synthetic.main.actionbar.*
import kotlinx.android.synthetic.main.activity_universities.*


class UniversitiesActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private var isLoggedIn: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universities)


        val viewModel = ViewModelProviders.of(this)[UniversityViewModel::class.java]

        viewModel.initializeDatabase(this)
        viewModel.getUniversities()!!.observe(this, Observer { univertities ->
            print(univertities)
        })

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

        changeAppBarTitle(textView_appName, state)
        var universities = UniversityRepository.getByState(state)
        findUniversities("", universities, stateInitials, state)
        searchInput.setOnQueryTextListener (object : OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextChange(newText: String): Boolean {
                findUniversities(newText, universities, stateInitials, state)
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                // task HERE
                return false
            }

        })
        imageView_ublogo.setOnClickListener {
            intent = Intent(this, StatesActivity::class.java)
            startActivity(intent)
        }

        lightDicas.setOnClickListener {
            intent = Intent(this, TipsActivity::class.java)
            startActivity(intent)
        }
    }

    private fun findUniversities(str: String, universitiesItems: ArrayList<University>, stateInitials: String, stateName: String){
        var universities = universitiesItems
        var universitiesFiltered = arrayListOf<University>()

        val searchString = str.toLowerCase()

        if(searchString != "") {
            universities.forEach {
                if (searchString.toRegex().find(it.initials.toLowerCase()) != null ||
                    searchString.toRegex().find(it.neighborhood.toLowerCase()) != null ||
                    searchString.toRegex().find(it.name.toLowerCase()) != null ||
                    searchString.toRegex().find(it.city.toLowerCase()) != null) {
                    universitiesFiltered.add(it)
                }
            }
            universities = universitiesFiltered
        }

        universitiesList.layoutManager = LinearLayoutManager(this)
        universitiesList.adapter =
            UniversitiesAdapter(
                this,
                universities,
                stateInitials,
                stateName,
                isLoggedIn
            )
    }
}
