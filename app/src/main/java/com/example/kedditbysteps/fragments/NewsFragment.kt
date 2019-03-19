package com.example.kedditbysteps.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kedditbysteps.R
import com.example.kedditbysteps.commons.inflate

//This import is used so we can use elements directly from our layout
import kotlinx.android.synthetic.main.news_fragment.*

class NewsFragment : Fragment(){

    /*
    Delegated Properties are an excellent way to reuse common behavior that you may recurrently need for a property.
    In Kotlin you already have some common delegated properties defined in the language (also you can create your own).
    Here we are going to use this existing delegated property:

    Lazy properties: The value gets computed only upon first access. This is a great delegated property that we are
    going to use to avoid initializing our newsList as a nullable object.
     */
    private val newsList by lazy {
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.news_fragment)


        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //This lazy execution can be initialized here
//        newsList.setHasFixedSize(true) // <-- Lazy executed!
//        newsList.layoutManager = LinearLayoutManager(context)
    }
}