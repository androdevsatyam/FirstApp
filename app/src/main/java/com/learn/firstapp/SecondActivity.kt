package com.learn.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //todo ?. elvis operator it perform when value !null
        supportActionBar?.title ="SecondActivity"
        /*val*/ textView = findViewById<TextView>(R.id.textview);

        val bundle:Bundle?=intent.extras

        var value= bundle!!.getString("data")

        Toast.makeText(this,""+value,Toast.LENGTH_SHORT).show()

        textView.text=value

    }
}