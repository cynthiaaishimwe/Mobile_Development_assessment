package com.cynthia.mobiledevelopmentassessment4.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cynthia.mobiledevelopmentassessment4.Model.Posts
import com.cynthia.mobiledevelopmentassessment4.Repository.PostsRepository
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import java.lang.Exception

class PostViewModel:ViewModel() {

    var postRepo = PostsRepository()
    var postLiveData = MutableLiveData<List<Posts>>()
    var errorLiveData = MutableLiveData<String>()

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                val response = postRepo.getPosts()
                if (response.isSuccessful) {
                    var postList = response.body() ?: emptyList()
                    postLiveData.postValue(postList)
                } else {
                    errorLiveData.postValue(response.errorBody()?.string())
                }
            } catch (e: Exception) {
                errorLiveData.postValue(e.message)

            }
        }
    }
}

