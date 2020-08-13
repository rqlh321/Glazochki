package ru.gubatenko.glazochki

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val horizontal = findViewById<ImageView>(R.id.horizontal)!!
        val vertical = findViewById<ImageView>(R.id.vertical)!!
        lifecycleScope.launch {
            while (true) {
                horizontal.visibility = View.VISIBLE
                vertical.visibility = View.INVISIBLE
                delay(60)
                horizontal.visibility = View.INVISIBLE
                vertical.visibility = View.VISIBLE
                delay(60)
            }
        }
    }
}
