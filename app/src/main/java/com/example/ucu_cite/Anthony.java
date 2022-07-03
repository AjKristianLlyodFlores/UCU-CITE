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

public class Anthony extends AppCompatActivity {
    ImageView fq,fq1;
    TextView mess1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_anthony);

        fq = findViewById(R.id.fq);
        fq1 = findViewById(R.id.fq1);



        fq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/an2nymarquez");

            }
        });
        fq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/an2nymarquez");

            }
        });
        TextView mess1 = (TextView) findViewById(R.id.mess1);
        mess1.setText(Html.fromHtml("<a href=\"mailto:anthonymarquez@ucu.edu.ph\">.</a>"));
        mess1.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous14(View view) {
        Intent intent = new Intent(Anthony.this, Consultation.class);
        startActivity(intent);
    }
}