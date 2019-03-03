package com.knir.productivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startTimer(view : View){
        tv_main_timer.text = "Started"
    }

    fun stopTimer(view : View){
        tv_main_timer.text = "Stopped"
    }

    fun resetTimer(view : View){
        tv_main_timer.text = "default"
    }
}
