package com.rajnipkg.assignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


    class PhotoViewModel(private val photoRepository: PhotoRepository) : ViewModel() {
        private val _photos: MutableLiveData<List<DtPhoto>> = MutableLiveData()
        val photos: LiveData<List<DtPhoto>> = _photos

        fun fetchPhotos() {
            viewModelScope.launch {
                try {
                    val result = photoRepository.getPhotos()
                    _photos.value = result
                } catch (e: Exception) {
                    println("chkr"+e.message)
                }
            }
        }
    }
