package com.test.bomb0707

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  button = findViewById<Button>(R.id.button)
        val  button2 = findViewById<Button>(R.id.button2)
        val  button3 = findViewById<Button>(R.id.button3)
        val  button4 = findViewById<Button>(R.id.button4)

        //1) 画面遷移
        button.setOnClickListener{
            val intent =Intent(this,SubActivity::class.java)
            startActivity(intent)
        }

        //1) 画面遷移
        button2.setOnClickListener{
            val intent =Intent(this,SubActivity::class.java)
            startActivity(intent)
        }

        //1) 画面遷移
        button3.setOnClickListener{
            val intent =Intent(this,SubActivity::class.java)
            startActivity(intent)
        }

        //1) 画面遷移
        button4.setOnClickListener{
            val intent =Intent(this,SubActivity::class.java)
            startActivity(intent)
        }

}




    }
