package com.example.currencyconverterapp.data.remote

import com.example.currencyconverterapp.data.remote.dto.CurrencyDto
import retrofit2.http.GET
import retrofit2.http.Query


interface CurrencyAPI {

    @GET("v1/latest")
    suspend fun getLatestRates(
        @Query("apiKey") apiKey: String = API_KEY
    ): CurrencyDto

    companion object {
        const val API_KEY = "fca_live_wnyydYZVUoRJSec1EjMGUtK7oIp9NvktSScmNZWd"
        const val BASE_URL = "https://api.freecurrencyapi.com/"
    }
}