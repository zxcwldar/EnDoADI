package com.example.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.db.models.WordsModel
import kotlinx.coroutines.flow.Flow
@Dao
interface WordsDao {
    @Insert
    suspend fun insertData(model: WordsModel)

    @Query("SELECT * FROM words_table")
     fun getData(): Flow<List<WordsModel>>

}