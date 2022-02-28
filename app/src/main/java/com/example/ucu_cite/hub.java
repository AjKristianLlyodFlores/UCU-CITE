package com.example.ucu_cite;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        setContentView(R.layout.activity_hub);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));;

        


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
                gotoUrl("https://www.facebook.com/ucuaccounting");

            }
        });
        account1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/ucuaccounting");

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();
        if (item_id==R.id.PF){
            Toast.makeText(this,"This is Profile ",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(hub.this, aboutus.class);
            startActivity(intent);
        }
        else if (item_id==R.id.CT){
            Toast.makeText(this,"This is Consutation  ",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(hub.this, Consultation.class);
            startActivity(intent);
        }
        else if (item_id==R.id.AP){
            Toast.makeText(this,"API GOOGLE MAP",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(hub.this,API.class);
            startActivity(intent);
        }
        else if (item_id==R.id.out){
            Toast.makeText(this,"Exit",Toast.LENGTH_SHORT).show();
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }
        return true;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }


    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();


    }

    public void Next(View view) {
        Intent intent = new Intent(hub.this, Consultation.class);
        startActivity(intent);
    }

    public void about(View view) {
        Intent intent = new Intent(hub.this, aboutus.class);
        startActivity(intent);
    }

}



