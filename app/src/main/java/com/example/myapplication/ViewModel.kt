package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    val liveData = MutableLiveData<String>()
    val liveDataList = MutableLiveData<List<String>>()

}