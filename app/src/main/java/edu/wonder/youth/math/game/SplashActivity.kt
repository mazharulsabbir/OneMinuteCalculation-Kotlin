package edu.wonder.youth.math.game

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.postDelayed

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.MODE_NIGHT_YES
        setContentView(R.layout.activity_splash)

        startActivity(Intent(this, MainActivity::class.java))
    }
}
