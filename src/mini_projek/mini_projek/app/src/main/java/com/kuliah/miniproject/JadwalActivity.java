package com.kuliah.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class JadwalActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.jadwal);

            ImageButton btnPesan1 = findViewById(R.id.pesanJadwal_1);
            ImageButton btnPesan2 = findViewById(R.id.pesanJadwal_2);
        }

        public void pesanJadwal (View view){
            Intent i = new Intent(JadwalActivity.this, pesanActivity.class);
            startActivity(i);
        }
}
