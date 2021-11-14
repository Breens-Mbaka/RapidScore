package com.swift.swiftscore.di

import com.swift.swiftscore.data.remote.SportsDataApi
import com.swift.swiftscore.data.repository.MatchRepositoryImpl
import com.swift.swiftscore.data.repository.StandingsRepositoryImpl
import com.swift.swiftscore.data.repository.StatsRepositoryImpl
import com.swift.swiftscore.domain.repository.MatchRepository
import com.swift.swiftscore.domain.repository.StandingsRepository
import com.swift.swiftscore.domain.repository.StatsRepository
import com.swift.swiftscore.util.Constants.Companion.BASE_URL
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
    fun providesSportsDataApi(): SportsDataApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SportsDataApi::class.java)
    }

    @Provides
    @Singleton
    fun provideMatchesRepository(api: SportsDataApi): MatchRepository {
        return MatchRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideStandingsRepository(api: SportsDataApi): StandingsRepository {
        return StandingsRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideStatsRepository(api: SportsDataApi): StatsRepository {
        return StatsRepositoryImpl(api)
    }
}