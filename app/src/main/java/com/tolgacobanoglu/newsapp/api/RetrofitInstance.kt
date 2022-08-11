package com.tolgacobanoglu.newsapp.api

import com.tolgacobanoglu.newsapp.util.Constant.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Used singleton pattern to call from everywhere of the project
 */
object RetrofitInstance
{
    private val retrofit by lazy{
        //log responses of retrofit which is useful for debugging
        val logging = HttpLoggingInterceptor()
        //see body of response
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        //create client for network line
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    //use it from everywhere
    val api by lazy{
        retrofit.create(NewsAPI::class.java)
    }
}