package com.clinic.myfasting.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.clinic.myfasting.data.FastingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HistoryModel @Inject constructor(
    private val fastingRepository: FastingRepository
) : ViewModel() {

    val sessions = fastingRepository.getAllSessions().stateIn(
        viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList()
    )
}
