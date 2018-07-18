package com.example.asus_pc.dagger2.di.component

import com.example.asus_pc.dagger2.AppClass
import com.example.asus_pc.dagger2.di.module.ApiModule
import com.example.asus_pc.dagger2.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {
    fun activityComponent(): ActivityComponent.Builder
    abstract fun inject(appClass: AppClass)
}