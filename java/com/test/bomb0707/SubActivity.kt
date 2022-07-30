package com.test.bomb0707

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val uri: Uri = Uri.parse("https://lin.ee/YbCtOoG")
        val  button7 = findViewById<Button>(R.id.button)


        //1) 画面遷移
        /*button7.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }*/
    }
}