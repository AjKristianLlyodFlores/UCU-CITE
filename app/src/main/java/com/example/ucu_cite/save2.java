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

public class save2 extends AppCompatActivity {
    public Button mButton2;
    public TextView view21,view22,view23,view24,view25,view26,view27,view28;
    public EditText nickname21,nickname22,nickname23,nickname24,nickname25,nickname26,nickname27,nickname28;
    public String getString20,getString21,getString22,getString23,getString24,getString25,getString26,getString27;
    public static final String SHARED_PREF = "shared";
    public static final String TEXT20 = "text20";
    public static final String TEXT21 = "text21";
    public static final String TEXT22 = "text22";
    public static final String TEXT23 = "text23";
    public static final String TEXT24 = "text24";
    public static final String TEXT25 = "text25";
    public static final String TEXT26 = "text26";
    public static final String TEXT27 = "text27";
    private String text20,text21,text22,text23,text24,text25,text26,text27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_save2);

        mButton2 = findViewById(R.id.save2);
        view21 = findViewById(R.id.view20);
        view22 = findViewById(R.id.view21);
        view23 = findViewById(R.id.view22);
        view24 = findViewById(R.id.view23);
        view25 = findViewById(R.id.view24);
        view26 = findViewById(R.id.view25);
        view27 = findViewById(R.id.view26);
        view28 = findViewById(R.id.view27);

        nickname21 = findViewById(R.id.nickname20);
        nickname22 = findViewById(R.id.nickname21);
        nickname23 = findViewById(R.id.nickname22);
        nickname24 = findViewById(R.id.nickname23);
        nickname25 = findViewById(R.id.nickname24);
        nickname26 = findViewById(R.id.nickname25);
        nickname27 = findViewById(R.id.nickname26);
        nickname28 = findViewById(R.id.nickname27);

        mButton2.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                getString20= nickname21.getText().toString();
                getString21 = nickname22.getText().toString();
                getString22 = nickname23.getText().toString();
                getString23 = nickname24.getText().toString();
                getString24 = nickname25.getText().toString();
                getString25 = nickname26.getText().toString();
                getString26 = nickname27.getText().toString();
                getString27 = nickname28.getText().toString();

                view21.setText(getString20);
                view22.setText(getString21);
                view23.setText(getString22);
                view24.setText(getString23);
                view25.setText(getString24);
                view26.setText(getString25);
                view27.setText(getString26);
                view28.setText(getString27);

                String see20 = nickname21.getText().toString();
                String see21 = nickname22.getText().toString();
                String see22 = nickname23.getText().toString();
                String see23 = nickname24.getText().toString();
                String see24 = nickname25.getText().toString();
                String see25 = nickname26.getText().toString();
                String see26 = nickname27.getText().toString();
                String see27 = nickname28.getText().toString();

                SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(TEXT20,view21.getText().toString());
                editor.putString(TEXT21,view22.getText().toString());
                editor.putString(TEXT22,view23.getText().toString());
                editor.putString(TEXT23,view24.getText().toString());
                editor.putString(TEXT24,view25.getText().toString());
                editor.putString(TEXT25,view26.getText().toString());
                editor.putString(TEXT26,view27.getText().toString());
                editor.putString(TEXT27,view28.getText().toString());
                editor.apply();
                Intent intent = new Intent( save2.this,Curriculum.class );
                intent.putExtra("keyname20",see20);
                intent.putExtra("keyname21",see21);
                intent.putExtra("keyname22",see22);
                intent.putExtra("keyname23",see23);
                intent.putExtra("keyname24",see24);
                intent.putExtra("keyname25",see25);
                intent.putExtra("keyname26",see26);
                intent.putExtra("keyname27",see27);
                startActivity(intent);
            }
        });
        update2();

    }

    private void update2() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        text20 = sharedPreferences.getString(TEXT20, "");
        text21 = sharedPreferences.getString(TEXT21, "");
        text22 = sharedPreferences.getString(TEXT22, "");
        text23 = sharedPreferences.getString(TEXT23, "");
        text24 = sharedPreferences.getString(TEXT24, "");
        text25 = sharedPreferences.getString(TEXT25, "");
        text26 = sharedPreferences.getString(TEXT26, "");
        text27 = sharedPreferences.getString(TEXT27, "");
        view21.setText(text20);
        view22.setText(text21);
        view23.setText(text22);
        view24.setText(text23);
        view25.setText(text24);
        view26.setText(text25);
        view27.setText(text26);
        view28.setText(text27);
    }

}