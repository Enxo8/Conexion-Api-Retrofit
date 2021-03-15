package com.example.pruebasapi.repository

import com.example.pruebasapi.api.RetrofitInstance
import com.example.pruebasapi.model.Datos
import retrofit2.Response

class Repository {

    suspend fun getDatos(): Response<Datos> {
        val prueba = RetrofitInstance.api.getDatos()
        return prueba
    }
}