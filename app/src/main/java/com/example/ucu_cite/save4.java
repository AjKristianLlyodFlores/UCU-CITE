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

public class save4 extends AppCompatActivity {
    public Button mButton4;
    public TextView view38,view39,view40,view41,view42,view43,view44,view45;
    public EditText nickname38,nickname39,nickname40,nickname41,nickname42,nickname43,nickname44,nickname45;
    public String getString37,getString38,getString39,getString40,getString41,getString42,getString43,getString44;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT37 = "text37";
    public static final String TEXT38 = "text38";
    public static final String TEXT39 = "text39";
    public static final String TEXT40 = "text40";
    public static final String TEXT41 = "text41";
    public static final String TEXT42 = "text42";
    public static final String TEXT43 = "text43";
    public static final String TEXT44 = "text44";

    private String text37,text38,text39,text40,text41,text42,text43,text44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save4);
        mButton4 = findViewById(R.id.save4);
        view38 = findViewById(R.id.view37);
        view39 = findViewById(R.id.view38);
        view40 = findViewById(R.id.view39);
        view41 = findViewById(R.id.view40);
        view42 = findViewById(R.id.view41);
        view43 = findViewById(R.id.view42);
        view44 = findViewById(R.id.view43);
        view45 = findViewById(R.id.view44);


        nickname38 = findViewById(R.id.nickname37);
        nickname39 = findViewById(R.id.nickname38);
        nickname40 = findViewById(R.id.nickname39);
        nickname41 = findViewById(R.id.nickname40);
        nickname42 = findViewById(R.id.nickname41);
        nickname43 = findViewById(R.id.nickname42);
        nickname44 = findViewById(R.id.nickname43);
        nickname45 = findViewById(R.id.nickname44);

        mButton4.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                getString37= nickname38.getText().toString();
                getString38 = nickname39.getText().toString();
                getString39 = nickname40.getText().toString();
                getString40 = nickname41.getText().toString();
                getString41 = nickname42.getText().toString();
                getString42 = nickname43.getText().toString();
                getString43 = nickname44.getText().toString();
                getString44 = nickname45.getText().toString();


                view38.setText(getString37);
                view39.setText(getString38);
                view40.setText(getString39);
                view41.setText(getString40);
                view42.setText(getString41);
                view43.setText(getString42);
                view44.setText(getString43);
                view45.setText(getString44);


                String see37 = nickname38.getText().toString();
                String see38 = nickname39.getText().toString();
                String see39 = nickname40.getText().toString();
                String see40 = nickname41.getText().toString();
                String see41 = nickname42.getText().toString();
                String see42 = nickname43.getText().toString();
                String see43 = nickname44.getText().toString();
                String see44 = nickname45.getText().toString();

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TEXT37,view38.getText().toString());
        editor.putString(TEXT38,view39.getText().toString());
        editor.putString(TEXT39,view40.getText().toString());
        editor.putString(TEXT40,view41.getText().toString());
        editor.putString(TEXT41,view42.getText().toString());
        editor.putString(TEXT42,view43.getText().toString());
        editor.putString(TEXT43,view44.getText().toString());
        editor.putString(TEXT44,view45.getText().toString());

        editor.apply();
        Intent intent = new Intent( save4.this,Curriculum.class );
        intent.putExtra("keyname37",see37);
        intent.putExtra("keyname38",see38);
        intent.putExtra("keyname39",see39);
        intent.putExtra("keyname40",see40);
        intent.putExtra("keyname41",see41);
        intent.putExtra("keyname42",see42);
        intent.putExtra("keyname43",see43);
        intent.putExtra("keyname44",see44);

        startActivity(intent);
    }
});
        update4();

        }

private void update4() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        text37 = sharedPreferences.getString(TEXT37, "");
        text38 = sharedPreferences.getString(TEXT38, "");
        text39 = sharedPreferences.getString(TEXT39, "");
        text40 = sharedPreferences.getString(TEXT40, "");
        text41 = sharedPreferences.getString(TEXT41, "");
        text42 = sharedPreferences.getString(TEXT42, "");
        text43 = sharedPreferences.getString(TEXT43, "");
        text44 = sharedPreferences.getString(TEXT44, "");

        view38.setText(text37);
        view39.setText(text38);
        view40.setText(text39);
        view41.setText(text40);
        view42.setText(text41);
        view43.setText(text42);
        view44.setText(text43);
        view44.setText(text44);

        }

        }