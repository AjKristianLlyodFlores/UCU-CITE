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

public class Eherson extends AppCompatActivity {
    ImageView fg;
    TextView mess11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_eherson);

        fg = findViewById(R.id.fg);


        fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/lmdvera");

            }
        });
        TextView mess11= (TextView) findViewById(R.id.mess11);
        mess11.setText(Html.fromHtml("<a href=\"mailto:ehersonvaldez@ucu.edu.ph\"> ehersonvaldez@ucu.edu.ph</a>"));
        mess11.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous3(View view) {
        Intent intent = new Intent(Eherson.this, Consultation.class);
        startActivity(intent);
    }
}