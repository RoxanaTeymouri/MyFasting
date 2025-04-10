package com.clinic.myfasting.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [FastingSession::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun fastingSessionDao(): FastingSessionDao
}
