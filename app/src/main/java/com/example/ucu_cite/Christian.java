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

public class Christian extends AppCompatActivity {
    ImageView fw;
    TextView mess16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_christian);

        fw = findViewById(R.id.fw);


        fw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ian.mequin");

            }
        });
        TextView mess16 = (TextView) findViewById(R.id.mess16);
        mess16.setText(Html.fromHtml("<a href=\"mailto:christianmequin@ucu.edu.ph\"> christianmequin@ucu.edu.ph</a>"));
        mess16.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous15(View view) {
        Intent intent = new Intent(Christian.this, Consultation.class);
        startActivity(intent);
    }
}