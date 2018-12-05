package com.example.wkmin.testsample.view

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wkmin.testsample.R
import com.example.wkmin.testsample.adpter.FlexibleAdapter
import com.example.wkmin.testsample.databinding.ActivityMainBinding
import com.example.wkmin.testsample.network.APIClient
import com.example.wkmin.testsample.network.APIInterface
import com.example.wkmin.testsample.util.inject

class MainActivity : BaseActivity() {

    private val model by lazy {
        MainViewModel(APIClient.getClient().create(APIInterface::class.java)).inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this,
            R.layout.activity_main
        )
        binding.model = model
        binding.list.layoutManager = LinearLayoutManager(this)
        binding.list.adapter = FlexibleAdapter()
    }

}

