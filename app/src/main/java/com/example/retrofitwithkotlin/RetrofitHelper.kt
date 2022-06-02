package com.example.retrofitwithkotlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelpers {

    val Base_Url = "https://www.quotable.io"

    fun getInstance():Retrofit{
        return Retrofit.Builder().baseUrl(Base_Url).addConverterFactory(GsonConverterFactory.create()).build()
    }

}