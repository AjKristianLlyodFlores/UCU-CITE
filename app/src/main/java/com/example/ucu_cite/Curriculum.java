package com.example.ucu_cite;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Curriculum extends AppCompatActivity {
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

    public static final String TEXT20 = "text20";
    public static final String TEXT21 = "text21";
    public static final String TEXT22 = "text22";
    public static final String TEXT23 = "text23";
    public static final String TEXT24 = "text24";
    public static final String TEXT25 = "text25";
    public static final String TEXT26 = "text26";
    public static final String TEXT27 = "text27";

    public static final String TEXT28 = "text28";
    public static final String TEXT29 = "text29";
    public static final String TEXT30 = "text30";
    public static final String TEXT31 = "text31";
    public static final String TEXT32 = "text32";
    public static final String TEXT33 = "text33";
    public static final String TEXT34 = "text34";
    public static final String TEXT35 = "text35";
    public static final String TEXT36 = "text36";

    public static final String TEXT37 = "text37";
    public static final String TEXT38 = "text38";
    public static final String TEXT39 = "text39";
    public static final String TEXT40 = "text40";
    public static final String TEXT41 = "text41";
    public static final String TEXT42 = "text42";
    public static final String TEXT43 = "text43";
    public static final String TEXT44 = "text44";
    public static final String TEXT45 = "text45";

    private String text,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,text17,text18,text19,text20,text21,text22,text23,text24,text25,text26,text27
            ,text28,text29,text30,text31,text32,text33,text34,text35,text36,text37,text38,text39,text40,text41,text42,text43,text44,text45;

    TextView g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,g21,g22,g23,g24,g25,g26,g27,g28,g29,g30,g31,g32,g33,g34,g35,g36,g37,g38,g39,g40,g41,g42,g43,g44,g45,g57;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_curriculum);

        g1 = findViewById(R.id.g1);
        g2 = findViewById(R.id.g2);
        g3 = findViewById(R.id.g3);
        g4 = findViewById(R.id.g4);
        g5 = findViewById(R.id.g5);
        g6 = findViewById(R.id.g6);
        g7 = findViewById(R.id.g7);
        g8 = findViewById(R.id.g8);
        g9 = findViewById(R.id.g9);
        g10 = findViewById(R.id.g10);
        g11 = findViewById(R.id.g11);
        g12 = findViewById(R.id.g12);
        g13 = findViewById(R.id.g13);
        g14 = findViewById(R.id.g14);
        g15 = findViewById(R.id.g15);
        g16 = findViewById(R.id.g16);
        g17 = findViewById(R.id.g17);
        g18 = findViewById(R.id.g18);
        g19 = findViewById(R.id.g19);
        g20 = findViewById(R.id.g20);

        g21 = findViewById(R.id.g21);
        g22 = findViewById(R.id.g22);
        g23 = findViewById(R.id.g23);
        g24 = findViewById(R.id.g24);
        g25 = findViewById(R.id.g25);
        g26 = findViewById(R.id.g26);
        g27 = findViewById(R.id.g27);
        g28 = findViewById(R.id.g28);

        g29 = findViewById(R.id.g29);
        g30 = findViewById(R.id.g30);
        g31 = findViewById(R.id.g31);
        g32 = findViewById(R.id.g32);
        g33 = findViewById(R.id.g33);
        g34 = findViewById(R.id.g34);
        g35 = findViewById(R.id.g35);
        g36 = findViewById(R.id.g36);
        g37 = findViewById(R.id.g37);

        g38 = findViewById(R.id.g38);
        g39 = findViewById(R.id.g39);
        g40 = findViewById(R.id.g40);
        g41 = findViewById(R.id.g41);
        g42 = findViewById(R.id.g42);
        g43 = findViewById(R.id.g43);
        g44 = findViewById(R.id.g44);
        g45 = findViewById(R.id.g45);
        g57 = findViewById(R.id.g57);

