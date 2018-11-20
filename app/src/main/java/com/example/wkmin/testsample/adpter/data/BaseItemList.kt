package com.example.wkmin.testsample.adpter.data

import com.google.gson.annotations.SerializedName

data class BaseItemList(
    @SerializedName("total_page") var totalPage: Int,
    @SerializedName("items") var items: ArrayList<BaseItem>
    )