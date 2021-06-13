package com.example.odev.Interface

import com.example.odev.Model.Users
import retrofit2.Call
import retrofit2.http.GET
interface RetrofitService {
    @GET("users")
    fun getdata(): Call<MutableList<Users>>
}