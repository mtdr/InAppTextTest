package com.example.paulo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{

//            progressBar2.incrementProgressBy(5)
            progressBar2.progress = 100
            textView.text = "KEK"
        }
    }
}
