package com.example.demosample2

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView


class CountryNameAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<CountryHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CountryHolder {


        val inflater = LayoutInflater.from(parent.context)
        return CountryHolder(inflater, parent)
    }



    override fun getItemCount(): Int {
       return items.size
    }



    override fun onBindViewHolder(holder: CountryHolder, p1: Int) {

      val name = items[p1]
      holder.bindView(name)
    }

}

class CountryHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.country_name_item, parent, false)) {
    private var mTitleView: TextView? = null

    init {
        mTitleView = itemView.findViewById(R.id.countryNameTextView)
    }

    fun bindView(name: String) {

        mTitleView?.text = name;

    }

}
