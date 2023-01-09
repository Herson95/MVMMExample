package com.example.mvvm.data.network

import com.example.mvvm.core.RetrofitHelper
import com.example.mvvm.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject

class QuoteService @Inject constructor(private val api: IQuoteApiClient) {

    suspend fun getQuotes():List<QuoteModel>{
       return withContext(Dispatchers.IO){
           val response: Response<List<QuoteModel>> = api.getAllQuote()
           response.body()?: emptyList()
       }

    }
}