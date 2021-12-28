package com.kuliah.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    EditText username, password;
    ImageButton login, registrasi;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText inputUsername = findViewById(R.id.kolomusername);
        EditText inputPassword = findViewById(R.id.kolomPassword);
        ImageButton btnLogin = findViewById(R.id.btnLogin);
        ImageButton btnRegister = findViewById(R.id.btnRegis);
        DB = new DBHelper(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = inputUsername.getText().toString();
                String password = inputPassword.getText().toString();

                if (username.equals("")||password.equals("")){
                    Toast.makeText(login.this, "Tolong Isi Kolom Username dan Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean checkUserPassword = DB.checkUsernamePassword(username, password);
                    if (checkUserPassword == true){
                        Toast.makeText(login.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Home.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(login.this, "Usernmae atau Password anda salah!!!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

//    public void login2(View view){
//        Intent i = new Intent(login.this, JadwalActivity.class);
//        startActivity(i);
//    }
//
//    public void regis2(View view){
//        Intent i = new Intent(login.this, RegisterActivity.class);
//        startActivity(i);
//    }
}
