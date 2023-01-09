package com.example.mvvm.data

import com.example.mvvm.data.model.QuoteModel
import com.example.mvvm.data.model.QuoteProvider
import com.example.mvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor( private val api : QuoteService,private val localQuote: QuoteProvider) {

    suspend fun getAllQuote(): List<QuoteModel>{
        val response : List<QuoteModel> = api.getQuotes()
        localQuote.quotes = response
        return  response
    }

}
