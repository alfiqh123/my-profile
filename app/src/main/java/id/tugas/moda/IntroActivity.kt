package id.tugas.moda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.tugas.moda.databinding.ActivityIntroBinding

/*
* 23 April 2022
* NIM : 10119102
* Nama: Muhammad Alfiqh Nugraha
* Kelas: IF-3
* */

class IntroActivity : AppCompatActivity() {

    private var binding: ActivityIntroBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnStart?.setOnClickListener {
            val intent = Intent(this@IntroActivity, LoginActivity::class.java)
            startActivity(intent)
            finish();
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}