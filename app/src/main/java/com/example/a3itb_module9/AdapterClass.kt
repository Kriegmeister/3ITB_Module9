package com.example.a3itb_module9

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class AdapterClass(var dataList : ArrayList<DataClass>) : RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {
    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView){
        var rvImage : ImageView = itemView.findViewById(R.id.recyclerImage)
        var rvTitle : TextView = itemView.findViewById(R.id.recyclerTitle)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(p0.context).inflate(R.layout.item_layout, p0, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(p0: ViewHolderClass, p1: Int) {
       val currentItems = dataList[p1]
        p0.rvImage.setImageResource(currentItems.dataImage)
        p0.rvTitle.text = currentItems.dataTitle
    }
}