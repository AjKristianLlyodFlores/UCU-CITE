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

public class Lhanie extends AppCompatActivity {
    ImageView fz;
    TextView mess10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lhanie);

        fz = findViewById(R.id.fz);


        fz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/lmdvera");

            }
        });
        TextView mess10= (TextView) findViewById(R.id.mess10);
        mess10.setText(Html.fromHtml("<a href=\"mailto:lhaniedevera@ucu.edu.ph\"> lhaniedevera@ucu.edu.ph</a>"));
        mess10.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous3(View view) {
        Intent intent = new Intent(Lhanie.this, Consultation.class);
        startActivity(intent);
    }
}