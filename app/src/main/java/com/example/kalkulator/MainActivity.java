package com.example.kalkulator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnJumlah, btnKurang, btnKali, btnBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJumlah = findViewById(R.id.btnJumlah);
        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), penjumlahan.class);
                intent.putExtra("penjumlahan","jumlah");
                startActivity(intent);
            }
        });
        btnKurang = findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pengurangan.class);
                intent.putExtra("pengurangan","kurang");
                startActivity(intent);
            }
        });
        btnKali = findViewById(R.id.btnKali);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), perkalian.class);
                intent.putExtra("perkalian","kali");
                startActivity(intent);
            }
        });
        btnBagi = findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pembagian.class);
                intent.putExtra("pembagian", "bagi");
                startActivity(intent);
            }
        });
    }
}