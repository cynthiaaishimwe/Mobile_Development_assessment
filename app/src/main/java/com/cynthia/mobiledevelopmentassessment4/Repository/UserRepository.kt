package com.cynthia.mobiledevelopmentassessment4.Repository

import com.cynthia.mobiledevelopmentassessment4.Api.ApiClient
import com.cynthia.mobiledevelopmentassessment4.Api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
//
//class UserRepository {
//
//
//    var apiClient =
//        ApiClient.buildClient(ApiInterface::class.java)
//
//    suspend fun getPosts(): Response<ProductResponse> {
//        return withContext(Dispatchers.IO) {
//            apiClient.getPosts()
//
//
//        }
//    }
//}