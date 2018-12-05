package com.example.wkmin.testsample

import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    // {'name'='mwk','title'='title','sub'={'name'='sub_name'}}
    @Before
    fun test_isCorrect() {
        val gson = Gson()
        val card = gson.fromJson("{'name'='mwk','title'='title','sub'={}}", Card::class.java)
        println("card:$card")
        println("card:${card.name}")
        println("card:${card.title}")

        println("card_sub:${card.sub}")
        println("card_sub_name:${card.sub.name}")
    }

    data class Card(
        @SerializedName("name") @Expose var name: String,
        @SerializedName("title") var title: String,
        @SerializedName("sub") var sub: SubCard
        ) {
        data class SubCard(
            @SerializedName("name") var name: String
        )
    }
}
