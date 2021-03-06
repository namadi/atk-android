package com.atakaice.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/api")
    fun getNews(@Query("cursor") after: String,
               @Query("limit") limit: String = "10"): Call<NewsResponse>
}