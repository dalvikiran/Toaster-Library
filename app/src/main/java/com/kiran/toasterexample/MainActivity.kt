package com.kiran.toasterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kiran.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.showToast(this, "Test")

    }
}