package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class perkalian extends AppCompatActivity {
    private Button btn_kali;
    private EditText et_angka1, et_angka2;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        btn_kali = findViewById(R.id.btnHasilKali);
        et_angka1 = findViewById(R.id.etAngka1);
        et_angka2 = findViewById(R.id.etAngka2);
        hasil = findViewById(R.id.tvHasilKali);

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(et_angka1.getText().toString());
                    double l = Double.parseDouble(et_angka2.getText().toString());

                    double min = p - l;

                    hasil.setText(String.valueOf(min));
                }catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
