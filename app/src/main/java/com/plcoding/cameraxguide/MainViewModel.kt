package com.plcoding.cameraxguide

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    private val _bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())
    private val _names = MutableStateFlow<List<String>>(emptyList())
    val bitmaps = _bitmaps.asStateFlow()
    val names = _names.asStateFlow()

    fun onTakePhoto(bitmap: Bitmap, shape: String) {
        _bitmaps.value += bitmap
        _names.value += shape
    }
}