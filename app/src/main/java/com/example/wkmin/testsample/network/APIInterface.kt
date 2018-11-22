package com.example.wkmin.testsample.network

import com.example.wkmin.testsample.adpter.data.BaseItemList
import io.reactivex.Single
import retrofit2.http.GET

interface APIInterface {
    @GET("/")
    fun requestList(): Single<BaseItemList>
}