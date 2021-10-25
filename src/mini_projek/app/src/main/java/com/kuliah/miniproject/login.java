package com.kuliah.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton btnLogin = findViewById(R.id.btnLogin);
        ImageButton btnRegister = findViewById(R.id.btnRegis);
    }

    public void login2(View view){
        Intent i = new Intent(login.this, JadwalActivity.class);
        startActivity(i);
    }

    public void regis2(View view){
        Intent i = new Intent(login.this, RegisterActivity.class);
        startActivity(i);
    }
}
