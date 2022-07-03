package com.example.ucu_cite;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class save extends AppCompatActivity {
    public Button mButton, mButton1;
    public TextView view1,view2,view3,view4,view5,view6,view7,view8,view9,view10;
    public EditText nickname1,nickname2,nickname3,nickname4,nickname5,nickname6,nickname7,nickname8,nickname9,nickname10;
    public String getString,getString1,getString2,getString3,getString4,getString5,getString6,getString7,getString8,getString9;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT = "text";
    public static final String TEXT1 = "text1";
    public static final String TEXT2 = "text2";
    public static final String TEXT3 = "text3";
    public static final String TEXT4 = "text4";
    public static final String TEXT5 = "text5";
    public static final String TEXT6 = "text6";
    public static final String TEXT7 = "text7";
    public static final String TEXT8 = "text8";
    public static final String TEXT9 = "text9";


    private String text,text1,text2,text3,text4,text5,text6,text7,text8,text9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_save);


        mButton = findViewById(R.id.save);
        view1 = findViewById(R.id.view);
        view2 = findViewById(R.id.view1);
        view3 = findViewById(R.id.view2);
        view4 = findViewById(R.id.view3);
        view5 = findViewById(R.id.view4);
        view6 = findViewById(R.id.view5);
        view7 = findViewById(R.id.view6);
        view8 = findViewById(R.id.view7);
        view9 = findViewById(R.id.view8);
        view10 = findViewById(R.id.view9);

        //


        nickname1 = findViewById(R.id.nickname);
        nickname2 = findViewById(R.id.nickname1);
        nickname3 = findViewById(R.id.nickname2);
        nickname4 = findViewById(R.id.nickname3);
        nickname5 = findViewById(R.id.nickname4);
        nickname6 = findViewById(R.id.nickname5);
        nickname7 = findViewById(R.id.nickname6);
        nickname8 = findViewById(R.id.nickname7);
        nickname9 = findViewById(R.id.nickname8);
        nickname10 = findViewById(R.id.nickname9);
        //


        mButton.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                getString = nickname1.getText().toString();
                getString1 = nickname2.getText().toString();
                getString2 = nickname3.getText().toString();
                getString3 = nickname4.getText().toString();
                getString4 = nickname5.getText().toString();
                getString5 = nickname6.getText().toString();
                getString6 = nickname7.getText().toString();
                getString7 = nickname8.getText().toString();
                getString8 = nickname9.getText().toString();
                getString9 = nickname10.getText().toString();
                view1.setText(getString);
                view2.setText(getString1);
                view3.setText(getString2);
                view4.setText(getString3);
                view5.setText(getString4);
                view6.setText(getString5);
                view7.setText(getString6);
                view8.setText(getString7);
                view9.setText(getString8);
                view10.setText(getString9);

                String see = nickname1.getText().toString();
                String see1 = nickname2.getText().toString();
                String see2 = nickname3.getText().toString();
                String see3 = nickname4.getText().toString();
                String see4 = nickname5.getText().toString();
                String see5 = nickname6.getText().toString();
                String see6 = nickname7.getText().toString();
                String see7 = nickname8.getText().toString();
                String see8 = nickname9.getText().toString();
                String see9 = nickname10.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT,view1.getText().toString());
                editor.putString(TEXT1,view2.getText().toString());
                editor.putString(TEXT2,view3.getText().toString());
                editor.putString(TEXT3,view4.getText().toString());
                editor.putString(TEXT4,view5.getText().toString());
                editor.putString(TEXT5,view6.getText().toString());
                editor.putString(TEXT6,view7.getText().toString());
                editor.putString(TEXT7,view8.getText().toString());
                editor.putString(TEXT8,view9.getText().toString());
                editor.putString(TEXT9,view10.getText().toString());
                editor.apply();
                Intent intent = new Intent( save.this,Curriculum.class );
                intent.putExtra("keyname",see);
                intent.putExtra("keyname1",see1);
                intent.putExtra("keyname2",see2);
                intent.putExtra("keyname3",see3);
                intent.putExtra("keyname4",see4);
                intent.putExtra("keyname5",see5);
                intent.putExtra("keyname6",see6);
                intent.putExtra("keyname7",see7);
                intent.putExtra("keyname8",see8);
                intent.putExtra("keyname9",see9);
                startActivity(intent);
            }
        });

        //


        update();
    }




    private void update() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
        text1 = sharedPreferences.getString(TEXT1, "");
        text2 = sharedPreferences.getString(TEXT2, "");
        text3 = sharedPreferences.getString(TEXT3, "");
        text4 = sharedPreferences.getString(TEXT4, "");
        text5 = sharedPreferences.getString(TEXT5, "");
        text6 = sharedPreferences.getString(TEXT6, "");
        text7 = sharedPreferences.getString(TEXT7, "");
        text8 = sharedPreferences.getString(TEXT8, "");
        text9 = sharedPreferences.getString(TEXT9, "");
        view1.setText(text);
        view2.setText(text1);
        view3.setText(text2);
        view4.setText(text3);
        view5.setText(text4);
        view6.setText(text5);
        view7.setText(text6);
        view8.setText(text7);
        view9.setText(text8);
        view10.setText(text9);



    }

}
       