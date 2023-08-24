package com.cynthia.mobiledevelopmentassessment4.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cynthia.mobiledevelopmentassessment4.R
import com.cynthia.mobiledevelopmentassessment4.ViewModel.PostViewModel

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
class MainActivity : AppCompatActivity() {
    private lateinit var postViewModel: PostViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}





