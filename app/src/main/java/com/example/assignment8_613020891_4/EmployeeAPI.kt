package com.example.assignment8_613020891_4

import Employee
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface EmployeeAPI {

        @GET("allemploy")
        fun retrieveEmployee(): Call<List<Employee>>

        @FormUrlEncoded
        @POST("employ")
        fun insertEmployee(
            @Field("name") name :String,
            @Field("gender") gender :String,
            @Field("email") email :String,
            @Field("salary") salary :Int
        ): Call<Employee>
}
