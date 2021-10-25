package com.kuliah.miniproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class halaman_awal extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_awal);

        ImageButton btnLogin = findViewById(R.id.loginbtnn);
        ImageButton btnRegister = findViewById(R.id.registerbutton);
    }

    public void login(View view){
        Intent i = new Intent(halaman_awal.this, login.class);
        startActivity(i);
    }

    public void register(View view){
        Intent i = new Intent(halaman_awal.this, RegisterActivity.class);
        startActivity(i);
    }
}
