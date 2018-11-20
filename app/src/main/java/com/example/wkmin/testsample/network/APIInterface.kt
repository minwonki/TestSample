package com.example.wkmin.testsample.network

import com.example.wkmin.testsample.adpter.data.BaseItemList
import retrofit2.Call
import retrofit2.http.GET

interface APIInterface {
    @GET("/")
    fun requestList(): Call<BaseItemList>
}