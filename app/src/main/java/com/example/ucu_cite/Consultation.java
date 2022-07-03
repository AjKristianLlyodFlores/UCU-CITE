package com.example.ucu_cite;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Consultation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_consultation);

    }
        public void back (View view){
            Intent intent = new Intent(Consultation.this, hub.class);
            startActivity(intent);
        }


        public void rabago (View view){
            Intent i = new Intent(this,JHOHANS.class );
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(i,b);
        }
        public void LOGOUT (View view){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();

        }


        public void dorado (View view){
            Intent i = new Intent(this,danilo.class );
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(i,b);
        }


        public void Caoile (View view){
            Intent i = new Intent(this,jeffrey.class );
            Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
            startActivity(i,b);
        }

    public void valdez(View view) {
        Intent i = new Intent(this,Elmer.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void jay(View view) {
        Intent i = new Intent(this,Jesse.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void jelene(View view) {
        Intent i = new Intent(this,Lorie.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void maricel(View view) {
        Intent i = new Intent(this,Maricel.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void ocay(View view) {
        Intent i = new Intent(this,Arnel.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }


    public void micua(View view) {
        Intent i = new Intent(this,Jeremi.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void lhanie(View view) {
        Intent i = new Intent(this,Lhanie.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void eherson(View view) {
        Intent i = new Intent(this,Eherson.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void joemark(View view) {
        Intent i = new Intent(this,Joemark.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void rubilyn(View view) {
        Intent i = new Intent(this,Rubilyn.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void dionnel(View view) {
        Intent i = new Intent(this,Dionnel.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void anthony(View view) {
        Intent i = new Intent(this,Anthony.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }

    public void christian(View view) {
        Intent i = new Intent(this,Christian.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }
}


