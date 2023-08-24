package com.cynthia.mobiledevelopmentassessment4.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cynthia.mobiledevelopmentassessment4.Model.Posts
import com.cynthia.mobiledevelopmentassessment4.Repository.PostsRepository

class PostViewModel:ViewModel(){

    val postRepo= PostsRepository()
    var postLiveData = MutableLiveData<List<Posts>>()
    var errorLiveData = MutableLiveData<String>()

    fun fetchPosts(){
        viewModelScope.launch {
            val response=postRepo.getPosts()
            if (response.isSuccessful){
                postLiveData.postValue(response.body()?.products)
            }
            else{
                errorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }

