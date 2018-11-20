package com.example.wkmin.testsample.adpter.data

import com.google.gson.annotations.SerializedName

class CompanyCell(
    @SerializedName("name") var name: String
) : BaseItem()