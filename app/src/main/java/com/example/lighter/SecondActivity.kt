package com.example.lighter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lighter.databinding.ActivityMainBinding
import com.example.lighter.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val color = intent.getStringExtra("color")


        if (color.equals("magenta")) binding.secondConstraintLayout.setBackgroundColor(Color.MAGENTA)
        else if (color.equals("light_gray")) binding.secondConstraintLayout.setBackgroundColor(Color.GRAY)
        else if (color.equals("cyan")) binding.secondConstraintLayout.setBackgroundColor(Color.CYAN)
        else if (color.equals("green")) binding.secondConstraintLayout.setBackgroundColor(Color.GREEN)
        else if (color.equals("white")) binding.secondConstraintLayout.setBackgroundColor(Color.WHITE)
        else if (color.equals("dark_blue")) binding.secondConstraintLayout.setBackgroundColor(Color.BLUE)
        else if (color.equals("red")) binding.secondConstraintLayout.setBackgroundColor(Color.RED)
    }

}