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

public class Christian extends AppCompatActivity {
    ImageView ms1,ms2;
    TextView mess0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_christian);

        ms1 = findViewById(R.id.ms1);
        ms2 = findViewById(R.id.ms2);


        ms1.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ian.mequin");

            }
        });
        ms2.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ian.mequin");

            }
        });
        TextView mess0 = (TextView) findViewById(R.id.mess0);
        mess0.setText(Html.fromHtml("<a href=\"mailto:christianmequin@ucu.edu.ph\">.</a>"));
        mess0.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

public void previous9(View view) {
    Intent intent = new Intent(Christian.this, Consultation.class);
    startActivity(intent);
}
}




