package com.ronaldveloz.horoscapp.domain

import com.ronaldveloz.horoscapp.data.network.response.PredictionResponse
import com.ronaldveloz.horoscapp.domain.model.PredictionModel

//Comunicación entre DATA y DOMAIN
interface Repository {
    suspend fun getPrediction(sign:String) : PredictionModel?
}