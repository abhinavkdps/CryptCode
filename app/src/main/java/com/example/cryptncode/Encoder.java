package com.example.cryptncode;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Encoder extends AppCompatActivity {

    EditText etenc;
    TextView enctv;
    ClipboardManager cpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);

        etenc = findViewById(R.id.enter_txtview);
        enctv = findViewById(R.id.encpt_txtview);

        cpb = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void enc(View view) {
        String temp = etenc.getText().toString();

        String rv = Encode.encode(temp);

        enctv.setText(rv);
    }

    public void cp2(View view) {
        String data = enctv.getText().toString().trim();

        if (!data.isEmpty()) {

            ClipData temp = ClipData.newPlainText("text", data);
            cpb.setPrimaryClip(temp);

            Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show();
        }
    }
}