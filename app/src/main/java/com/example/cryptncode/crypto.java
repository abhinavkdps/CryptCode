package com.example.cryptncode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class crypto extends AppCompatActivity {

    Button enc, dec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto);

        enc = findViewById(R.id.encrypt_btn);
        dec = findViewById(R.id.decrypt_btn);

        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Encoder.class);
                startActivity(intent);
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Decoder.class);
                startActivity(intent);
            }
        });
    }
}