//        g1.setOnClickListener(new View.OnClickListener( ) {
//            @Override
//            public void onClick(View view) {
//                openDialog();
//            }
//        });


        String see = getIntent().getStringExtra("keyname");
        String see1 = getIntent().getStringExtra("keyname1");
        String see2 = getIntent().getStringExtra("keyname2");
        String see3 = getIntent().getStringExtra("keyname3");
        String see4 = getIntent().getStringExtra("keyname4");
        String see5 = getIntent().getStringExtra("keyname5");
        String see6 = getIntent().getStringExtra("keyname6");
        String see7 = getIntent().getStringExtra("keyname7");
        String see8 = getIntent().getStringExtra("keyname8");
        String see9 = getIntent().getStringExtra("keyname9");

        String see10 = getIntent().getStringExtra("keyname10");
        String see11 = getIntent().getStringExtra("keyname11");
        String see12 = getIntent().getStringExtra("keyname12");
        String see13 = getIntent().getStringExtra("keyname13");
        String see14 = getIntent().getStringExtra("keyname14");
        String see15 = getIntent().getStringExtra("keyname15");
        String see16 = getIntent().getStringExtra("keyname16");
        String see17 = getIntent().getStringExtra("keyname17");
        String see18 = getIntent().getStringExtra("keyname18");
        String see19 = getIntent().getStringExtra("keyname19");

        String see20 = getIntent().getStringExtra("keyname20");
        String see21 = getIntent().getStringExtra("keyname21");
        String see22 = getIntent().getStringExtra("keyname22");
        String see23 = getIntent().getStringExtra("keyname23");
        String see24 = getIntent().getStringExtra("keyname24");
        String see25 = getIntent().getStringExtra("keyname25");
        String see26 = getIntent().getStringExtra("keyname26");
        String see27 = getIntent().getStringExtra("keyname27");

        String see28 = getIntent().getStringExtra("keyname28");
        String see29 = getIntent().getStringExtra("keyname29");
        String see30 = getIntent().getStringExtra("keyname30");
        String see31 = getIntent().getStringExtra("keyname31");
        String see32 = getIntent().getStringExtra("keyname32");
        String see33 = getIntent().getStringExtra("keyname33");
        String see34 = getIntent().getStringExtra("keyname34");
        String see35 = getIntent().getStringExtra("keyname35");
        String see36 = getIntent().getStringExtra("keyname36");

        String see37 = getIntent().getStringExtra("keyname37");
        String see38 = getIntent().getStringExtra("keyname38");
        String see39 = getIntent().getStringExtra("keyname39");
        String see40 = getIntent().getStringExtra("keyname40");
        String see41 = getIntent().getStringExtra("keyname41");
        String see42 = getIntent().getStringExtra("keyname42");
        String see43 = getIntent().getStringExtra("keyname43");
        String see44 = getIntent().getStringExtra("keyname44");
        String see45 = getIntent().getStringExtra("keyname45");

        g1.setText(see);
        g2.setText(see1);
        g3.setText(see2);
        g4.setText(see3);
        g5.setText(see4);
        g6.setText(see5);
        g7.setText(see6);
        g8.setText(see7);
        g9.setText(see8);
        g10.setText(see9);

        g11.setText(see10);
        g12.setText(see11);
        g13.setText(see12);
        g14.setText(see13);
        g15.setText(see14);
        g16.setText(see15);
        g17.setText(see16);
        g18.setText(see17);
        g19.setText(see18);
        g20.setText(see19);

        g21.setText(see20);
        g22.setText(see21);
        g23.setText(see22);
        g24.setText(see23);
        g25.setText(see24);
        g26.setText(see25);
        g27.setText(see26);
        g28.setText(see27);


        g29.setText(see28);
        g30.setText(see29);
        g31.setText(see30);
        g32.setText(see31);
        g33.setText(see32);
        g34.setText(see33);
        g35.setText(see34);
        g36.setText(see35);
        g37.setText(see36);

        g38.setText(see37);
        g39.setText(see38);
        g40.setText(see39);
        g41.setText(see40);
        g42.setText(see41);
        g43.setText(see42);
        g44.setText(see43);
        g45.setText(see44);
        g57.setText(see45);


        update();
        update1();
        update2();
        update3();
        update4();
        update5();
    }

    private void update5() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);

        text45 = sharedPreferences.getString(TEXT45, "");
        g57.setText(text45);
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

        g38.setText(text37);
        g39.setText(text38);
        g40.setText(text39);
        g41.setText(text40);
        g42.setText(text41);
        g43.setText(text42);
        g44.setText(text43);
        g45.setText(text44);

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
        g29.setText(text28);
        g30.setText(text29);
        g31.setText(text30);
        g32.setText(text31);
        g33.setText(text32);
        g34.setText(text33);
        g35.setText(text34);
        g36.setText(text35);
        g37.setText(text36);
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
        g21.setText(text20);
        g22.setText(text21);
        g23.setText(text22);
        g24.setText(text23);
        g25.setText(text24);
        g26.setText(text25);
        g27.setText(text26);
        g28.setText(text27);

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

        g11.setText(text10);
        g12.setText(text11);
        g13.setText(text12);
        g14.setText(text13);
        g15.setText(text14);
        g16.setText(text15);
        g17.setText(text16);
        g18.setText(text17);
        g19.setText(text18);
        g20.setText(text19);
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

        g1.setText(text);
        g2.setText(text1);
        g3.setText(text2);
        g4.setText(text3);
        g5.setText(text4);
        g6.setText(text5);
        g7.setText(text6);
        g8.setText(text7);
        g9.setText(text8);
        g10.setText(text9);

    }



    public void g1(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);

    }

    public void bb(View view) {
        Intent intent = new Intent(Curriculum.this, hub.class);
        startActivity(intent);
    }

    public void g2(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g3(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g4(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g5(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g6(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g7(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g8(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }

    public void g9(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }
    public void g10(View view) {
        Intent intent = new Intent(Curriculum.this, save.class);
        startActivity(intent);
    }

    public void g11(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g12(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g13(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g14(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g15(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g16(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g17(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g18(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g19(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g20(View view) {
        Intent intent = new Intent(Curriculum.this, save1.class);
        startActivity(intent);
    }
    public void g21(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g22(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g23(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g24(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g25(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g26(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g27(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g28(View view) {
        Intent intent = new Intent(Curriculum.this, save2.class);
        startActivity(intent);
    }
    public void g29(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g30(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g31(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g32(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g33(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g34(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g35(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g36(View view) {
        Intent intent = new Intent(Curriculum.this, save3.class);
        startActivity(intent);
    }
    public void g37(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }
    public void g38(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g39(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g40(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g41(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g42(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g43(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g44(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }

    public void g45(View view) {
        Intent intent = new Intent(Curriculum.this, save4.class);
        startActivity(intent);
    }
    public void g57(View view) {
        Intent intent = new Intent(Curriculum.this, save5.class);
        startActivity(intent);
    }


    public void bk(View view) {
        Intent intent = new Intent(Curriculum.this, hub.class);
        startActivity(intent);

    }


//    private void openDialog() {
//        ExampleDialog exampleDialog = new ExampleDialog();
//        exampleDialog.show(getSupportFragmentManager(), "example dialog");
//    }
//
//    @Override
//    public void applyTexts(String grade1, String grade2) {
//        g1.setText(grade1);
//        g2.setText(grade2);
//    }
}