package com.areeb.zindagi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.areeb.zindagi.Adapter.hero_adapter;
import com.areeb.zindagi.model.hero;
import com.areeb.zindagi.retero.Common;
import com.areeb.zindagi.retero.RetrifitService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Marvel extends AppCompatActivity {
    RecyclerView recyclerView;
    RetrifitService mService;
    RecyclerView.LayoutManager layoutManager;
    hero_adapter  heroadapter;


    //base url of mavel https://www.simplifiedcoding.net/demos/marvel/
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marvel);

        mService= Common.getHeroes();

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        layoutManager= new LinearLayoutManager(this, OrientationHelper.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);

        getData();
    }

    private void getData() {
        mService.getAllHeros().enqueue(new Callback<List<hero>>() {
            @Override
            public void onResponse(Call<List<hero>> call, Response<List<hero>> response) {
                heroadapter= new hero_adapter(getBaseContext(),response.body());
                heroadapter.notifyDataSetChanged();
                recyclerView.setAdapter(heroadapter);


            }

            @Override
            public void onFailure(Call<List<hero>> call, Throwable t) {

            }
        });



    }
}