package com.example.playas_sm42.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.playas_sm42.R
import com.example.playas_sm42.adaptadores.playa_adaptador

class MasVisitadosFragmento: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        val vista = inflater.inflate(R.layout.fragmento_mas_visitados,container,false)
        val recyclerHorizontal = vista.findViewById<RecyclerView>(R.id.recycler_horizontal_masvisitados)
        recyclerHorizontal.adapter=playa_adaptador()
        return vista
    }
}