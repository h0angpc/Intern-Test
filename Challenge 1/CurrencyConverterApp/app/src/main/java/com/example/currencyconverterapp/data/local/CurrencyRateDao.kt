package com.example.currencyconverterapp.data.local

import androidx.room.Upsert
import com.example.currencyconverterapp.data.local.entity.CurrencyRateEntity
import androidx.room.Query
import androidx.room.Dao

@Dao
interface CurrencyRateDao {

    @Upsert
    suspend fun upsertAll(currencyRateDao: List<CurrencyRateEntity>)

    @Query("SELECT * FROM currencyrateentity")
    suspend fun getAllCurrencyRates(): List<CurrencyRateEntity>
}