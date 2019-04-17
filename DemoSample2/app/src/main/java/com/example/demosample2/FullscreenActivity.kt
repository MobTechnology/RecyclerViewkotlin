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

    val array = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen)

        array.set(0, "India")
        array.set(1, "Aus")
        array.set(2, "Canada")
        array.set(3, "Punjab")
        array.set(4, "Nepal")
        array.set(5, "Putan")
        array.set(6, "Japan")
        array.set(7, "Shri")
        array.set(8, "Shri Lanka")
        array.set(9, "England")
        array.set(10, "Itali")
        array.set(11, "Itali")

        countryNameList.layoutManager = LinearLayoutManager(this)
        countryNameList.layoutManager = GridLayoutManager(this, 2)
        countryNameList.adapter = CountryNameAdapter(array, this)



    }
 }
