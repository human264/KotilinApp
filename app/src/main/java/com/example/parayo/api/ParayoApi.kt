package com.example.parayo.api

import com.example.parayo.api.response.ApiResponse
import retrofit2.http.GET

interface ParayoApi {

    @GET("/api/bi/hello")
    suspend fun hello(): ApiResponse<String>

    companion object{
        val instance = ApiGenerator().generate(ParayoApi::class.java)
    }
}