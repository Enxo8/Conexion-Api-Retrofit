package com.example.pruebasapi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruebasapi.model.Datos
import com.example.pruebasapi.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Response<Datos>> = MutableLiveData()

    fun getDatos(){
        viewModelScope.launch {
            val response : Response<Datos> = repository.getDatos()
            myResponse.value = response
        }

    }
 }
