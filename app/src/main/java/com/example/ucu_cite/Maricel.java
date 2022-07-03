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

public class Maricel extends AppCompatActivity {
    ImageView mr,mr1;
    TextView mess14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_maricel);

        mr = findViewById(R.id.mr);
        mr1 = findViewById(R.id.mr1);



        mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/maricel.erama.1");

            }
        });

        mr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/maricel.erama.1");

            }
        });
        TextView mess14= (TextView) findViewById(R.id.mess14);
        mess14.setText(Html.fromHtml("<a href=\"mailto:maricelerama@ucu.edu.ph\">.</a>"));
        mess14.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



}