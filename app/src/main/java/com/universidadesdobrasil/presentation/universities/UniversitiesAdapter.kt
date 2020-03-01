package com.universidadesdobrasil.presentation.universities

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.universidadesdobrasil.R
import com.universidadesdobrasil.R.drawable.ic_favorite_border_24dp
import com.universidadesdobrasil.R.drawable.ic_favorite_fulled_24dp
import com.universidadesdobrasil.data.models.University
import com.universidadesdobrasil.presentation.login.LoginActivity
import com.universidadesdobrasil.presentation.websearch.WebSearchActivity
import kotlinx.android.synthetic.main.cardview_university.view.*


class UniversitiesAdapter(private val context: Context, private val universities: ArrayList<University>, private val stateInitials: String, private val stateName: String, private val isLoggedIn: Boolean) :
    RecyclerView.Adapter<UniversitiesAdapter.ViewHolder>() {

    private var favoritesArrayList: ArrayList<Int> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_university, parent, false)
        return ViewHolder(
            view,
            stateInitials,
            stateName,
            isLoggedIn
        )
    }

    override fun getItemCount(): Int {
        return universities.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(universities[position], favoritesArrayList)
    }

    class ViewHolder(itemView: View, private val stateInitials: String, private val stateName: String, private val isLoggedIn: Boolean) : RecyclerView.ViewHolder(itemView) {
        private fun openBrowser(view: View, university: University){
            val intent = Intent(view.context, WebSearchActivity::class.java)
            intent.putExtra("name", university.name)
            intent.putExtra("initials", university.initials)
            intent.putExtra("city", university.city)
            intent.putExtra("state", stateName)
            intent.putExtra("stateInitials", stateInitials)
            intent.putExtra("neighborhood", university.neighborhood)
            startActivity(view.context, intent, null)
        }

        fun bindView(university: University, favoritesArrayList: ArrayList<Int>) {
            itemView.textView_universityName.text = "${university.name} (${university.initials})"
            itemView.textView_universityNeighborhood.text = "${university.neighborhood}, ${university.city} - $stateInitials"
            itemView.universityData.setOnClickListener {
                openBrowser(it, university)
            }

            itemView.favoriteStar.setOnClickListener {
                if(!isLoggedIn) {
                    val account = GoogleSignIn.getLastSignedInAccount(itemView.context)
                    Log.d("Logged ccount: ", account.toString())
                    val intent = Intent(itemView.context, LoginActivity::class.java)
                    startActivity(itemView.context, intent, null)
                } else {


                    itemView.favoriteStar.jumpDrawablesToCurrentState()
                    if (favoritesArrayList.contains(101)) {
                        itemView.favoriteStar.setImageResource(ic_favorite_border_24dp)
                        makeText(itemView.context, "A universidade '${university.name}' foi removida dos favoritos", LENGTH_SHORT).show()
                        favoritesArrayList.remove(101)
                    } else {
                        itemView.favoriteStar.setImageResource(ic_favorite_fulled_24dp)
                        makeText(itemView.context, "Universidade '${university.name}' adicionada aos favoritos", LENGTH_SHORT).show()
                        favoritesArrayList.add(101)
                    }
                }
            }
        }

    }
}
