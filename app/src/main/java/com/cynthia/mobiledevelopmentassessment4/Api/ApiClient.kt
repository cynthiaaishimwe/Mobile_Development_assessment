package com.cynthia.mobiledevelopmentassessment4.Api

object ApiClient {
        var retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/posts")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun <T> buildClient(apiInterface: Class<T>): T{
            return retrofit.create(apiInterface)
        }
    }

