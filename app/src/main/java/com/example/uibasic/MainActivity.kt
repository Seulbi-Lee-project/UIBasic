package com.example.uibasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_views)
    }

    fun doActon(v:View){
        Toast.makeText(this, "Submitted Successfully", Toast.LENGTH_SHORT).show()
    }
}