package com.swift.swiftscore.domain.use_case

import com.swift.swiftscore.common.Resource
import com.swift.swiftscore.data.remote.dto.standingsdto.toStandings
import com.swift.swiftscore.domain.model.Standings
import com.swift.swiftscore.domain.repository.StandingsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetTableUseCase @Inject constructor(
    private val repository: StandingsRepository
){
    operator fun invoke()
    : Flow<Resource<Standings>> = flow {
        try {
            emit(Resource.Loading<Standings>())
            val standings = repository.getStandings().toStandings()
            emit(Resource.Success<Standings>(standings))
        } catch (e: HttpException) {
            emit(Resource.Error<Standings>(e.localizedMessage?:"An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<Standings>("Couldn't reach server.Check your internet connection"))
        }
    }
}