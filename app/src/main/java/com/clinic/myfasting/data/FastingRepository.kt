package com.clinic.myfasting.data

import com.clinic.myfasting.data.local.FastingSession
import com.clinic.myfasting.data.local.FastingSessionDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FastingRepository @Inject constructor(
    private val dao: FastingSessionDao
) {
    fun getAllSessions() = dao.getAllSessions()
    suspend fun addUser(fastingSession: FastingSession) = dao.insertSession(fastingSession)
}
