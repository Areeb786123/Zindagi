package com.areeb.zindagi.trending_retro;

import com.areeb.zindagi.model.TrendingResponse;
import com.areeb.zindagi.model.results;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofit_interface {

    //String api_key = "19e9185cec4a98676856644d3e66cc2c";

    //https://api.themoviedb.org/3/trending/all/day?api_key=19e9185cec4a98676856644d3e66cc2c
    @GET("3/trending/all/day?api_key=19e9185cec4a98676856644d3e66cc2c")
    Call<TrendingResponse> getAllTrendingDetails();



}
