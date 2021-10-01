package com.example.indepthrecyclerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.indepthrecyclerview.databinding.ActivityMainBinding
import com.example.indepthrecyclerview.hetrogenousrv.ui.HeterogenousActivity
import com.example.indepthrecyclerview.linearrv.ui.LinearActivity
import com.example.indepthrecyclerview.nestedrv.ui.NestedActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()

    }

    private fun initViews() {

        binding.linearBtn.setOnClickListener {
            val newActivity = LinearActivity::class.java

            startNewActivity(newActivity)
        }

        binding.heterogenousBtn.setOnClickListener {
            val newActivity = HeterogenousActivity::class.java

            startNewActivity(newActivity)
        }

        binding.nestedBtn.setOnClickListener {
            val newActivity = NestedActivity::class.java

            startNewActivity(newActivity)
        }

    }

    private fun <T> startNewActivity(newActivity: Class<T>) {

        startActivity(Intent(this, newActivity))

    }
}