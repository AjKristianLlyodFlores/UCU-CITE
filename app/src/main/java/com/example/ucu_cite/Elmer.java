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

public class Elmer extends AppCompatActivity {
    ImageView fp;
    TextView mess8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_elmer);
         ;
        fp = findViewById(R.id.fp);


        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/elmer.valdez.18007");

            }
        });
        TextView mess8 = (TextView) findViewById(R.id.mess8);
        mess8.setText(Html.fromHtml("<a href=\"mailto:elmervaldez@ucu.edu.ph\"> elmervaldez@ucu.edu.ph</a>"));
        mess8.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous3(View view) {
        Intent intent = new Intent(Elmer.this, Consultation.class);
        startActivity(intent);
    }
}