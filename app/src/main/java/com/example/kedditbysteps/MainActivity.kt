package com.example.kedditbysteps

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var dollars = 100
    val tax = 3.19
    val discount = 7
    val ok : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view -> Snackbar.make(view,"Yay you clicked me!!",Snackbar.LENGTH_LONG).show() }

        val mTestText = findViewById<TextView>(R.id.tvText)
        dollars = dollars - discount
        Log.d("test",dollars.toString())
        mTestText.setText((dollars+tax).toString())
    }

}
