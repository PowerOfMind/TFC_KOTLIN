package com.jjbarriga.tfc_kotlin.utils

import android.content.Context
import android.widget.Toast

fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) { // length: Int = Toast.LENGTH_SHORT valor por defecto
    Toast.makeText(this, message, length).show()
}