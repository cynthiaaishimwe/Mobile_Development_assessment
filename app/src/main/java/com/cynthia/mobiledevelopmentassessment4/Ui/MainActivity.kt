package com.cynthia.mobiledevelopmentassessment4.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.cynthia.mobiledevelopmentassessment4.Model.PostAdapter
import com.cynthia.mobiledevelopmentassessment4.R
import com.cynthia.mobiledevelopmentassessment4.ViewModel.PostViewModel
import com.cynthia.mobiledevelopmentassessment4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val postViewModel: PostViewModel by viewModels()
    lateinit var binding: ActivityMainBinding
    lateinit var postAdapter: PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        postViewModel.fetchPosts()
        postViewModel.postLiveData.observe(this, Observer { postList->
            var postAdapter = PostAdapter(postList ?: emptyList())
            binding.rvPosts.layoutManager = LinearLayoutManager(this@MainActivity)
            binding.rvPosts.adapter = postAdapter
            Toast.makeText(baseContext,"fetched successfully",Toast.LENGTH_LONG).show()
        })
        postViewModel.errorLiveData.observe(this, Observer { error->
            Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
        })
    }

}





