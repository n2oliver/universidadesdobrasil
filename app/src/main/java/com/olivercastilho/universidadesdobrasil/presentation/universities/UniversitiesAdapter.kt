package com.olivercastilho.universidadesdobrasil.presentation.universities

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.University
import com.olivercastilho.universidadesdobrasil.presentation.websearch.WebSearchActivity
import kotlinx.android.synthetic.main.cardview_university.view.*

class UniversitiesAdapter(private val context: Context, private val universities: ArrayList<University>, private val stateInitials: String, private val stateName: String) :
    RecyclerView.Adapter<UniversitiesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_university, parent, false)
        return ViewHolder(view, stateInitials, stateName)
    }

    override fun getItemCount(): Int {
        return universities.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(universities[position])
    }

    class ViewHolder(itemView: View, private val stateInitials: String, private val stateName: String) : RecyclerView.ViewHolder(itemView) {
        private fun openBrowser(view: View, university: University){
            val intent = Intent(view.context, WebSearchActivity::class.java)
            intent.putExtra("initials", university.initials)
            intent.putExtra("neighborhood", university.neighborhood)
            intent.putExtra("state", stateName)
            ContextCompat.startActivity(view.context, intent, null)
        }

        fun bindView(university: University) {
            itemView.textView_universityName.text = "${university.name} (${university.initials})"
            itemView.textView_universityNeighborhood.text = "${university.neighborhood}, ${university.city} - $stateInitials"
            itemView.setOnClickListener {
                openBrowser(it, university)
            }
        }
    }
}
