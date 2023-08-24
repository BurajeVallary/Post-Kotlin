package com.example.myshop.repository

import com.example.myshop.api.ApiClient
import com.example.myshop.api.ApiInterface
import com.example.myshop.model.ProductResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.http.POST

class ProductRepository {
    private val apiClient = ApiClient.buildClient(ApiInterface::class.java)

    suspend fun getPost(): List<POST> {
        return withContext(Dispatchers.IO) {
            apiClient.getPosts()
        }
    }
}
