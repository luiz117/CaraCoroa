package com.luizao.caracoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Result extends AppCompatActivity {

    ImageView img;
    int sortado;
    Button btnBack;
    int[] rand = {R.drawable.moeda_cara,R.drawable.moeda_coroa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        img = findViewById(R.id.imgPlay);
        btnBack = findViewById(R.id.btnBack);

        Bundle dados = getIntent().getExtras();
        int s = dados.getInt("resultado");
        img.setImageResource(rand[s]);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}