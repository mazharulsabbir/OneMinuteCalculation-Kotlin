package edu.wonder.youth.math.game.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = "local_db")
class LeaderBoardRanking(
    @field:NotNull
    @field:PrimaryKey
    val uId: String,
    val userName: String,
    val score: Int,
    val avatarUrl: String
)
