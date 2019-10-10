package edu.wonder.youth.math.game.resources

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao
import edu.wonder.youth.math.game.model.LeaderBoardRanking

@Dao
interface Dao {

    @Insert
    fun insert(leaderBoardRanking: LeaderBoardRanking)

    @Update
    fun update(leaderBoardRanking: LeaderBoardRanking)

    @Delete
    fun delete(leaderBoardRanking: LeaderBoardRanking)

    @Query("SELECT * FROM local_db ORDER BY score DESC")
    fun leaderBoard(): LiveData<ArrayList<LeaderBoardRanking>>

}
