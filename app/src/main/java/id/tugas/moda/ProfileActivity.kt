package id.tugas.moda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.tugas.moda.databinding.ActivityProfileBinding

/*
* 23 April 2022
* NIM : 10119102
* Nama: Muhammad Alfiqh Nugraha
* Kelas: IF-3
* */

class ProfileActivity : AppCompatActivity() {

    private var binding: ActivityProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.btnBackHome?.setOnClickListener {
            val intent = Intent(this@ProfileActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        Glide.with(this)
            .load(R.drawable.profile)
            .circleCrop()
            .into(binding?.ivProfile!!)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}