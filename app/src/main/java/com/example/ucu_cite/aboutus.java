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

import org.w3c.dom.Text;

public class aboutus extends AppCompatActivity {
    TextView mess2, mess, mess4, mess3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_aboutus);


        TextView mess2 = (TextView) findViewById(R.id.mess2);
        mess2.setText(Html.fromHtml("<a href=\"mailto:floresaj2020@gmail.com\">floresaj2020@gmail.com</a>"));
        mess2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView mess = (TextView) findViewById(R.id.mess);
        mess.setText(Html.fromHtml("<a href=\"mailto:aucenavincentleef.bsit.ucu@gmail.com\">vincent.bsit.ucu@gmail.com</a>"));
        mess.setMovementMethod(LinkMovementMethod.getInstance());

        TextView mess3 = (TextView) findViewById(R.id.mess3);
        mess3.setText(Html.fromHtml("<a href=\"mailto:cenongamboa.bsit.ucu@gmail.com\">cenon.bsit.ucu@gmail.com</a>"));
        mess3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView mess4 = (TextView) findViewById(R.id.mess4);
        mess4.setText(Html.fromHtml("<a href=\"mailto:rnchwml02@gmail.com\">rnchwml02@gmail.com</a>"));
        mess4.setMovementMethod(LinkMovementMethod.getInstance());



    }

    public void out(View view) {
        Intent intent = new Intent(aboutus.this,hub.class);
        startActivity(intent);
    }

}
