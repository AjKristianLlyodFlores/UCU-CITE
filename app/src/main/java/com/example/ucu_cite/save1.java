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

public class save1 extends AppCompatActivity {
    public Button mButton1;
    public TextView view11,view12,view13,view14,view15,view16,view17,view18,view19,view20;
    public EditText nickname11,nickname12,nickname13,nickname14,nickname15,nickname16,nickname17,nickname18,nickname19,nickname20;
    public String getString10,getString11,getString12,getString13,getString14,getString15,getString16,getString17,getString18,getString19;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT10 = "text10";
    public static final String TEXT11 = "text11";
    public static final String TEXT12 = "text12";
    public static final String TEXT13 = "text13";
    public static final String TEXT14 = "text14";
    public static final String TEXT15 = "text15";
    public static final String TEXT16 = "text16";
    public static final String TEXT17 = "text17";
    public static final String TEXT18 = "text18";
    public static final String TEXT19 = "text19";

    private String text10,text11,text12,text13,text14,text15,text16,text17,text18,text19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_save1);

        mButton1 = findViewById(R.id.save1);
        view11 = findViewById(R.id.view10);
        view12 = findViewById(R.id.view11);
        view13 = findViewById(R.id.view12);
        view14 = findViewById(R.id.view13);
        view15 = findViewById(R.id.view14);
        view16 = findViewById(R.id.view15);
        view17 = findViewById(R.id.view16);
        view18 = findViewById(R.id.view17);
        view19 = findViewById(R.id.view18);
        view20 = findViewById(R.id.view19);

        nickname11 = findViewById(R.id.nickname10);
        nickname12 = findViewById(R.id.nickname11);
        nickname13 = findViewById(R.id.nickname12);
        nickname14 = findViewById(R.id.nickname13);
        nickname15 = findViewById(R.id.nickname14);
        nickname16 = findViewById(R.id.nickname15);
        nickname17 = findViewById(R.id.nickname16);
        nickname18 = findViewById(R.id.nickname17);
        nickname19 = findViewById(R.id.nickname18);
        nickname20 = findViewById(R.id.nickname19);
        mButton1.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                getString10 = nickname11.getText().toString();
                getString11 = nickname12.getText().toString();
                getString12 = nickname13.getText().toString();
                getString13 = nickname14.getText().toString();
                getString14 = nickname15.getText().toString();
                getString15 = nickname16.getText().toString();
                getString16 = nickname17.getText().toString();
                getString17 = nickname18.getText().toString();
                getString18 = nickname19.getText().toString();
                getString19 = nickname20.getText().toString();

                view11.setText(getString10);
                view12.setText(getString11);
                view13.setText(getString12);
                view14.setText(getString13);
                view15.setText(getString14);
                view16.setText(getString15);
                view17.setText(getString16);
                view18.setText(getString17);
                view19.setText(getString18);
                view20.setText(getString19);


                String see10 = nickname11.getText().toString();
                String see11 = nickname12.getText().toString();
                String see12 = nickname13.getText().toString();
                String see13 = nickname14.getText().toString();
                String see14 = nickname15.getText().toString();
                String see15 = nickname16.getText().toString();
                String see16 = nickname17.getText().toString();
                String see17 = nickname18.getText().toString();
                String see18 = nickname19.getText().toString();
                String see19 = nickname20.getText().toString();


                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT10,view11.getText().toString());
                editor.putString(TEXT11,view12.getText().toString());
                editor.putString(TEXT12,view13.getText().toString());
                editor.putString(TEXT13,view14.getText().toString());
                editor.putString(TEXT14,view15.getText().toString());
                editor.putString(TEXT15,view16.getText().toString());
                editor.putString(TEXT16,view17.getText().toString());
                editor.putString(TEXT17,view18.getText().toString());
                editor.putString(TEXT18,view19.getText().toString());
                editor.putString(TEXT19,view20.getText().toString());
                editor.apply();
                Intent intent = new Intent( save1.this,Curriculum.class);
                intent.putExtra("keyname10",see10);
                intent.putExtra("keyname11",see11);
                intent.putExtra("keyname12",see12);
                intent.putExtra("keyname13",see13);
                intent.putExtra("keyname14",see14);
                intent.putExtra("keyname15",see15);
                intent.putExtra("keyname16",see16);
                intent.putExtra("keyname17",see17);
                intent.putExtra("keyname18",see18);
                intent.putExtra("keyname19",see19);


                startActivity(intent);
            }
        });
        update1();
    }

    private void update1() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        text10 = sharedPreferences.getString(TEXT10, "");
        text11 = sharedPreferences.getString(TEXT11, "");
        text12 = sharedPreferences.getString(TEXT12, "");
        text13 = sharedPreferences.getString(TEXT13, "");
        text14 = sharedPreferences.getString(TEXT14, "");
        text15 = sharedPreferences.getString(TEXT15, "");
        text16 = sharedPreferences.getString(TEXT16, "");
        text17 = sharedPreferences.getString(TEXT17, "");
        text18 = sharedPreferences.getString(TEXT18, "");
        text19 = sharedPreferences.getString(TEXT19, "");

        view11.setText(text10);
        view12.setText(text11);
        view13.setText(text12);
        view14.setText(text13);
        view15.setText(text14);
        view16.setText(text15);
        view17.setText(text16);
        view18.setText(text17);
        view19.setText(text18);
        view20.setText(text19);
    }
}