package id.tugas.moda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.tugas.moda.databinding.ActivityMainBinding

/*
* 23 April 2022
* NIM : 10119102
* Nama: Muhammad Alfiqh Nugraha
* Kelas: IF-3
* */

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnProfil?.setOnClickListener {
            val intent = Intent(this@MainActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}