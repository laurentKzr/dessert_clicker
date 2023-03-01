package com.example.dessertclicker.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

data class DessertUiModel(
    val dessertsSold: Int = 0,
    var revenue: Int = 0,
    val currentDessertIndex: Int = 0,
    var currentDessertPrice: Int = 0,
    var currentDessertImageId: Int = 0
)
