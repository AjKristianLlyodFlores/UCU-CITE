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

public class Dionnel extends AppCompatActivity {
    ImageView fd;
    TextView mess14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dionnel);

        fd = findViewById(R.id.fd);


        fd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/rubilyn.nonales.3");

            }
        });
        TextView mess14= (TextView) findViewById(R.id.mess14);
        mess14.setText(Html.fromHtml("<a href=\"mailto:rubilynnonales@ucu.edu.ph\"> rubilynnonales@ucu.edu.ph</a>"));
        mess14.setMovementMethod(LinkMovementMethod.getInstance());

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void previous13(View view) {
        Intent intent = new Intent(Dionnel.this, Consultation.class);
        startActivity(intent);
    }
}