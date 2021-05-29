package com.areeb.zindagi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class content extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        TextView cont = findViewById(R.id.cal);

        TextView marvel = findViewById(R.id.mavel);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cal_intent = new Intent(content.this, cal.class);
                startActivity(cal_intent);
                finish();
            }
        });

        marvel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent marvel_intent = new Intent(content.this,Marvel.class);
                startActivity(marvel_intent);
                finish();
            }
        });

        TextView angel = findViewById(R.id.angel);
        angel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent angel_intent = new Intent (content.this, com.areeb.zindagi.angel.class);
                startActivity(angel_intent);
                finish();
            }
        });



    }
}