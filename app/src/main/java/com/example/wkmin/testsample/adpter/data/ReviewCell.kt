package com.example.wkmin.testsample.adpter.data

import com.google.gson.annotations.SerializedName

data class ReviewCell(
    @SerializedName("cons") var cons: String
) : BaseItem()