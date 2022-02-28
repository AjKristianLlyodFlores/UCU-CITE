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

public class JHOHANS extends AppCompatActivity {
    ImageView fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_jhohans);
        fm = findViewById(R.id.fm);


        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/jbrabago");

            }
        });
        TextView mess5 = (TextView) findViewById(R.id.mess5);
        mess5.setText(Html.fromHtml("<a href=\"mailto:johannsrabago@ucu.edu.ph\">  johannsrabago@ucu.edu.ph</a>"));
        mess5.setMovementMethod(LinkMovementMethod.getInstance());

    }
    public void previous(View view) {
        Intent intent = new Intent(JHOHANS.this, Consultation.class);
        startActivity(intent);
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



}



