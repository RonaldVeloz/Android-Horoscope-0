package com.ronaldveloz.horoscapp.data.core.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        /* Petición que llegar del servidor */
        val request = chain.request()
            .newBuilder()
            .header("Autorization", "TOKEN").build()
        return chain.proceed(request)
    }
}

