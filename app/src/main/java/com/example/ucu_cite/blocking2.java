package com.example.ucu_cite;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class blocking2 extends AppCompatActivity {
    ImageView imageView,imageView1,imageView2,imageView3,imageView4;
    ImageButton button,button1,button2,button3,button4;
    Bitmap bitmap;
    private static final int WRITE_EXTERNAL_STORAGE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_blocking2);



        button = findViewById(R.id.dimg);
        imageView = findViewById(R.id.saveimg);
        button1 = findViewById(R.id.dimg1);
        imageView1= findViewById(R.id.saveimg1);
        button2 = findViewById(R.id.dimg2);
        imageView2 = findViewById(R.id.saveimg3);
        button3 = findViewById(R.id.dimg3);
        imageView3 = findViewById(R.id.saveimg4);
        button4 = findViewById(R.id.dimg4);
        imageView4 = findViewById(R.id.saveimg5);

        String img ="https://scontent.fmnl17-2.fna.fbcdn.net/v/t39.30808-6/281498804_3180636465557845_1620750633407113838_n.png?_nc_cat=107&ccb=1-7&_nc_sid=730e14&_nc_eui2=AeEJv3dQqteqIIhsQtO8lbpTSp6h5wIOWLNKnqHnAg5YswIetZzbdS_D-CLIk6kvRT9lnTFYB0Wzj09cnQ_ip3lN&_nc_ohc=7SMPovd8W5QAX8jCCKG&tn=SlkNPf8r3sNLbp9R&_nc_ht=scontent.fmnl17-2.fna&oh=00_AT_sAHpzt9KSbnu9zSK3WBUerOm4Iw3r3GZ-b9lw4YJLOg&oe=62CF2387";
        String img1 ="https://scontent.fmnl17-2.fna.fbcdn.net/v/t39.30808-6/281498804_3180636465557845_1620750633407113838_n.png?_nc_cat=107&ccb=1-7&_nc_sid=730e14&_nc_eui2=AeEJv3dQqteqIIhsQtO8lbpTSp6h5wIOWLNKnqHnAg5YswIetZzbdS_D-CLIk6kvRT9lnTFYB0Wzj09cnQ_ip3lN&_nc_ohc=7SMPovd8W5QAX8jCCKG&tn=SlkNPf8r3sNLbp9R&_nc_ht=scontent.fmnl17-2.fna&oh=00_AT_sAHpzt9KSbnu9zSK3WBUerOm4Iw3r3GZ-b9lw4YJLOg&oe=62CF2387";
        String img2 ="https://scontent.fmnl17-2.fna.fbcdn.net/v/t39.30808-6/281498804_3180636465557845_1620750633407113838_n.png?_nc_cat=107&ccb=1-7&_nc_sid=730e14&_nc_eui2=AeEJv3dQqteqIIhsQtO8lbpTSp6h5wIOWLNKnqHnAg5YswIetZzbdS_D-CLIk6kvRT9lnTFYB0Wzj09cnQ_ip3lN&_nc_ohc=7SMPovd8W5QAX8jCCKG&tn=SlkNPf8r3sNLbp9R&_nc_ht=scontent.fmnl17-2.fna&oh=00_AT_sAHpzt9KSbnu9zSK3WBUerOm4Iw3r3GZ-b9lw4YJLOg&oe=62CF2387";
        String img3 ="https://scontent.fmnl17-2.fna.fbcdn.net/v/t39.30808-6/281498804_3180636465557845_1620750633407113838_n.png?_nc_cat=107&ccb=1-7&_nc_sid=730e14&_nc_eui2=AeEJv3dQqteqIIhsQtO8lbpTSp6h5wIOWLNKnqHnAg5YswIetZzbdS_D-CLIk6kvRT9lnTFYB0Wzj09cnQ_ip3lN&_nc_ohc=7SMPovd8W5QAX8jCCKG&tn=SlkNPf8r3sNLbp9R&_nc_ht=scontent.fmnl17-2.fna&oh=00_AT_sAHpzt9KSbnu9zSK3WBUerOm4Iw3r3GZ-b9lw4YJLOg&oe=62CF2387";
        String img4 ="https://scontent.fmnl17-2.fna.fbcdn.net/v/t39.30808-6/281498804_3180636465557845_1620750633407113838_n.png?_nc_cat=107&ccb=1-7&_nc_sid=730e14&_nc_eui2=AeEJv3dQqteqIIhsQtO8lbpTSp6h5wIOWLNKnqHnAg5YswIetZzbdS_D-CLIk6kvRT9lnTFYB0Wzj09cnQ_ip3lN&_nc_ohc=7SMPovd8W5QAX8jCCKG&tn=SlkNPf8r3sNLbp9R&_nc_ht=scontent.fmnl17-2.fna&oh=00_AT_sAHpzt9KSbnu9zSK3WBUerOm4Iw3r3GZ-b9lw4YJLOg&oe=62CF2387";
        Picasso.get().load(img4).into(imageView4);
        Picasso.get().load(img3).into(imageView3);
        Picasso.get().load(img).into(imageView);
        Picasso.get().load(img2).into(imageView2);

        Picasso.get().load(img1).into(imageView1);



        button.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,WRITE_EXTERNAL_STORAGE_CODE);
                    }
                    else {
                        saveimage();
                    }
                }


            }
        });
        button4.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,WRITE_EXTERNAL_STORAGE_CODE);
                    }
                    else {
                        saveimage4();
                    }
                }


            }
        });
        button3.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,WRITE_EXTERNAL_STORAGE_CODE);
                    }
                    else {
                        saveimage3();
                    }
                }


            }
        });

        button2.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,WRITE_EXTERNAL_STORAGE_CODE);
                    }
                    else {
                        saveimage2();
                    }
                }


            }
        });
        button1.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==PackageManager.PERMISSION_DENIED) {
                        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,WRITE_EXTERNAL_STORAGE_CODE);
                    }
                    else {
                        saveimage1();
                    }
                }


            }
        });

    }
    private void saveimage4() {
        bitmap = ((BitmapDrawable)imageView4.getDrawable()).getBitmap();


        String time = new SimpleDateFormat( "yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());

        File path = Environment.getExternalStorageDirectory();
        File dir = new File(path+"/DCIM");
        dir.mkdirs();
        String imagename = time+".PNG";
        File file = new File(dir,imagename);
        OutputStream out;

        try{
            out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);

            out.flush();
            out.close();
            Toast.makeText(blocking2.this, "Image Save in DCIM", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(blocking2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void saveimage3() {
        bitmap = ((BitmapDrawable)imageView3.getDrawable()).getBitmap();


        String time = new SimpleDateFormat( "yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());

        File path = Environment.getExternalStorageDirectory();
        File dir = new File(path+"/DCIM");
        dir.mkdirs();
        String imagename = time+".PNG";
        File file = new File(dir,imagename);
        OutputStream out;

        try{
            out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);

            out.flush();
            out.close();
            Toast.makeText(blocking2.this, "Image Save in DCIM", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(blocking2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void saveimage2() {
        bitmap = ((BitmapDrawable)imageView2.getDrawable()).getBitmap();


        String time = new SimpleDateFormat( "yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());

        File path = Environment.getExternalStorageDirectory();
        File dir = new File(path+"/DCIM");
        dir.mkdirs();
        String imagename = time+".PNG";
        File file = new File(dir,imagename);
        OutputStream out;

        try{
            out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);

            out.flush();
            out.close();
            Toast.makeText(blocking2.this, "Image Save in DCIM", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(blocking2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void saveimage1() {
        bitmap = ((BitmapDrawable)imageView1.getDrawable()).getBitmap();


        String time = new SimpleDateFormat( "yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());

        File path = Environment.getExternalStorageDirectory();
        File dir = new File(path+"/DCIM");
        dir.mkdirs();
        String imagename = time+".PNG";
        File file = new File(dir,imagename);
        OutputStream out;

        try{
            out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);

            out.flush();
            out.close();
            Toast.makeText(blocking2.this, "Image Save in DCIM", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(blocking2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    private void saveimage() {
        bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();


        String time = new SimpleDateFormat( "yyyyMMdd_HHmmss", Locale.getDefault()).format(System.currentTimeMillis());

        File path = Environment.getExternalStorageDirectory();
        File dir = new File(path+"/DCIM");
        dir.mkdirs();
        String imagename = time+".PNG";
        File file = new File(dir,imagename);
        OutputStream out;

        try{
            out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG,100,out);

            out.flush();
            out.close();
            Toast.makeText(blocking2.this, "Image Save in DCIM", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(blocking2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void chekSelfPermission(String writeExternalStorage) {
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {


        switch (requestCode) {
            case WRITE_EXTERNAL_STORAGE_CODE: {
                if (grantResults.length > 0 && grantResults[0] ==

                        PackageManager.PERMISSION_GRANTED) {

                } else {
                    Toast.makeText(this, "Permission enable", Toast.LENGTH_SHORT).show( );
                }
            }
        }
    }
}



