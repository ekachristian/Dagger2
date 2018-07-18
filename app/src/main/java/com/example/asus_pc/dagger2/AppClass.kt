package com.example.asus_pc.dagger2

import android.app.Application
import com.example.asus_pc.dagger2.di.component.AppComponent
import com.example.asus_pc.dagger2.di.component.DaggerAppComponent
import com.example.asus_pc.dagger2.di.module.ApiModule
import com.example.asus_pc.dagger2.di.module.AppModule

class AppClass: Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule())
                .apiModule(ApiModule())
                .build()
    }


    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }
}