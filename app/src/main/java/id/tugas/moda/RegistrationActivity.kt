package id.tugas.moda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.tugas.moda.databinding.ActivityRegistrationBinding

/*
* 23 April 2022
* NIM : 10119102
* Nama: Muhammad Alfiqh Nugraha
* Kelas: IF-3
* */

class RegistrationActivity : AppCompatActivity() {

    private var binding: ActivityRegistrationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnBackLogin?.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding?.btnRegis?.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}