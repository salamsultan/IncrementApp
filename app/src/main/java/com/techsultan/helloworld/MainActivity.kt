package com.techsultan.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var add = findViewById<Button>(R.id.btn)

        add.setOnClickListener{
            increment()
        }


    }

    private fun increment(){

        var increase = 0;

        increase++

        findViewById<TextView>(R.id.tv).text = increase.toString()
    }

}

