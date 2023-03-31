package com.example.perhitunganpenjumlahan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.Bilangan1);
        ed2 = findViewById(R.id.Bilangan2);
        res = findViewById(R.id.Hitung);

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(ed1.getText().toString());
                int num2 = Integer.parseInt(ed2.getText().toString());

                int sum = num1 +num2;

                Intent intent = new Intent(getApplicationContext(), Hasil.class);
                intent.putExtra("key", sum);
                startActivity(intent);
            }
        });
    }
}