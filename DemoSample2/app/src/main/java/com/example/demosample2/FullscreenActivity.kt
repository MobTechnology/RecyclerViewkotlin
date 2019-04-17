package com.example.demosample2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_fullscreen.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class FullscreenActivity : AppCompatActivity() {

    val array: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen)

        array.add("India")
        array.add("Aus")
        array.add("Canada")
        array.add("Punjab")
        array.add("Nepal")
        array.add("Putan")
        array.add("Japan")
        array.add("Shri")
        array.add("Shri Lanka")
        array.add("England")
        array.add("Itali")
        array.add("Itali")

        countryNameList.layoutManager = LinearLayoutManager(this)

        countryNameList.adapter = CountryNameAdapter(array, this)



    }
 }
