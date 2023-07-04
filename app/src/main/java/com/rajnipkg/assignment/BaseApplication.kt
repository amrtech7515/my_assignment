package com.rajnipkg.assignment

import android.app.Application
import com.rajnipkg.assignment.di.activitymodule
import com.rajnipkg.assignment.di.appModule
import org.koin.core.context.startKoin

class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule, activitymodule)
        }
    }

}