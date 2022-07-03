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

public class Joemark extends AppCompatActivity {
    ImageView fl,fl1;
    TextView mess12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_joemark);


        fl = findViewById(R.id.fl);

        fl1 = findViewById(R.id.fl1);


        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/joemark0420");

            }
        });

        fl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/joemark0420");

            }
        });
        TextView mess12= (TextView) findViewById(R.id.mess12);
        mess12.setText(Html.fromHtml("<a href=\"mailto:jeomarkiopez@ucu.edu.ph\">.</a>"));
        mess12.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



}