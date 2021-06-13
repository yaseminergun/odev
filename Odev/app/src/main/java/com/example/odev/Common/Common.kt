package com.example.odev.Common

import com.example.odev.Interface.RetrofitService
import com.example.odev.Retrofit.RetrofitClient

object Common {
    private val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"

    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}