package com.example.latihanparsingapipublik.network

import com.example.latihanparsingapipublik.model.ResponseUser
import okhttp3.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/users")
    fun getListUsers(@Query("page") page: String): Call<ResponseUser>


}