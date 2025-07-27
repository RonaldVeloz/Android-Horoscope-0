package com.ronaldveloz.horoscapp.data

import android.util.Log
import com.ronaldveloz.horoscapp.data.network.HoroscopeApiService
import com.ronaldveloz.horoscapp.data.network.response.PredictionResponse
import com.ronaldveloz.horoscapp.domain.Repository
import com.ronaldveloz.horoscapp.domain.model.PredictionModel

import retrofit2.Response
import javax.inject.Inject

//Implementación de la interfaz Repository
class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        //Llamar a Retrofit.
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("RV", "Error $ { it.message }") }
        return null
    }
}