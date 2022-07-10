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

public class save5 extends AppCompatActivity {
    public Button mButton5;
    public TextView view46;
    public EditText nickname46;
    public String getString45;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT45 = "text45";
    private String text45;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        
        setContentView(R.layout.activity_save5);
        mButton5 = findViewById(R.id.save5);
        view46 = findViewById(R.id.view45);

        nickname46 = findViewById(R.id.nickname45);

        mButton5.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                getString45 = nickname46.getText().toString();
                view46.setText(getString45);

                String see45 = nickname46.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT45,view46.getText().toString());
                editor.apply();
                Intent intent = new Intent( save5.this,Curriculum.class );
                intent.putExtra("keyname45",see45);
                
                startActivity(intent);
            }
        });
        update5();

    }

    private void update5() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        text45 = sharedPreferences.getString(TEXT45, "");
        view46.setText(text45);

    }


}

 