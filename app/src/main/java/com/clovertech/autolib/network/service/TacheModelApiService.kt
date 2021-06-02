package com.clovertech.autolib.network.service

import com.clovertech.autolib.model.TacheModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface TacheModelApiService {
    @GET("taskModel/{idModel}")
    suspend fun getTacheModelById(@Path("idModel" )id: Int): Response<TacheModel>
}