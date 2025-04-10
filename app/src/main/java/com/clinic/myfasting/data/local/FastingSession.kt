package com.clinic.myfasting.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fasting_sessions")
class FastingSession (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val startTime: Long,
    val endTime: Long?,
    val durationMinutes: Int? = null
)