package com.example.ucu_cite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class hub extends AppCompatActivity {
    TextView ucu1, it1, ikonek1, mis1, psy1, account1, portal1, ucusc1;
    ImageView yu, it, ikonek, mis, psy, account, portal, ucusc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_hub);
        yu = findViewById(R.id.imageView8);
        ucu1 = findViewById(R.id.ucu1);
        it = findViewById(R.id.it);
        it1 = findViewById(R.id.it1);
        ikonek = findViewById(R.id.ikonek);
        ikonek1 = findViewById(R.id.ikonek1);
        mis = findViewById(R.id.mis);
        mis1 = findViewById(R.id.mis1);
        psy = findViewById(R.id.psy);
        psy1 = findViewById(R.id.psy1);
        account = findViewById(R.id.account);
        account1 = findViewById(R.id.account1);
        portal = findViewById(R.id.portal);
        portal1 = findViewById(R.id.portal1);
        ucusc = findViewById(R.id.ucusc);
        ucusc1 = findViewById(R.id.ucusc1);





        yu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://ucu.edu.ph");

            }
        });
        ucu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://ucu.edu.ph");

            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucuciteofficial/");

            }
        });
        it1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucuciteofficial/");

            }
        });
        ikonek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://lms.ucu.edu.ph/ikonek");

            }
        });
        ikonek1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://lms.ucu.edu.ph/ikonek");

            }
        });
        mis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucumisplus/");

            }
        });
        mis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucumisplus/");

            }
        });
        psy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://m.facebook.com/UCUPACC/");

            }
        });
        psy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://m.facebook.com/UCUPACC/");

            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucuciteofficial/");

            }
        });
        account1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucuciteofficial/");

            }
        });
        portal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://mis.ucu.edu.ph/ucuportal/");

            }
        });
        portal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://mis.ucu.edu.ph/ucuportal/");

            }
        });
        ucusc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://m.facebook.com/UrdanetaCityUniversitySC/");

            }
        });
        ucusc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://m.facebook.com/UrdanetaCityUniversitySC/");

            }
        });

    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), login.class));
        finish();


    }

}



