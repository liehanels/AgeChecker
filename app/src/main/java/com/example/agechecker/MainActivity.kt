package com.example.agechecker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//ViewCompat
        //Code goes below here
        //Declarations
        //Elements
        val tvMainTitle = findViewById<TextView>(R.id.tvMainTitle)
        val edtTextMainName = findViewById<EditText>(R.id.edtTextMainName)
        val edtNumMainAge = findViewById<EditText>(R.id.edtNumMainAge)
        val tvMainOutput = findViewById<TextView>(R.id.tvMainOutput)
        val btnMainConfirm = findViewById<Button>(R.id.btnMainConfirm)
        //Variables and Constants
        var name = ""
        var age = 0
        var isOver18 = false
        //Logic
        btnMainConfirm.setOnClickListener()
        {
            //Store input from elements in variables
            name = edtTextMainName.text.toString()
            age = edtNumMainAge.text.toString().toInt()
            //Let's check if the user's age is over 18
            if(age >= 18)
            {
                //User is over 18
                isOver18 = true
            }
            else
            {
                //User is not over 18
                isOver18 = false
            }
            //Now we determine the output based on the user's age
            if(isOver18)
            {
                //isOver18 is true
                tvMainOutput.text = "Hello $name, you are 18 or more years old!"
            }
            else
            {
                //isOver18 is false
                tvMainOutput.text = "Hello $name, you are not over 18 years old!"
            }
        }//btnMainConfirm.setOnClickListener
        //Button click
        //Code goes above here
    }//override fun onCreate
}//class MainActivity