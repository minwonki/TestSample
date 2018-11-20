package com.example.wkmin.testsample.adpter.data

import com.example.wkmin.testsample.adpter.ItemType
import com.google.gson.annotations.SerializedName

open class BaseItem (
    @SerializedName("cell_type") var cellType: String = "",
    var type: ItemType.Type = ItemType.Type.NOT_SUPPORT
    )

