package com.ronaldveloz.horoscapp.data.network

import com.ronaldveloz.horoscapp.data.network.response.PredictionResponse
import com.ronaldveloz.horoscapp.domain.model.HoroscopeModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {
    @GET("/{sign}")
    //Corrutina
    suspend fun getHoroscope(@Path("sign") sign: String): PredictionResponse

}