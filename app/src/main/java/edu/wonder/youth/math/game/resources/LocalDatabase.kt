package edu.wonder.youth.math.game.resources

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.wonder.youth.math.game.model.LeaderBoardRanking

@Database(entities = arrayOf(LeaderBoardRanking::class), version = 1)
abstract class LocalDatabase : RoomDatabase() {


}
