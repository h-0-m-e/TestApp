package ru.h0me.testapp.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.h0me.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
