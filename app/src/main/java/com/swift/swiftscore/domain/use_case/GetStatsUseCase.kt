package com.swift.swiftscore.domain.use_case

import com.swift.swiftscore.common.Resource
import com.swift.swiftscore.data.remote.dto.statsdto.Data
import com.swift.swiftscore.data.remote.dto.statsdto.toStats
import com.swift.swiftscore.domain.model.Stat
import com.swift.swiftscore.domain.repository.StatsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetStatsUseCase @Inject constructor(
    private val repository:StatsRepository
){
    operator fun invoke()
    : Flow<Resource<Stat>> = flow {
        try {
            emit(Resource.Loading<Stat>())
            val stats = repository.getStats().toStats()
            emit(Resource.Success<Stat>(stats))
        } catch (e: HttpException) {
            emit(Resource.Error<Stat>(e.localizedMessage?:"An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<Stat>("Couldn't reach server.Check your internet connection"))
        }
    }
}