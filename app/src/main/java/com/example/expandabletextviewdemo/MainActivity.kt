package com.example.expandabletextviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.OvershootInterpolator
import android.widget.TextView
import at.blogc.android.views.ExpandableTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init here
        val expand_tv = findViewById<ExpandableTextView>(R.id.expandableTextView)
        val tv_toggle = findViewById<TextView>(R.id.tv_btn)

        //setting animation
        expand_tv.setAnimationDuration(750L)


        //setting interpolation
        expand_tv.setInterpolator(OvershootInterpolator())

        //checking status of the unexpanded txt and set the new status
        //also set txt on toggle
        tv_toggle.setOnClickListener(){

            if(expand_tv.isExpanded){
                expand_tv.collapse()
                tv_toggle.setText(R.string.see_more)
            }
            else{
                expand_tv.expand()
                tv_toggle.setText(R.string.see_less)
            }

        }



    }
}