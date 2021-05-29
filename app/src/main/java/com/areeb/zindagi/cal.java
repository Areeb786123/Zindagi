package com.areeb.zindagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.mul);
        Button div = findViewById(R.id.div);
        Button refresh = findViewById(R.id.refresh);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subs();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mul();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });


    }

    private void add() {
        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);
        TextView sol = findViewById(R.id.sol);
        int num1 = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(first.getText().toString());
        int addition = num1 + num2;
        sol.setText(String.valueOf(addition));
        Toast.makeText(getBaseContext(), "ANSWER:" + addition, Toast.LENGTH_SHORT).show();

    }


    private void subs() {
        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);
        TextView sol = findViewById(R.id.sol);
        int num1 = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(first.getText().toString());
        int addition = num1 - num2;
        sol.setText(String.valueOf(addition));
        Toast.makeText(getBaseContext(), "ANSWER:" + addition, Toast.LENGTH_SHORT).show();

    }

    private void mul() {
        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);
        TextView sol = findViewById(R.id.sol);
        int num1 = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(first.getText().toString());
        int addition = num1 * num2;
        sol.setText(String.valueOf(addition));
        Toast.makeText(getBaseContext(), "ANSWER:" + addition, Toast.LENGTH_SHORT).show();

    }

    private void div() {
        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);
        TextView sol = findViewById(R.id.sol);
        int num1 = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(first.getText().toString());
        int addition = num1 % num2;
        sol.setText(String.valueOf(addition));
        Toast.makeText(getBaseContext(), "ANSWER:" + addition, Toast.LENGTH_SHORT).show();

    }

}