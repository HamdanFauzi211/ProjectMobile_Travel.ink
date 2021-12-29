package com.kuliah.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class JadwalActivity extends AppCompatActivity {
    ImageButton imageButton;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.jadwal);
        }
    public void pindah4(View view) {
        Intent intent = new Intent(JadwalActivity.this, DetailtrayektravelActivity.class);
        startActivity(intent);
    }
}
