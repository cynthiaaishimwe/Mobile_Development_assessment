package com.cynthia.mobiledevelopmentassessment4.Api

import com.cynthia.mobiledevelopmentassessment4.Model.Posts
import com.cynthia.mobiledevelopmentassessment4.Model.PostsResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("posts")
    suspend fun getPosts():Response<List<Posts>>
        }

