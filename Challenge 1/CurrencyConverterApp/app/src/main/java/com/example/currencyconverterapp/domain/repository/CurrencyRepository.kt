package com.example.currencyconverterapp.domain.repository

import com.example.currencyconverterapp.domain.model.CurrencyRate
import com.example.currencyconverterapp.domain.model.Resource
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {
    fun getCurrencyRatesList(): Flow<Resource<List<CurrencyRate>>>
}