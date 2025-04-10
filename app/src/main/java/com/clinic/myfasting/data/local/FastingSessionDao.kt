package com.clinic.myfasting.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FastingSessionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSession(fastingSession: FastingSession): Long

    @Query("SELECT * FROM fasting_sessions")
    fun getAllSessions(): Flow<List<FastingSession>>

    @Delete
    suspend fun deleteSessions(fastingSession: FastingSession)
}