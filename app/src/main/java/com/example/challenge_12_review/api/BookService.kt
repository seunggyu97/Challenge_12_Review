package com.example.challenge_12_review.api

import com.example.challenge_12_review.model.BestSellerDto
import com.example.challenge_12_review.model.SearchBookDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET("/api/search.api?output=json")
    fun getBookByName(
        @Query("key") apiKey : String,
        @Query("query") keyword : String
    ) : Call<SearchBookDto>

    @GET("/api/bestSeller.api?output=json&categoryId=100")
    fun getBestSellerBooks(
        @Query("key") apiKey : String
    ) : Call<BestSellerDto>
}