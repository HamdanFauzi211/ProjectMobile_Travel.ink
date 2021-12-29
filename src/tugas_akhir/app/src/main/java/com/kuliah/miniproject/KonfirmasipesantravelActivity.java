package com.kuliah.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class KonfirmasipesantravelActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasipesantravel);
    }
    public void pindah7(View view) {
        Intent intent = new Intent(KonfirmasipesantravelActivity.this, Home.class);
        startActivity(intent);
    }
}