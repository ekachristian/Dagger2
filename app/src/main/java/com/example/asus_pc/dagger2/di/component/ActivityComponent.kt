package com.example.asus_pc.dagger2.di.component

import com.example.asus_pc.dagger2.main.MainActivity
import com.example.asus_pc.dagger2.di.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder{
        fun build(): ActivityComponent
    }

    fun inject(mainActivity: MainActivity)
}