package com.olivercastilho.universidadesdobrasil.presentation.tips

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.olivercastilho.universidadesdobrasil.R
import com.olivercastilho.universidadesdobrasil.data.models.Tip
import kotlinx.android.synthetic.main.cardview_tip.view.*

class TipsAdapter(private val context: Context, private val tips: ArrayList<Tip>) :
    RecyclerView.Adapter<TipsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cardview_tip, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tips.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(tips[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(tip: Tip) {
            itemView.textView_tipName.text = tip.title
            itemView.textView_tip.text = tip.content
        }
    }
}
