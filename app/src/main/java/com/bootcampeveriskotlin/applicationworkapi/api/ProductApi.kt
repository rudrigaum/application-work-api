package com.bootcampeveriskotlin.applicationworkapi.api

import com.bootcampeveriskotlin.applicationworkapi.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProductAPI(): Call<List<Product>>
}