package edu.wonder.youth.math.game.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.wonder.youth.math.game.R
import edu.wonder.youth.math.game.adapter.LeaderBoardAdapter
import edu.wonder.youth.math.game.model.LeaderBoardRanking
import edu.wonder.youth.math.game.view.model.LiveScoreViewModel

class LeaderBoardActivity : AppCompatActivity() {

    private lateinit var dataList: List<LeaderBoardRanking>

    private lateinit var leaderBoardAdapter: LeaderBoardAdapter

    private lateinit var liveScoreViewModel: LiveScoreViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        dataList = ArrayList()

        liveScoreViewModel = ViewModelProviders.of(this).get(LiveScoreViewModel::class.java)

        liveScoreViewModel.fullList.observe(this, Observer { list ->
            list?.let {
                leaderBoardAdapter = LeaderBoardAdapter(it, this)

                var recyclerView: RecyclerView = findViewById(R.id.recycler_view)

                recyclerView.setHasFixedSize(true)

                recyclerView.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = leaderBoardAdapter
                }
            }
        })
    }
}
