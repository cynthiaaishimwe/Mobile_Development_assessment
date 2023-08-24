package com.cynthia.mobiledevelopmentassessment4.Repository

import com.cynthia.mobiledevelopmentassessment4.Api.ApiClient
import com.cynthia.mobiledevelopmentassessment4.Api.ApiInterface
import com.cynthia.mobiledevelopmentassessment4.Model.Posts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class PostsRepository {
    val apiClient = ApiClient.buildClient(ApiInterface::class.java)

    suspend fun getPosts():Response<List<Posts>>{
        return withContext(Dispatchers.IO){
            apiClient.getPosts()
        }
    }
}