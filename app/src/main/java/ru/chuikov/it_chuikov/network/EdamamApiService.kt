package ru.chuikov.it_chuikov.network

import retrofit2.Retrofit
import okhttp3.OkHttpClient
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import ru.chuikov.it_chuikov.network.entity.EdamamResponce

private const val BASE_URL = "https://api.edamam.com/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .client(
        OkHttpClient.Builder()
            .addInterceptor { chain ->
                val url = chain
                    .request()
                    .url()
                    .newBuilder()
                    .addQueryParameter("app_id", Constants.APP_ID)
                    .addQueryParameter("app_key", Constants.APP_KEY)
                    .addQueryParameter("type","public")
                    .build()
                chain.proceed(chain.request().newBuilder().url(url).build())
            }
            .build()
    )
    .build()

interface EdamamService {
    @GET("/api/recipes/v2?")
    suspend fun listOfRecipes(
        @Query("q")query:String,
    ): EdamamResponce
}

object EdamamApi {
    val retrofitService: EdamamService by lazy {
        retrofit.create(EdamamService::class.java)
    }
}