package com.example.dessertclicker.model

import androidx.lifecycle.ViewModel
import com.example.dessertclicker.data.DessertUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class DessertViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(DessertUiModel())
    val uiState: StateFlow<DessertUiModel> = _uiState.asStateFlow()

}