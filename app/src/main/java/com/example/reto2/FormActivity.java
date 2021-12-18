package com.example.reto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        TextView textView = (TextView) findViewById(R.id.txtMensage);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
    }
}