package com.example.mvvm.data.network

import com.example.mvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface IQuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuote():Response<List<QuoteModel>>
}