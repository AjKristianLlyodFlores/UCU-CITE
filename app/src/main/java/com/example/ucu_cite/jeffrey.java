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

public class jeffrey extends AppCompatActivity {
    ImageView fl,fl1;
    TextView mess7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_jeffrey);

        fl = findViewById(R.id.fl);
        fl1 = findViewById(R.id.fl1);


        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/jepoy.caoile");

            }
        });
        fl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/jepoy.caoile");

            }
        });
        TextView mess7 = (TextView) findViewById(R.id.mess7);
        mess7.setText(Html.fromHtml("<a href=\"mailto:jeffreycaoile@ucu.edu.ph\">.</a>"));
        mess7.setMovementMethod(LinkMovementMethod.getInstance());


    }


    public void previous2(View view) {
        Intent intent = new Intent(jeffrey.this, Consultation.class);
        startActivity(intent);
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}