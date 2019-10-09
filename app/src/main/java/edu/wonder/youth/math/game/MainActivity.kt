package edu.wonder.youth.math.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<CircleImageView>(R.id.avatar)

        Glide.with(this)
            .load(R.drawable.avatar)
            .optionalCenterCrop()
            .into(imageView)

        val fab = findViewById<FloatingActionButton>(R.id.fab_notification)
        fab.setOnClickListener {
            Snackbar.make(fab, "Notification!", Snackbar.LENGTH_SHORT).show()
        }
    }
}
