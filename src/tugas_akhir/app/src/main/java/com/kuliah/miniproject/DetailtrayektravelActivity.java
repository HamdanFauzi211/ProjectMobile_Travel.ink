package com.kuliah.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DetailtrayektravelActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailtrayektravel);
    }
    public void pindah5(View view) {
        Intent intent = new Intent(DetailtrayektravelActivity.this, RinciantrayekActivity.class);
        startActivity(intent);
    }
}