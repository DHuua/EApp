package com.example.eapp.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import com.example.eapp.Domain.BannerModel
import com.example.eapp.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository = MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }
}