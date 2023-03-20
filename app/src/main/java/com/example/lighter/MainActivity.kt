package com.example.lighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lighter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonMagenta.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "magenta")
            startActivity(intent)
        }

        binding.buttonGray.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "light_gray")
            startActivity(intent)
        }

        binding.buttonCyan.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "cyan")
            startActivity(intent)
        }
        binding.buttonGreen.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "green")
            startActivity(intent)
        }
        binding.buttonWhite.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "white")
            startActivity(intent)
        }
        binding.buttonBlue.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "dark_blue")
            startActivity(intent)
        }
        binding.buttonRed.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("color", "red")
            startActivity(intent)
        }
    }
}