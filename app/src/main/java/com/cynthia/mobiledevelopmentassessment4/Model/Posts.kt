package com.cynthia.mobiledevelopmentassessment4.Model

import retrofit2.http.Body

data class Posts(

    var id : Int,
    var title: String,
    var body: String,
    var userId: Int,

)
