package com.rajnipkg.assignment.di

import com.rajnipkg.assignment.PhotoViewModel
import com.rajnipkg.assignment.PhotoApiService
import com.rajnipkg.assignment.PhotoApiServiceImpl
import com.rajnipkg.assignment.PhotoRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val appModule = module {
    single { provideRetrofit() }
    single<PhotoApiService> { PhotoApiServiceImpl(get()) }
    single { PhotoRepository(get()) }
    viewModel { PhotoViewModel(get()) }
}

private fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
}
