package edu.wonder.youth.math.game.view.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import edu.wonder.youth.math.game.model.LeaderBoardRanking
import edu.wonder.youth.math.game.repository.LeaderBoardRepository
import edu.wonder.youth.math.game.resources.LocalDatabase
import kotlinx.coroutines.launch

class LiveScoreViewModel(application: Application) : AndroidViewModel(application) {
    val score: Int = 0
    val highScore: Int = 0

    private val repository: LeaderBoardRepository
    val fullList: LiveData<List<LeaderBoardRanking>>


    init {
        val rankingDao = LocalDatabase.getInstance(application).leaderBoardRankingDao()
        repository = LeaderBoardRepository(rankingDao)
        fullList = repository.leaderBoard
    }

    fun insert(leaderBoardRanking: LeaderBoardRanking) = viewModelScope.launch {
        repository.insert(leaderBoardRanking)
    }
}
