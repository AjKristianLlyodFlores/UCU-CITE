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

public class save3 extends AppCompatActivity {
    public Button mButton3;
    public TextView view29,view30,view31,view32,view33,view34,view35,view36,view37;
    public EditText nickname29,nickname30,nickname31,nickname32,nickname33,nickname34,nickname35,nickname36,nickname37;
    public String getString28,getString29,getString30,getString31,getString32,getString33,getString34,getString35,getString36;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT28 = "text28";
    public static final String TEXT29 = "text29";
    public static final String TEXT30 = "text30";
    public static final String TEXT31 = "text31";
    public static final String TEXT32 = "text32";
    public static final String TEXT33 = "text33";
    public static final String TEXT34 = "text34";
    public static final String TEXT35 = "text35";
    public static final String TEXT36 = "text36";
    private String text28,text29,text30,text31,text32,text33,text34,text35,text36;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_save3);

        mButton3 = findViewById(R.id.save3);
        view29 = findViewById(R.id.view28);
        view30 = findViewById(R.id.view29);
        view31 = findViewById(R.id.view30);
        view32 = findViewById(R.id.view31);
        view33 = findViewById(R.id.view32);
        view34 = findViewById(R.id.view33);
        view35 = findViewById(R.id.view34);
        view36 = findViewById(R.id.view35);
        view37 = findViewById(R.id.view36);

        nickname29 = findViewById(R.id.nickname28);
        nickname30 = findViewById(R.id.nickname29);
        nickname31 = findViewById(R.id.nickname30);
        nickname32 = findViewById(R.id.nickname31);
        nickname33 = findViewById(R.id.nickname32);
        nickname34 = findViewById(R.id.nickname33);
        nickname35 = findViewById(R.id.nickname34);
        nickname36 = findViewById(R.id.nickname35);
        nickname37 = findViewById(R.id.nickname36);
        mButton3.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {

                getString28= nickname29.getText().toString();
                getString29 = nickname30.getText().toString();
                getString30 = nickname31.getText().toString();
                getString31 = nickname32.getText().toString();
                getString32 = nickname33.getText().toString();
                getString33 = nickname34.getText().toString();
                getString34 = nickname35.getText().toString();
                getString35 = nickname36.getText().toString();
                getString36 = nickname37.getText().toString();

                view29.setText(getString28);
                view30.setText(getString29);
                view31.setText(getString30);
                view32.setText(getString31);
                view33.setText(getString32);
                view34.setText(getString33);
                view35.setText(getString34);
                view36.setText(getString35);
                view37.setText(getString36);

                String see28 = nickname29.getText().toString();
                String see29 = nickname30.getText().toString();
                String see30 = nickname31.getText().toString();
                String see31 = nickname32.getText().toString();
                String see32 = nickname33.getText().toString();
                String see33 = nickname34.getText().toString();
                String see34 = nickname35.getText().toString();
                String see35 = nickname36.getText().toString();
                String see36 = nickname37.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT28,view29.getText().toString());
                editor.putString(TEXT29,view30.getText().toString());
                editor.putString(TEXT30,view31.getText().toString());
                editor.putString(TEXT31,view32.getText().toString());
                editor.putString(TEXT32,view33.getText().toString());
                editor.putString(TEXT33,view34.getText().toString());
                editor.putString(TEXT34,view35.getText().toString());
                editor.putString(TEXT35,view36.getText().toString());
                editor.putString(TEXT36,view37.getText().toString());
                editor.apply();
                Intent intent = new Intent( save3.this,Curriculum.class );
                intent.putExtra("keyname28",see28);
                intent.putExtra("keyname29",see29);
                intent.putExtra("keyname30",see30);
                intent.putExtra("keyname31",see31);
                intent.putExtra("keyname32",see32);
                intent.putExtra("keyname33",see33);
                intent.putExtra("keyname34",see34);
                intent.putExtra("keyname35",see35);
                intent.putExtra("keyname36",see36);
                startActivity(intent);
            }
        });
        update3();

    }

    private void update3() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        text28 = sharedPreferences.getString(TEXT28, "");
        text29 = sharedPreferences.getString(TEXT29, "");
        text30 = sharedPreferences.getString(TEXT30, "");
        text31 = sharedPreferences.getString(TEXT31, "");
        text32 = sharedPreferences.getString(TEXT32, "");
        text33 = sharedPreferences.getString(TEXT33, "");
        text34 = sharedPreferences.getString(TEXT34, "");
        text35 = sharedPreferences.getString(TEXT35, "");
        text36 = sharedPreferences.getString(TEXT36, "");
        view29.setText(text28);
        view30.setText(text29);
        view31.setText(text30);
        view32.setText(text31);
        view33.setText(text32);
        view34.setText(text33);
        view35.setText(text34);
        view36.setText(text35);
        view37.setText(text36);
    }

}