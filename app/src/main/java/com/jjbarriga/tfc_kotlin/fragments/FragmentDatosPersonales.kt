package com.jjbarriga.tfc_kotlin.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jjbarriga.tfc_kotlin.R
import kotlinx.android.synthetic.main.fragment_datos_personales.*


class FragmentDatosPersonales : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datos_personales, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        acciones()
    }

    private fun acciones() {
        edit_nombre.setOnClickListener {
            nom_usuario?.isEnabled = true
        }
        edit_apellidos.setOnClickListener {
            apellidos_usuario?.isEnabled = true
        }
        edit_tlfno.setOnClickListener {
            telefono_usuario?.isEnabled = true
        }
        edit_rango.setOnClickListener {
            rango_usuario?.isEnabled = true
        }
        actualizar_perfil.setOnClickListener{
            Log.v("datos",
                nom_usuario.text.toString()
                    +" "+apellidos_usuario.text.toString()
                    +" "+telefono_usuario.text.toString()
                    +" "+rango_usuario.text.toString())
        }
    }


}