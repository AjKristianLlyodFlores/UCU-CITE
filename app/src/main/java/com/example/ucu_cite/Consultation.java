package com.example.ucu_cite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

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
            Intent intent = new Intent(Consultation.this, JHOHANS.class);
            startActivity(intent);
        }
        public void LOGOUT (View view){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();

        }


        public void dorado (View view){
            Intent intent = new Intent(Consultation.this, danilo.class);
            startActivity(intent);
        }


        public void Caoile (View view){
            Intent intent = new Intent(Consultation.this, jeffrey.class);
            startActivity(intent);
        }

    public void valdez(View view) {
        Intent intent = new Intent(Consultation.this, Elmer.class);
        startActivity(intent);
    }

    public void jay(View view) {
        Intent intent = new Intent(Consultation.this, Jesse.class);
        startActivity(intent);
    }

    public void jelene(View view) {
        Intent intent = new Intent(Consultation.this,Lorie.class);
        startActivity(intent);
    }

    public void maricel(View view) {
        Intent intent = new Intent(Consultation.this,Maricel.class);
        startActivity(intent);
    }

    public void ocay(View view) {
        Intent intent = new Intent(Consultation.this,Arnel.class);
        startActivity(intent);
    }


    public void micua(View view) {
        Intent intent = new Intent(Consultation.this,Jeremi.class);
        startActivity(intent);
    }

    public void lhanie(View view) {
        Intent intent = new Intent(Consultation.this,Lhanie.class);
        startActivity(intent);
    }

    public void eherson(View view) {
        Intent intent = new Intent(Consultation.this,Eherson.class);
        startActivity(intent);
    }

    public void joemark(View view) {
        Intent intent = new Intent(Consultation.this,Joemark.class);
        startActivity(intent);
    }

    public void rubilyn(View view) {
        Intent intent = new Intent(Consultation.this,Rubilyn.class);
        startActivity(intent);
    }

    public void dionnel(View view) {
        Intent intent = new Intent(Consultation.this,Dionnel.class);
        startActivity(intent);
    }

    public void anthony(View view) {
        Intent intent = new Intent(Consultation.this,Anthony.class);
        startActivity(intent);
    }

    public void christian(View view) {
        Intent intent = new Intent(Consultation.this,Christian.class);
        startActivity(intent);
    }
}


