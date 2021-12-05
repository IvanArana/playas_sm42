package com.example.playas_sm42

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.playas_sm42.fragmentos.MasVisitadosFragmento

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //traer fragmento plasyas mas visitadas

        val transaccion=supportFragmentManager.beginTransaction()
        transaccion.replace(R.id.contenedor_fragmento,MasVisitadosFragmento())
        transaccion.commit()
    }
}