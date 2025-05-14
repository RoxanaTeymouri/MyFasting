@file:JvmName("TrackerScreenKt")

package com.clinic.myfasting.ui

import androidx.compose.ui.res.colorResource
import com.clinic.myfasting.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.clinic.myfasting.viewModel.TrackerModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color


@Composable
fun TrackerScreen(
    trackerModel: TrackerModel = hiltViewModel(),
    onAddClick: () -> Unit = {}
) {

    Box(modifier = Modifier.fillMaxSize()) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                "Fasting Tracker",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineSmall
            )


        }

        SmallFloatingActionButton(
            onClick = { onAddClick() },
            containerColor = colorResource(id = R.color.green),
            contentColor = Color.White,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Add Some thing")
        }
    }
}