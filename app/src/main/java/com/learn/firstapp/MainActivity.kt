package com.learn.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

// by using : we inherit a class in kotlin
class MainActivity : AppCompatActivity() {

    lateinit var share:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo this is how we get reference of views that exist on xml layout file
        val btn = findViewById<Button>(R.id.click);
        val  textView =findViewById<TextView>(R.id.textview);
        share=findViewById(R.id.share)

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

        /*----------- Second Chapter Coding -----------*/
        val change=findViewById<Button>(R.id.change)
        val et=findViewById<EditText>(R.id.sendtext)

        change.setOnClickListener{
            //Explicit Intent
            val transferInte=Intent(this,SecondActivity::class.java)
            transferInte.putExtra("data",et.text.toString())
            startActivity(transferInte)
        }

        share.setOnClickListener() {
            //IMPLICIT Intent
            val intent=Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,et.text.toString())
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Choose App"))
//            startActivity(intent)
        }

    }

    //todo creatingFunction
    fun clickPerform(textView: TextView) {
        Toast.makeText(
            this, "Function Calling", Toast
                .LENGTH_SHORT
        ).show()
        textView.text="Yes Long Clicked!!"
    }

}
