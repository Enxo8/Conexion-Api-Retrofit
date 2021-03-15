package com.example.pruebasapi.api

import com.example.pruebasapi.model.Datos
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @GET("api/v1/customer/c0")
    suspend fun getDatos(): Response<Datos>
}