package com.kiran.toasterexample

import android.content.Context
import android.widget.Toast

class AppModule {
    companion object{
        fun showToast1(context : Context, message: String){
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}