package com.dk.viewmodelfactory

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(num : Int) : ViewModel() {

    init{
        Log.d("MainVM", num.toString())
    }

}