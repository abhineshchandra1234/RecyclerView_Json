package com.eegrab.retrofitcrash

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>       /*fun getTodos(@Query("key") key: String): Response<List<Tdo>> for api keys*/
}