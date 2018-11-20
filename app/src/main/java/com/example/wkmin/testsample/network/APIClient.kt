package com.example.wkmin.testsample.network

import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.adpter.ItemDeserializer
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {

    fun getClient(): Retrofit? {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BASIC
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl("https://api-test-198703.appspot.com/")
            .addConverterFactory(GsonConverterFactory.create(initGson()))
            .client(client)
            .build()
    }

    private fun initGson(): Gson {
        return GsonBuilder()
            .registerTypeAdapter(BaseItem::class.java, ItemDeserializer())
            .create()
    }
}