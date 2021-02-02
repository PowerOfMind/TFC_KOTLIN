package com.jjbarriga.tfc_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import com.jjbarriga.tfc_kotlin.R.string.datos_personales
import com.jjbarriga.tfc_kotlin.R.string.eventos
import com.jjbarriga.tfc_kotlin.databinding.ActivityMainBinding
import com.jjbarriga.tfc_kotlin.fragments.FragmentDatosPersonales
import com.jjbarriga.tfc_kotlin.fragments.FragmentEventos
import com.jjbarriga.tfc_kotlin.utils.toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.header_nav.*
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setSupportActionBar(this.main_toolbar)
        val toggle = ActionBarDrawerToggle(
                this,
            this.drawer_layout,
                main_toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.isDrawerIndicatorEnabled
        toggle.syncState()

        instancias()
        acciones()
    }

    private fun instancias() {

    }

    private fun acciones() {

        navigation.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_datos ->{
                    main_toolbar.title = getString(datos_personales)
                    texto_header.text = getString(datos_personales)
                    replaceFragment(FragmentDatosPersonales())
                }
                R.id.item_eventos -> {
                    toast("eventos")
                    main_toolbar.title = getString(eventos)
                    texto_header.text = getString(eventos)
                    replaceFragment(FragmentEventos())
                }
                R.id.item_conocimientos -> {
                    main_toolbar.title = "conocimientos"
                }
                R.id.item_contactos -> {
                    main_toolbar.title = "contactos"
                }
                R.id.item_docs -> {
                    main_toolbar.title = "docs"
                }
            }
            true
        }


    }

    private fun replaceFragment(fragment:Fragment){
        val fragmentTransaction =  supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.sitio_fragments, fragment)
        fragmentTransaction.commit()
    }


}



