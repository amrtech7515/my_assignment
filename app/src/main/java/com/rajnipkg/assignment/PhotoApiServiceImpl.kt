package com.rajnipkg.assignment

import retrofit2.Retrofit


class PhotoApiServiceImpl(retrofit: Retrofit) : PhotoApiService {
        private val apiService: PhotoApiService = retrofit.create(PhotoApiService::class.java)

        override suspend fun getPhotos(): List<DtPhoto> {
            return apiService.getPhotos()
        }
    }
