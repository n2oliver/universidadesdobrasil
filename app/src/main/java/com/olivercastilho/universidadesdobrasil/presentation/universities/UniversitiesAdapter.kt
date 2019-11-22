package com.olivercastilho.universidadesdobrasil.presentation.universities

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.University
import kotlinx.android.synthetic.main.cardview_university.view.*

class UniversitiesAdapter(private val context: Context, private val universities: ArrayList<University>) :
    RecyclerView.Adapter<UniversitiesAdapter.ViewHolder>() {

    private var statePosition = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_university, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return universities.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        statePosition++
        holder.bindView(universities[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(university: University) {
            itemView.textView_universityName.text = university.name
            itemView.textView_universityNeighborhood.text = university.neighborhood
            itemView.textView_universityCity.text = university.city
            itemView.textView_universityCep.text = university.cep
            itemView.textView_universityPhone.text = university.telephone
        }
    }
}
