package com.kuliah.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        ImageButton btnRegistrasi = findViewById(R.id.buttonRegister);
    }

    public void registerActivity(View view){
        Intent i = new Intent(RegisterActivity.this, login.class);
        startActivity(i);
    }
}
