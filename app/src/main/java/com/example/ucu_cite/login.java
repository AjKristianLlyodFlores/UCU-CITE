package com.example.ucu_cite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.view.Window;
import android.widget.EditText;

import android.widget.Toast;
import android.view.WindowManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;



public class login extends AppCompatActivity {
    EditText editemail, editpass;
    FirebaseAuth mAuth;
    ProgressDialog progressDialog;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        editemail = findViewById(R.id.mEmail);
        editpass = findViewById(R.id.pass);
        mAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

    }

    public void Toreg(View view) {
        Intent intent = new Intent(login.this, Registered.class);
        startActivity(intent);
    }

    public void login(View view) {
        String email = editemail.getText().toString().trim();
        String password =editpass.getText().toString().trim();


        if (!email.matches(emailPattern)) {
            editemail.setError("Enter Correct Email");

        } else if (password.isEmpty() || password.length() < 6) {
            editpass.setError("Enter Proper Password");

        } else {
            progressDialog.setMessage("Please Wait Login.....");
            progressDialog.setTitle("Login");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this,new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        progressDialog.dismiss();
                        sendUserToNextActivity();
                        Toast.makeText(login.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), hub.class));
                    }else{
                        progressDialog.dismiss();
                         Toast.makeText(login.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void sendUserToNextActivity() {
        Intent intent=new Intent(this,login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
