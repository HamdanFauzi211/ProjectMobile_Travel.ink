package com.kuliah.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RinciantrayekActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rinciantrayek);
    }

    public void pindah6(View view) {
        Intent intent = new Intent(RinciantrayekActivity.this, KonfirmasipesantravelActivity.class);
        startActivity(intent);
    }
}