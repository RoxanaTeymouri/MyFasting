package com.clinic.myfasting.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.clinic.myfasting.data.local.FastingSession
import com.clinic.myfasting.viewModel.HistoryModel



@Composable
fun HistoryScreen(historyModel: HistoryModel = hiltViewModel()) {
    val sessionList by historyModel.sessions.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            "Fasting History",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineSmall
        )

        LazyColumn {
            item {
                ListItems(sessionList)
            }
        }
    }
}

@Composable
fun ListItems(list: List<FastingSession>) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        list.forEach { session ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Start Time: ${session.startTime}",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}
