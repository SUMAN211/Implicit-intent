package com.example.implicitintent1

import android.app.Activity
import android.app.ActivityManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var tv1:TextView
    lateinit var tv2:TextView
    lateinit var tv3:TextView
    lateinit var tv4:TextView
    lateinit var tv5:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tv1.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:919876543245")
            startActivity(intent)
        }
        binding.tv2.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
            intent.data=Uri.parse("sms:919876543245")
            startActivity(intent)
        }
        binding.tv3.setOnClickListener {
            val intent=Intent(Intent.ACTION_SENDTO)
            intent.data=Uri.parse("mailto:sum@gmail.com")
            startActivity(intent)
        }
        binding.tv4.setOnClickListener {
            val intent=Intent(Intent.ACTION_SEND)
        }
        binding.tv5.setOnClickListener {
            val intent2=Intent(Intent.ACTION_SEND)
        }

    }
}
