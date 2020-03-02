package com.universidadesdobrasil.presentation.tips

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.universidadesdobrasil.R
import com.universidadesdobrasil.data.models.Step
import com.universidadesdobrasil.data.models.Tip
import kotlinx.android.synthetic.main.cardview_tip.view.*


class TipsAdapter(private val context: Context, private val tips: ArrayList<Tip>) :
    RecyclerView.Adapter<TipsAdapter.ViewHolder>() {

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
        holder.bindView(context, tips[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private fun openTip(context: Context, title: String, steps: ArrayList<Step>){

            val intent = Intent(context, TipsActivity::class.java)
            intent.putExtra("tip_title", title)
            intent.putExtra("tip_steps",  steps)
            startActivity(context, intent, null)
        }
        fun bindView(context: Context, tip: Tip) {
            itemView.textView_tipName.text = tip.title
            itemView.textView_tip.text = tip.content
            itemView.textView_tipName.setOnClickListener {
                openTip(context, tip.title, tip.steps)
            }
            itemView.textView_tip.setOnClickListener {
                openTip(context, tip.title, tip.steps)
            }
        }
    }
}
