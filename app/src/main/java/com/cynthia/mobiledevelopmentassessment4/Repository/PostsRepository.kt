package com.cynthia.mobiledevelopmentassessment4.Repository

import com.cynthia.mobiledevelopmentassessment4.Api.ApiClient
import com.cynthia.mobiledevelopmentassessment4.Api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PostsRepository {

//    var apiClient =
//        ApiClient.buildClient(ApiInterface::class.java)
//    suspend fun getPosts():Response<ItemResponse>{
//        return withContext(Dispatchers.IO) {
//            apiClient.getPosts()
//
//
//
//        }
//    }

    class PostRepository {
        suspend fun getPosts(): List<Post> {
            return ApiInterface.getPots()
        }
    }

}