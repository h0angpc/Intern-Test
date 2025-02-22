package com.example.currencyconverterapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.currencyconverterapp.data.local.entity.CurrencyRateEntity

@Database(
    entities = [CurrencyRateEntity::class],
    version = 1
)

abstract class CurrencyRateDatabase: RoomDatabase() {

    abstract val currencyRateDao: CurrencyRateDao
}