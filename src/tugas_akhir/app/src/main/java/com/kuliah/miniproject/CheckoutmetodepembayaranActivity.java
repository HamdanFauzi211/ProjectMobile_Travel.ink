package com.kuliah.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CheckoutmetodepembayaranActivity extends AppCompatActivity {
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkoutmetodepembayaran);
    }

    public void pindah9(View view) {
        Intent intent = new Intent(CheckoutmetodepembayaranActivity.this, InvoiceActivity.class);
        startActivity(intent);
    }
}