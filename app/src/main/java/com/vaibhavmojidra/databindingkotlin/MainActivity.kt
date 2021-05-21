package com.vaibhavmojidra.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.vaibhavmojidra.databindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.submitButton.setOnClickListener {
            greet();
        };
    }

    private fun greet() {
        binding.apply {
            myEditText.text.toString().trim().also { greetTextview.text = it }
        }
    }
}