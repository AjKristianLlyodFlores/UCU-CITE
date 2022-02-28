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

public class danilo extends AppCompatActivity {
    ImageView fk;
    TextView mess6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_danilo);

        fk = findViewById(R.id.fk);


        fk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/danilodorado.bsit");

            }
        });
        TextView mess6 = (TextView) findViewById(R.id.mess6);
        mess6.setText(Html.fromHtml("<a href=\"mailto:danilodorado@ucu.edu.ph\">  danilodorado@ucu.edu.ph</a>"));
        mess6.setMovementMethod(LinkMovementMethod.getInstance());


    }

    public void previous1(View view) {
        Intent intent = new Intent(danilo.this, Consultation.class);
        startActivity(intent);
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}