package edu.wonder.youth.math.game.repository

import androidx.lifecycle.LiveData
import edu.wonder.youth.math.game.model.LeaderBoardRanking
import edu.wonder.youth.math.game.resources.LeaderBoardDao

class LeaderBoardRepository(private val dao:LeaderBoardDao) {

    val leaderBoard: LiveData<List<LeaderBoardRanking>> = dao.leaderBoard()

    suspend fun insert(leaderBoardRanking: LeaderBoardRanking){
        dao.insert(leaderBoardRanking)
    }
}
