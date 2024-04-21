package com.dk.viewmodelfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

/**
 * VMFactory
 * 왜 쓰나? 만약 repo에서 네트워크 통신을 하거나, 로컬 db를 뷰모델에 넘겨주고 싶다. 이때 사용하는게 VMFactory
 */
class MainActivity : AppCompatActivity() {

    lateinit var vm : MainViewModel
    lateinit var vmFactory : MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vmFactory = MainViewModelFactory(5000)
        vm = ViewModelProvider(this, vmFactory).get(MainViewModel::class.java)
    }
}