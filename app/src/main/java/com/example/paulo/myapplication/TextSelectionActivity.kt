package com.example.paulo.myapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ProgressBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_text_selection.*


class TextSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_selection)
        progressBar.visibility = ProgressBar.INVISIBLE
        val text = intent
                .getCharSequenceExtra(Intent.EXTRA_PROCESS_TEXT)
        // process the text
        // here we have highlighted text
        inputText1.setText(text.toString())
        textView2.text = text
        var clickCtr = 0
        button.setOnClickListener {
            if (clickCtr%2 == 0) {
                progressBar.incrementProgressBy(5)
                progressBar.visibility = ProgressBar.VISIBLE
                progressBar.progress = 100
                inputText1.setText("Succcess!")
                clickCtr += 1
                Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show()
                this.finish()
            } else {
                progressBar.visibility = ProgressBar.INVISIBLE
                clickCtr += 1
            }


        }

    }
}