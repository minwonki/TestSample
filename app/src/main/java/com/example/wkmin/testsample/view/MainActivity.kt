package com.example.wkmin.testsample.view

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.wkmin.testsample.R
import com.example.wkmin.testsample.adpter.FlexibleAdapter
import com.example.wkmin.testsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val model by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )
        binding.model = model
        binding.list.layoutManager = LinearLayoutManager(this)
        binding.list.adapter = FlexibleAdapter()
    }

}
