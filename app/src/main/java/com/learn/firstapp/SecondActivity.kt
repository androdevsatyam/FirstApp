package com.learn.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //todo ?. elvis operator it perform when value !null
        supportActionBar?.title ="SecondActivity"

        Toast.makeText(this,"Welcom",Toast.LENGTH_SHORT).show()
    }
}