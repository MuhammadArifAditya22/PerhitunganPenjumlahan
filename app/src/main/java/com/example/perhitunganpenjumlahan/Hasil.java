package com.example.perhitunganpenjumlahan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {
    TextView Data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Data = findViewById(R.id.Hhasil);

        Intent intent = getIntent();

        int data = intent.getIntExtra("key", 0);

        Data.setText(Integer.toString(data));
    }
}