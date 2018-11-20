package com.example.wkmin.testsample.adpter

import com.example.wkmin.testsample.adpter.data.BaseItem
import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class ItemDeserializer : JsonDeserializer<BaseItem> {

    private val gson = Gson()

    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): BaseItem {

        lateinit var item: BaseItem

        val jsonObject = json?.asJsonObject

        try {
            jsonObject?.has("cell_type")?.let {
                val itemType = jsonObject.get("cell_type").asString
                val classType = ItemType.Type.valueOf(itemType)
                item = gson.fromJson(json, classType.dataJavaClass)
                item.type = classType
            }
        } catch (e: Exception) {
            // Enum 에 필요한 값이 없을 경우 java.lang.IllegalArgumentException 발생함.
            println(e)
            item = BaseItem()
        }
        return item
    }
}