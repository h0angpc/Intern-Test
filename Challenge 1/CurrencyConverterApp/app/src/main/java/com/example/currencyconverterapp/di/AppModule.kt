package com.example.currencyconverterapp.di

import android.app.Application
import androidx.room.Room
import com.example.currencyconverterapp.data.local.CurrencyRateDatabase
import com.example.currencyconverterapp.data.remote.CurrencyAPI
import com.example.currencyconverterapp.data.repository.CurrencyRepositoryImpl
import com.example.currencyconverterapp.domain.repository.CurrencyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCurrencyApi(): CurrencyAPI {
        val retrofit = Retrofit
            .Builder()
            .baseUrl(CurrencyAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(CurrencyAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideDatabase(application: Application): CurrencyRateDatabase {
        return Room
            .databaseBuilder(
                application,
                CurrencyRateDatabase::class.java,
                "currency_db"
            )
            .build()
    }

    @Provides
    @Singleton
    fun provideRepository(
        api: CurrencyAPI,
        db: CurrencyRateDatabase
    ):CurrencyRepository {
        return CurrencyRepositoryImpl(
            api = api,
            dao = db.currencyRateDao
        )
    }
}