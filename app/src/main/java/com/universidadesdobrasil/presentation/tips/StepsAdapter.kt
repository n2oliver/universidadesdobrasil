package com.universidadesdobrasil.presentation.tips

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.models.Step
import kotlinx.android.synthetic.main.cardview_tip.view.*


class StepsAdapter(private val context: Context, private val tips: ArrayList<Step>) :
    RecyclerView.Adapter<StepsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_tip, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return tips.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(tips[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(tip: Step) {
            itemView.textView_tipName.text = tip.title
            itemView.textView_tip.text = tip.content
        }
    }
}
