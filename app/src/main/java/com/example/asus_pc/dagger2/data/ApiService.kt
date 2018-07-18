package com.example.asus_pc.dagger2.data

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("opendatajson/football.json/master/2017-18/es.1.clubs.json")
    fun getClubList(): Call<JsonObject>
}