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

public class Arnel extends AppCompatActivity {
    ImageView fy;
    TextView mess12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_arnel);
        fy = findViewById(R.id.fy);


        fy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/arnel.ocay.73");

            }
        });
        TextView mess12 = (TextView) findViewById(R.id.mess12);
        mess12.setText(Html.fromHtml("<a href=\"mailto: arnelocay@ucu.edu.ph\">arnelocay@ucu.edu.ph</a>"));
        mess12.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous7(View view) {
        Intent intent = new Intent(Arnel.this, Consultation.class);
        startActivity(intent);
    }
}