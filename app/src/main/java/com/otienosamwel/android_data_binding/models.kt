package com.otienosamwel.android_data_binding

import android.view.View

data class User(val name: String)

fun interface OnButtonClickListener {
    fun onButtonClick(view: View)
}