package edu.wonder.youth.math.game.resources

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import edu.wonder.youth.math.game.model.LeaderBoardRanking
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Database(entities = [LeaderBoardRanking::class], version = 1, exportSchema = false)
abstract class LocalDatabase : RoomDatabase() {

    abstract fun leaderBoardRankingDao(): LeaderBoardDao

    companion object {

        @Volatile
        private var INSTANCE: LocalDatabase? = null

        fun getInstance(context: Context): LocalDatabase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LocalDatabase::class.java,
                    "word_database"
                )
                    .addCallback(roomCallBack)
                    .build()
                INSTANCE = instance
                // return instance
                instance
            }
        }


        private val roomCallBack = object : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                LeaderBoardDBCallback(INSTANCE!!).execute()
            }
        }

        private class LeaderBoardDBCallback(roomDatabase: LocalDatabase) : AsyncTask<Void, Void, Void>() {
            var leaderBoardRanking: LeaderBoardDao = roomDatabase.leaderBoardRankingDao()

            override fun doInBackground(vararg params: Void?): Void? {
                leaderBoardRanking.deleteAll()

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "mazharulsabbir",
                        "Mazharul Sabbir",
                        1048923,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "rsrobin",
                        "Rs Robin",
                        12232923,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "ahsan",
                        "Ahsan",
                        4298223,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "siddiq",
                        "Ab Siddique",
                        898234,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "mjmilon",
                        "Mj Milon",
                        9342841,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "ashikmahmudraju",
                        "Ashik Mahmud Raju",
                        9232923,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "jakaraiahossainliton",
                        "Jakaria Hossain Liton",
                        14932923,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "shishir",
                        "Mazharul Islam Shishir",
                        62232923,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "ashikurrahman",
                        "Adnan",
                        9332923,
                        ""
                    )
                )

                leaderBoardRanking.insert(
                    LeaderBoardRanking(
                        "Liam",
                        "Liam",
                        87273,
                        ""
                    )
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Noah", "Noah", 234, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Will", "William", 874392, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Jame", "James", 234, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Oliv", "Oliver", 546, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Benj", "Benjamin", 3453, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Elij", "Elijah", 63356, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Luca", "Lucas", 345, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Maso", "Mason", 12087, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Loga", "Logan", 345, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Alex", "Alexander", 122, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Etha", "Ethan", 645675, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Jaco", "Jacob", 12087232, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Mich", "Michael", 5544, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Dani", "Daniel", 1208720, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Henr", "Henry", 345346, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Jack", "Jackson", 1208723235, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Seba", "Sebastian", 1208723235, "")
                )
                leaderBoardRanking.insert(
                    LeaderBoardRanking("Aide", "Aiden", 1208723235, "")
                )

                return null
            }

        }
    }
}
