package edu.wonder.youth.math.game.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.wonder.youth.math.game.R
import edu.wonder.youth.math.game.adapter.LeaderBoardAdapter
import edu.wonder.youth.math.game.model.LeaderBoardRanking
import java.util.*
import java.util.logging.Logger
import kotlin.collections.ArrayList

class LeaderBoardActivity : AppCompatActivity() {
    private var TAG = "LeaderBoardActivity"

    private lateinit var dataList: ArrayList<LeaderBoardRanking>

    private lateinit var leaderBoardAdapter: LeaderBoardAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        dataList = ArrayList()
        dataSet()
        init()
    }

    private fun init() {
        leaderBoardAdapter = LeaderBoardAdapter(dataList, this)

        var recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.setHasFixedSize(true)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = leaderBoardAdapter
        }

    }

    private fun dataSet() {

        dataList.add(LeaderBoardRanking("Liam", "Liam", 87273, ""))
        dataList.add(LeaderBoardRanking("Noah", "Noah", 234, ""))
        dataList.add(LeaderBoardRanking("Will", "William", 874392, ""))
        dataList.add(LeaderBoardRanking("Jame", "James", 234, ""))
        dataList.add(LeaderBoardRanking("Oliv", "Oliver", 546, ""))
        dataList.add(LeaderBoardRanking("Benj", "Benjamin", 3453, ""))
        dataList.add(LeaderBoardRanking("Elij", "Elijah", 63356, ""))
        dataList.add(LeaderBoardRanking("Luca", "Lucas", 345, ""))
        dataList.add(LeaderBoardRanking("Maso", "Mason", 12087, ""))
        dataList.add(LeaderBoardRanking("Loga", "Logan", 345, ""))
        dataList.add(LeaderBoardRanking("Alex", "Alexander", 122, ""))
        dataList.add(LeaderBoardRanking("Etha", "Ethan", 645675, ""))
        dataList.add(LeaderBoardRanking("Jaco", "Jacob", 12087232, ""))
        dataList.add(LeaderBoardRanking("Mich", "Michael", 5544, ""))
        dataList.add(LeaderBoardRanking("Dani", "Daniel", 1208720, ""))
        dataList.add(LeaderBoardRanking("Henr", "Henry", 345346, ""))
        dataList.add(LeaderBoardRanking("Jack", "Jackson", 1208723235, ""))
        dataList.add(LeaderBoardRanking("Seba", "Sebastian", 1208723235, ""))
        dataList.add(LeaderBoardRanking("Aide", "Aiden", 1208723235, ""))

        dataList.sortedWith(compareBy({ it.score })).forEach {
            Logger.getLogger(it.score.toString())
            Log.d(TAG, it.score.toString())
        }
    }

    fun <T> compareBy(vararg selectors: (T) -> Comparable<*>?): Comparator<T> {
        return object : Comparator<T> {
            public override fun compare(a: T, b: T): Int = compareValuesBy(a, b, *selectors)
        }
    }
}
