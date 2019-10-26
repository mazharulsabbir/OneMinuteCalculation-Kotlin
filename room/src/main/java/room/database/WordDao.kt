package room.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Word)

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords():LiveData<List<Word>>


    @Query("DELETE FROM word_table")
    suspend fun deleteAll()
}
