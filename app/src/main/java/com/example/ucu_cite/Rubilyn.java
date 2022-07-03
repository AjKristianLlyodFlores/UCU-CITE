package com.example.ucu_cite;

import androidx.appcompat.app.AppCompatActivity;

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

public class Rubilyn extends AppCompatActivity {
    ImageView fj,fj1;
    TextView mess13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_rubilyn);

        fj = findViewById(R.id.fj);

        fj1 = findViewById(R.id.fj1);


        fj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/rubilyn.nonales.3");

            }
        });
        fj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/rubilyn.nonales.3");

            }
        });
        TextView mess13= (TextView) findViewById(R.id.mess13);
        mess13.setText(Html.fromHtml("<a href=\"mailto:rubilynnonales@ucu.edu.ph\">.</a>"));
        mess13.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



}