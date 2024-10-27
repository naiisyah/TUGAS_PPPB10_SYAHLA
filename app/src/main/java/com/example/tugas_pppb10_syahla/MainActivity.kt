package com.example.tugas_pppb10_syahla

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.tugas_pppb10_syahla.R
import com.example.tugas_pppb10_syahla.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//kode di bawah digunakan untuk menghubungkan bottom navigation view dengan nav controller.
//Nav controller bertanggung jawab untuk mengatur nafigasi antara fragment. dengan menggunakan
//method findNavController yang mendapatkan referensi ke nav controller yg terkaiy dengan nav host fragment
//kemudian akan memanggil setupWithNavController untuk mengatur bottom navigation view.
        with(binding){
            val navController = findNavController(R.id.nav_host_fragment)
            bottomNavigationView.setupWithNavController(navController)
        }
    }
}