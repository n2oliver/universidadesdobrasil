package com.universidadesdobrasil.presentation.states

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.models.State
import com.universidadesdobrasil.data.repositories.UniversityRepository
import com.universidadesdobrasil.presentation.universities.UniversitiesActivity
import kotlinx.android.synthetic.main.cardview_state.view.*

class StatesAdapter(private val context: Context, private val states: List<State>) : RecyclerView.Adapter<StatesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_state, parent, false)
        return ViewHolder(
            view,
            states
        )
    }

    override fun getItemCount(): Int {
        return states.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(states[position])
    }

    class ViewHolder(itemView: View, val states: List<State>) : RecyclerView.ViewHolder(itemView) {

        private fun goToState(view: View, state: State){

            val intent = Intent(view.context, UniversitiesActivity::class.java)
            intent.putExtra("state", state.name)
            intent.putExtra("stateInitials", state.initials)
            startActivity(view.context, intent, null)
        }

        fun bindView(state: State) {
            var universityNumber = ""
            var universityNuberByState = UniversityRepository.getByState(state.name)!!.size
            var i = 0
            universityNuberByState.toString().reversed().forEach {
                if(i == 3){
                    universityNumber += "."
                    i = 0
                }
                universityNumber += it
                i++
            }
            universityNumber = universityNumber.reversed()
            itemView.textView_stateName.text = state.name
            itemView.textView_demography.text = "Existem $universityNumber nessa região."
            itemView.image_imageState.setImageResource(state.image)

            itemView.setOnClickListener {
                goToState(it, state)
            }
        }
    }
}
