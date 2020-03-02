package com.universidadesdobrasil.presentation.universities

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.universidadesdobrasil.R
import com.universidadesdobrasil.R.drawable.ic_favorite_border_24dp
import com.universidadesdobrasil.R.drawable.ic_favorite_fulled_24dp
import com.universidadesdobrasil.data.entities.FavoriteUniversity
import com.universidadesdobrasil.data.models.University
import com.universidadesdobrasil.presentation.login.LoginActivity
import com.universidadesdobrasil.presentation.websearch.WebSearchActivity
import com.universidadesdobrasil.viewmodels.UniversityViewModel
import kotlinx.android.synthetic.main.cardview_university.view.*


class UniversitiesAdapter(
    private val context: Context,
    private val universities: Map<Int, University>?,
    private val stateInitials: String?,
    private val stateName: String?,
    private val isLoggedIn: Boolean,
    private var favorites: ArrayList<Int>,
    private var viewModel: UniversityViewModel,
    private var uid: String?
) :
    RecyclerView.Adapter<UniversitiesAdapter.ViewHolder>() {


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
        return universities!!.entries.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.bindView(universities, favorites, viewModel, uid, position)
    }

    class ViewHolder(itemView: View, private val stateInitials: String?, private val stateName: String?, private val isLoggedIn: Boolean) : RecyclerView.ViewHolder(itemView) {
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

        fun bindView(
            universities: Map<Int, University>?,
            favorites: ArrayList<Int>,
            viewModel: UniversityViewModel,
            uid: String?,
            position: Int
        ) {
            val university = universities!!.values.elementAt(position)
            val universityNeighborhood = "${university.neighborhood}, ${university.city} - $stateInitials"
            val universityName = "${university.name} (${university.initials})"
            itemView.textView_universityName.text = universityName
            itemView.textView_universityNeighborhood.text = universityNeighborhood
            itemView.universityData.setOnClickListener {
                openBrowser(it, university)
            }

            if(favorites.contains(universities.keys.elementAt(position))){
                itemView.favoriteStar.setImageResource(ic_favorite_fulled_24dp)
            }

            itemView.favoriteStar.setOnClickListener {
                if(!isLoggedIn) {
                    val account = GoogleSignIn.getLastSignedInAccount(itemView.context)
                    val intent = Intent(itemView.context, LoginActivity::class.java)
                    startActivity(itemView.context, intent, null)
                } else {
                    val universityId = universities.keys.elementAt(position)
                    if (favorites.contains(universityId)) {
                        viewModel.deleteFavorite(universityId, uid!!)
                        favorites.removeAll(arrayListOf(universities.keys.elementAt(position)))
                        itemView.favoriteStar.setImageResource(ic_favorite_border_24dp)
                    } else {
                        viewModel.addFavorite(FavoriteUniversity(null, universityId.toString()), uid!!)
                        favorites.add(universityId)
                        itemView.favoriteStar.setImageResource(ic_favorite_fulled_24dp)
                    }
                }
            }
        }

    }
}
