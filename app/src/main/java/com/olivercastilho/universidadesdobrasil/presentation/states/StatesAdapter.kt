package com.olivercastilho.universidadesdobrasil.presentation.states

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.State
import com.olivercastilho.universidadesdobrasil.presentation.universities.UniversitiesActivity
import kotlinx.android.synthetic.main.cardview_state.view.*

class StatesAdapter(private val context: Context, private val states: List<State>) : RecyclerView.Adapter<StatesAdapter.ViewHolder>() {

    private var statePosition = 0
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
        statePosition++
        holder.bindView(states[position], "${position+1}º - ", context)
    }

    class ViewHolder(itemView: View, val states: List<State>) : RecyclerView.ViewHolder(itemView) {

        private fun goToState(view: View, state: State){

            val intent = Intent(view.context, UniversitiesActivity::class.java)
            intent.putExtra("state", state.name)
            intent.putExtra("stateInitials", state.initials)
            startActivity(view.context, intent, null)
        }

        fun bindView(state: State, statePosition: String, context: Context) {
            var graduatedNumber = ""
            var i = 0
            state.graduatedNumber.toString().reversed().forEach {
                if(i == 3){
                    graduatedNumber += "."
                    i = 0
                }
                graduatedNumber += it
                i++
            }
            graduatedNumber = graduatedNumber.reversed()
            itemView.textView_stateName.text = state.name
            itemView.textView_graduatedNumber.text = "$graduatedNumber graduados"
            itemView.image_imageState.setImageResource(state.image)
            itemView.textView_statePosition.text = statePosition
            itemView.textView_demography.text = "${state.demography}% da população com nível superior"

            itemView.setOnClickListener {
                goToState(it, state)
            }
        }
    }
}