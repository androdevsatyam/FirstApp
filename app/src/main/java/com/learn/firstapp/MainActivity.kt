package com.learn.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// by using : we inherit a class in kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //todo this is how we get reference of views that exist on xml layout file
        val btn = findViewById<Button>(R.id.click);
        val  textView =findViewById<TextView>(R.id.textview);

        //todo this is Click Listener old_style
         btn.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                this, "Btn Clicked", Toast
                    .LENGTH_SHORT
            ).show()
             textView.text="I Do It Yeay!";
         })

        /*todo this is Click Listener
        *  lamda expression
        * */
        btn.setOnLongClickListener {
            clickPerform(textView)
            true
        }
    }

    //todo creatingFunction
    fun clickPerform(textView: TextView) {
        Toast.makeText(
            this, "Function Calling", Toast
                .LENGTH_SHORT
        ).show()
        textView.text="Yes Long Clicked!!";
    }


}