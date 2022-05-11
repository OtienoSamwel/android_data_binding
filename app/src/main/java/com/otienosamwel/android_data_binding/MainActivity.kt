package com.otienosamwel.android_data_binding

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.otienosamwel.android_data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.user = User("Otienosamwel")
        binding.onButtonClick = OnButtonClickListener {
            Toast.makeText(this, "Hello Kotlin", Toast.LENGTH_SHORT).show()
        }
        binding.viewModel = mainViewModel
    }
}