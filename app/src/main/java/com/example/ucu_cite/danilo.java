package com.example.ucu_cite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class danilo extends AppCompatActivity {
    ImageView ms3,ms31;
    TextView mess03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_danilo);

        ms3 = findViewById(R.id.ms3);
        ms31 = findViewById(R.id.ms31);

        ms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/danilodorado.bsit");

            }
        });
        ms31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/danilodorado.bsit");

            }
        });
        TextView mess03 = (TextView) findViewById(R.id.mess03);
        mess03.setText(Html.fromHtml("<a href=\"mailto:danilodorado@ucu.edu.ph\">.</a>"));
        mess03.setMovementMethod(LinkMovementMethod.getInstance());


    }

    public void previous1(View view) {
        Intent intent = new Intent(danilo.this, Consultation.class);
        startActivity(intent);
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}