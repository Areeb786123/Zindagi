package com.areeb.zindagi.retero;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReterofitClient {

    private static Retrofit retrofit = null;
    //private  static  final String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    public static Retrofit getClient(String baseURL){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
