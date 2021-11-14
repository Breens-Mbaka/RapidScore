package com.swift.swiftscore.domain.use_case

import com.swift.swiftscore.common.Resource
import com.swift.swiftscore.data.remote.dto.matchesdto.toMatch
import com.swift.swiftscore.domain.model.Match
import com.swift.swiftscore.domain.repository.MatchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetMatchesUseCase @Inject constructor(
    private val repository: MatchRepository
){
    operator fun invoke()
    : Flow<Resource<Match>> = flow {
        try {
            emit(Resource.Loading<Match>())
            val match = repository.getMatches().toMatch()
            emit(Resource.Success<Match>(match))
        } catch (e: HttpException) {
            emit(Resource.Error<Match>(e.localizedMessage?:"An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<Match>("Couldn't reach server.Check your internet connection"))
        }
    }
}