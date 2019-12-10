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

class UniversitiesAdapter(private val context: Context, private val universities: ArrayList<University>, private val stateInitials: String) :
    RecyclerView.Adapter<UniversitiesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_university, parent, false)
        return ViewHolder(view, stateInitials)
    }

    override fun getItemCount(): Int {
        return universities.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(universities[position])
    }

    class ViewHolder(itemView: View, private val stateInitials: String) : RecyclerView.ViewHolder(itemView) {
        private fun openBrowser(view: View, university: University){
            val intent = Intent(view.context, WebSearchActivity::class.java)
            intent.putExtra("initials", university.initials)
            intent.putExtra("stateInitials", stateInitials)
            ContextCompat.startActivity(view.context, intent, null)
        }

        fun bindView(university: University) {
            itemView.textView_universityName.text = "${university.name} (${university.initials})"
            itemView.textView_universityNetwork.text = "Rede: ${university.network}\nCategoria administrativa: ${university.administrativeCategory}"
            itemView.textView_universityNeighborhood.text = "${university.neighborhood}, ${university.city} - $stateInitials"
            itemView.textView_universityCep.text = "CEP: ${university.cep}"
            itemView.textView_universityPhone.text = "Telefone: ${university.telephone}"
            university.image?.let {
                itemView.image_imageUniversity.setImageResource(it)
                itemView.image_imageUniversity.visibility = View.VISIBLE
            }?:let {
                itemView.image_imageUniversity.visibility = View.GONE
            }
            itemView.setOnClickListener {
                openBrowser(it, university)
            }
        }
    }
}
