package com.example.ucu_cite;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

public class hub extends AppCompatActivity {
    TextView ucu1, it1, ikonek1, mis1, psy1, account1, portal1, ucusc1;
    ImageView yu, it, ikonek, mis, psy, account, portal, ucusc;


    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    Animation scaleUp,scaleDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.browser_actions_title_color)));


        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).build();
        gsc = GoogleSignIn.getClient(this,gso);
        gsc.signOut();


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



GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
  if(acct!=null){

}


        yu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/UCUOfficial");

            }
        });
        ucu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/UCUOfficial");

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
          if (item_id==R.id.CT){
            Toast.makeText(this,"This is Consutation  ",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,Consultation.class);
             Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(i,b);
        }
        else if (item_id==R.id.CU){
            Toast.makeText(this,"This is Curriculum  ",Toast.LENGTH_SHORT).show();
              Intent i = new Intent(this,Curriculum.class );
              Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
              startActivity(i,b);
        }
          else if (item_id==R.id.enroll){
              Toast.makeText(this,"This is Online Enrollment  ",Toast.LENGTH_SHORT).show();
              Intent i = new Intent(this,Enrollment.class );
              Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
              startActivity(i,b);
          }

        else if (item_id==R.id.Messageus){
            Toast.makeText(this,"About Us",Toast.LENGTH_SHORT).show();
             Intent i = new Intent(this, aboutus.class );
              Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
              startActivity(i,b);
        }
        else if (item_id==R.id.block){
            Toast.makeText(this,"BLOCKING AREA",Toast.LENGTH_SHORT).show();
              Intent i = new Intent(this,Blocking.class );
              Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
              startActivity(i,b);
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



