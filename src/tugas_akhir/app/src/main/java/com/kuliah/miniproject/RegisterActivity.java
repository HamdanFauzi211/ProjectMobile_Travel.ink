package com.kuliah.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity  extends AppCompatActivity {

    EditText namapengguna, namalengkap, notelp, alamatLengkap, password;
    ImageButton register;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        EditText namapengguna = findViewById(R.id.namapengguna);
        EditText namalengkap = findViewById(R.id.namalengkap);
        EditText notelp = findViewById(R.id.notelp);
        EditText alamatLengkap = findViewById(R.id.alamatLengkap);
        EditText password = findViewById(R.id.password);
        ImageButton register = findViewById(R.id.buttonRegister);
        DB = new DBHelper(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = namapengguna.getText().toString();
                String user = namalengkap.getText().toString();
                String telp = notelp.getText().toString();
                String alamat = alamatLengkap.getText().toString();
                String pswd = password.getText().toString();

                if (username != null || password != null || user != null || telp != null || alamat != null || pswd != null){
                    Boolean Daftar = DB.insertData(username, user, telp, alamat, pswd);
                    if (Daftar == true){
                        Toast.makeText(getApplicationContext(), "Daftar Berhasil", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(RegisterActivity.this, login.class);
                        startActivity(i);
                        finish();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Register Gagal!!!", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Mohon Isi Semua Kolom!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
