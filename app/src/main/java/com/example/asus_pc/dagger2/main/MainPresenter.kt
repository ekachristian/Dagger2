package com.example.asus_pc.dagger2.main

import android.util.Log
import com.example.asus_pc.dagger2.data.ApiService
import com.example.asus_pc.dagger2.di.ActivityScope
import com.google.gson.Gson
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@ActivityScope
class MainPresenter @Inject constructor(val api: ApiService){
    fun getClubList() {
        Log.d("MainPresenter", "MainPresenter : getClubList")
        api.getClubList().enqueue(object : Callback<JsonObject> {
            override fun onFailure(call: Call<JsonObject>?, t: Throwable?) {
                Log.e("MainPresenter", t?.message)
            }

            override fun onResponse(call: Call<JsonObject>?, response: Response<JsonObject>?) {
                Log.e("MainPresenter", "response : ${Gson().toJsonTree(response)}")
            }
        })
    }
}