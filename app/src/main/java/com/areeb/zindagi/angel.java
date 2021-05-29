package com.areeb.zindagi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.areeb.zindagi.Adapter.trending_Adapter;
import com.areeb.zindagi.model.TrendingResponse;
import com.areeb.zindagi.trending_retro.Retrofit_interface;
import com.areeb.zindagi.trending_retro.trending_common;
import com.areeb.zindagi.model.results;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class angel extends AppCompatActivity {
    RecyclerView trendingrecycle;
    Retrofit_interface trendingService;
    RecyclerView.LayoutManager trendinglayoutManager;
    trending_Adapter trending_adapter;
    ArrayList<results> resultsList = new ArrayList<results>();
    private String TAG;


    //private static  final String api_key = "19e9185cec4a98676856644d3e66cc2c";

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel);
        trendingrecycle = findViewById(R.id.trending_recycl);
        trendingService = trending_common.getTrending();
        trending_adapter = new trending_Adapter(getApplicationContext(), resultsList );
        trendingrecycle.setAdapter(trending_adapter);
        trendingrecycle.setHasFixedSize(true);
        trendinglayoutManager = new LinearLayoutManager(this, OrientationHelper.HORIZONTAL,false);
        trendingrecycle.setLayoutManager(trendinglayoutManager);



        getTrendingData();


    }



    private void getTrendingData() {

        trendingService.getAllTrendingDetails().enqueue(new Callback<TrendingResponse>() {
            @Override
            public void onResponse(Call<TrendingResponse> call, Response<TrendingResponse> response) {
                resultsList = (ArrayList<results>) response.body().getResults();
                trending_adapter = new trending_Adapter(getApplicationContext(),resultsList);
                trendingrecycle.setAdapter(trending_adapter);
                trending_adapter.notifyDataSetChanged();
                Log.d(TAG, "onResponse: " +response.body().toString());

            }

            @Override
            public void onFailure(Call<TrendingResponse> call, Throwable t) {

            }
        });


    }


    }
