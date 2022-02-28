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

public class Jeremi extends AppCompatActivity {
    ImageView fx;
    TextView mess9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_jeremi);


        fx = findViewById(R.id.fx);


        fx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/jeremi.micua.1");

            }
        });
        TextView mess9 = (TextView) findViewById(R.id.mess9);
        mess9.setText(Html.fromHtml("<a href=\"mailto:jeremimicua@ucu.edu.ph\"> jeremimicua@ucu.edu.ph</a>"));
        mess9.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous3(View view) {
        Intent intent = new Intent(Jeremi.this, Consultation.class);
        startActivity(intent);
    }
}