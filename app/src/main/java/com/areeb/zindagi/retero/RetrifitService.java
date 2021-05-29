package com.areeb.zindagi.retero;

import com.areeb.zindagi.model.hero;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrifitService {
    @GET("marvel")
    Call<List<hero>> getAllHeros();



}
