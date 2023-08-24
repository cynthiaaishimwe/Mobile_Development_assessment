package com.cynthia.mobiledevelopmentassessment4.Api

import com.cynthia.mobiledevelopmentassessment4.Model.PostsResponse
import com.cynthia.mobiledevelopmentassessment4.Repository.UserRepository

interface ApiInterface {
//
//        @GET("/posts")
//        suspend fun getPosts(): Response<PostsResponse>
//
//        @GET("/posts")
//        suspend fun getUser(): Response<UserRepository>


                @GET("posts")
                suspend fun getPosts(): List<Post>
        }

