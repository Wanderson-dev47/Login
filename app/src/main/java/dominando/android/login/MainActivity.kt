package dominando.android.login

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dominando.android.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvRegistra.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            val anim = ActivityOptions.makeCustomAnimation(
                applicationContext,
                R.anim.slide_in_right, R.anim.slide_out_left
            ).toBundle()

            startActivity(intent, anim)
        }

    }
}