package com.ismailmesutmujde.kotlinsimplecalculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinsimplecalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMainActivity : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMainActivity.root
        setContentView(view)


    }

    fun mySum(view : View) {

    }
    fun mySub(view : View) {

    }
    fun myMul(view : View) {

    }
    fun myDiv(view : View) {

    }
}