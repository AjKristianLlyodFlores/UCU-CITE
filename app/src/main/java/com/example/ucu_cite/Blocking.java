package com.example.ucu_cite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Blocking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_blocking);
    }

    public void first(View view) {
        Intent intent = new Intent(Blocking.this, blocking2.class);
        startActivity(intent);
    }

    public void second(View view) {
        Intent intent = new Intent(Blocking.this, blocking2.class);
        startActivity(intent);
    }

    public void fouth(View view) {
        Intent intent = new Intent(Blocking.this, blocking2.class);
        startActivity(intent);
    }

    public void third(View view) {
        Intent intent = new Intent(Blocking.this, blocking2.class);
        startActivity(intent);
    }
}
