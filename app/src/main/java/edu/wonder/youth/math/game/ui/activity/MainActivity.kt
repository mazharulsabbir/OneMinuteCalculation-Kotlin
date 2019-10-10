package edu.wonder.youth.math.game.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import de.hdodenhof.circleimageview.CircleImageView
import edu.wonder.youth.math.game.R
import edu.wonder.youth.math.game.view.model.LiveScore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val score: Int = LiveScore().score

        val imageView = findViewById<CircleImageView>(R.id.avatar)

        Glide.with(this)
            .load(R.drawable.avatar)
            .optionalCenterCrop()
            .into(imageView)


        findViewById<FloatingActionButton>(R.id.fab_play_btn).setOnClickListener {
            Snackbar.make(it, "Play!", Snackbar.LENGTH_SHORT).show()
        }

        findViewById<FloatingActionButton>(R.id.fab_history_btn).setOnClickListener {
            Snackbar.make(it, "History!", Snackbar.LENGTH_SHORT).show()
        }

        findViewById<FloatingActionButton>(R.id.fab_leaderboard_btn).setOnClickListener {
            startActivity(Intent(this, LeaderBoardActivity::class.java))
        }
    }
}
