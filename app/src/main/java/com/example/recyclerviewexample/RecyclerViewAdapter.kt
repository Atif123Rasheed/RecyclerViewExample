package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(arrayList: ArrayList<Celeberity>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    private val celebritiesArrayList = arrayList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.image_view, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvname.text = celebritiesArrayList[position].name
        holder.description.text = celebritiesArrayList[position].details
        holder.tvimage.setImageResource(celebritiesArrayList[position].photoID)

    }

    override fun getItemCount(): Int {
        return celebritiesArrayList.size

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvname: TextView = itemView.findViewById(R.id.tv_name)
        var description: TextView = itemView.findViewById(R.id.tv_discription)
        var tvimage: ImageView = itemView.findViewById(R.id.iv_lee_image)
    }

}