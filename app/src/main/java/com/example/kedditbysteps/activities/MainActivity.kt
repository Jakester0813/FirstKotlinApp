package com.example.kedditbysteps.activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.util.Log
import android.widget.TextView
import com.example.kedditbysteps.R

class MainActivity : AppCompatActivity() {

    var dollars = 100
    val tax = 3.19
    val discount = 7
    val ok : String? = null

    //Elvis operator ?: - syntax for alternate value if the value is null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view -> Snackbar.make(view,"Yay you clicked me!!",Snackbar.LENGTH_LONG).show() }

        val mTestText = findViewById<TextView>(R.id.tvText)
        dollars = dollars - discount
        Log.d("test",dollars.toString())
        mTestText.setText((dollars+tax).toString())

        //Best use of null checking
        val context : Context? = null
        if (context != null) {
            val res = context.getResources()    // Don't need '?' anymore
            val appName = res.getString(R.string.app_name)
            val shortName = appName.substring(0, 2)
        }
        val contextTwo : Context? = null
        contextTwo?.let {
            val res = contextTwo.getResources()    // Don't need '?' anymore
            val appName = res.getString(R.string.app_name)
            val shortName = appName.substring(0, 2)
        }

    }

    fun changeFragment (f: Fragment, cleanStack:Boolean = false){
        val fragmentTransaction = supportFragmentManager.beginTransaction();
        if(cleanStack){
            clearBackStack()
        }
    }

    fun clearBackStack() {
        val manager = supportFragmentManager
        if (manager.backStackEntryCount > 0) {
            val first = manager.getBackStackEntryAt(0)
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }




}
