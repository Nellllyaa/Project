package com.example.newbottomnav.retrofit

import retrofit2.Call
import com.example.newbottomnav.pojo.MealList
import retrofit2.http.GET

interface MealApi {
    @GET ("random.php")
    fun getRandomMeal(): Call<MealList>
}