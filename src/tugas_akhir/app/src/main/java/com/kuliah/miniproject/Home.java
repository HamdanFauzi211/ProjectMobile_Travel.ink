 package com.kuliah.miniproject;

import androidx.annotation.DimenRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void pindah1(View view) {
        Intent intent = new Intent(Home.this, JadwalActivity.class);
        startActivity(intent);
    }
}