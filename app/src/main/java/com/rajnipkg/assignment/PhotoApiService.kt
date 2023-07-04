package com.rajnipkg.assignment

import retrofit2.http.GET

interface PhotoApiService {
    @GET("photos")
    suspend fun getPhotos(): List<DtPhoto>
}