package com.example.wkmin.testsample.view

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import com.example.wkmin.testsample.adpter.data.BaseItem
import com.example.wkmin.testsample.adpter.data.BaseItemList
import com.example.wkmin.testsample.network.APIClient
import com.example.wkmin.testsample.network.APIInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : BaseViewModel() {

    val items = ObservableArrayList<BaseItem>()
    var title = ObservableField<String>("")

    init {
        requestList()
    }

    private fun requestList() {
        val service = APIClient.getClient()?.create(APIInterface::class.java)

        service?.requestList()?.enqueue(object : Callback<BaseItemList> {
            override fun onFailure(call: Call<BaseItemList>, t: Throwable) {
                println("onFailure")

            }

            override fun onResponse(call: Call<BaseItemList>, response: Response<BaseItemList>) {
                println("onResponse")
                val body = response.body()
                items.addAll(body?.items!!)
                println("onResponse item.size:${items.size}")
            }
        })

    }
}