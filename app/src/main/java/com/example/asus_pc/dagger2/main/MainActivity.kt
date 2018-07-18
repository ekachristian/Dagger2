package com.example.asus_pc.dagger2.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.asus_pc.dagger2.AppClass
import com.example.asus_pc.dagger2.R
import com.example.asus_pc.dagger2.di.component.ActivityComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.injectActivity()
        this.initView()
    }

    private fun initView() {
        btnClickMe.setOnClickListener {
            presenter.getClubList()
        }
    }

    private fun injectActivity() {
        val injector: ActivityComponent = (applicationContext as AppClass).appComponent
                .activityComponent()
                .build()
        injector.inject(this)
    }
}
