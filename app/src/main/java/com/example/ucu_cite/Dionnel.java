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

public class Dionnel extends AppCompatActivity {
    ImageView fg,fg1;
    TextView mess04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dionnel);

        fg = findViewById(R.id.fg);
        fg1 = findViewById(R.id.fg1);

        fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/dnnelcaguin");

            }
        });
        fg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/dnnelcaguin");

            }
        });
        TextView mess02 = (TextView) findViewById(R.id.mess02);
        mess02.setText(Html.fromHtml("<a href=\"mailto:dionnelcaguin@ucu.edu.ph\">.</a>"));
        mess02.setMovementMethod(LinkMovementMethod.getInstance());


    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}