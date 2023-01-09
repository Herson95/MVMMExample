package com.example.mvvm.domain

import com.example.mvvm.data.QuoteRepository
import com.example.mvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuoteUsesCase @Inject constructor(private  val repository: QuoteRepository) {


    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuote()

}