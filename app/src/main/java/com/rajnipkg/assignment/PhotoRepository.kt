package com.rajnipkg.assignment

class PhotoRepository(private val apiService: PhotoApiService) {
    suspend fun getPhotos(): List<DtPhoto> {
        return apiService.getPhotos()
    }
}