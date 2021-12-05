package com.example.playas_sm42.adaptadores

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.playas_sm42.R

class playa_adaptador:RecyclerView.Adapter<playa_adaptador.ViewHolder>() {
    class ViewHolder(vista: View):RecyclerView.ViewHolder(vista){
        //componentes a controlar xd
        val fotoPlayita=vista.findViewById<ImageView>(R.id.fotoPlayita)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //agrega el layout
        val vista=LayoutInflater.from(parent.context).inflate(R.layout.layout_playitas_item,parent,false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }
}