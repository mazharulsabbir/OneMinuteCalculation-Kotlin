package edu.wonder.youth.math.game.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import edu.wonder.youth.math.game.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        AppCompatDelegate.setDefaultNightMode(
//            AppCompatDelegate.MODE_NIGHT_YES
//        )

        startActivity(Intent(this, MainActivity::class.java))
    }
}
