package com.example.kedditbysteps.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//This class is used as utilities class!
/*
  Extension functions allow us to extend the functionality of a class by adding new functions.
  The class doesn’t have to belongs to us (could it be a third party library) and also without
  requiring us to inherit the class.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}