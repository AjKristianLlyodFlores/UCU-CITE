package com.example.ucu_cite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.database.FirebaseDatabase;

public class Registered extends AppCompatActivity {
    EditText editfname, editLname, editidnum, editemail, editpass, editpass2, editcontact;
    FirebaseAuth mAuth;
    ProgressDialog progressDialog;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registered);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        editfname = findViewById(R.id.fname);
        editLname = findViewById(R.id.Lname);
        editidnum = findViewById(R.id.Idnum);
        editemail = findViewById(R.id.mEmail);
        editpass = findViewById(R.id.pass);
        editpass2 = findViewById(R.id.pass2);
        progressDialog = new ProgressDialog(this);

        editcontact = findViewById(R.id.contact);


        mAuth = FirebaseAuth.getInstance();

    }

    public void register(View view) {
        String name, name1, id, email, password,password1, contact;
        name = editfname.getText().toString().trim();
        name1 = editLname.getText().toString().trim();
        id = editidnum.getText().toString().trim();
        email = editemail.getText().toString().trim();
        password = editpass.getText().toString().trim();
        password1= editpass2.getText().toString().trim();
        contact = editcontact.getText().toString().trim();
        if (!email.matches(emailPattern)) {
            editemail.setError("Enter Correct Email");
        } else if (password.isEmpty() || password.length() < 6) {
            editpass.setError("Enter Proper Password");
        }else if(!password.equals(password1)){
            editpass2.setError("Password not Match both field");

        }else{
            progressDialog.setMessage("Please Wait Registration.....");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                User user = new User(name, name1, id, email, contact);
                                FirebaseDatabase.getInstance().getReference("Users")
                                        .child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {

                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()) {
                                            progressDialog.dismiss();
                                            sendUserToNextActivity();
                                            Toast.makeText(Registered.this,"Registration Successful", Toast.LENGTH_SHORT).show();
                                        } else {
                                            progressDialog.dismiss();
                                            Toast.makeText(Registered.this,"Registration is Failed "+task.getException(), Toast.LENGTH_SHORT).show();

                                        }
                                    }

                                });
                            }else {
                                Toast.makeText(Registered.this, "Registration is Failed", Toast.LENGTH_SHORT).show();
                            }
                        }

                    });

        }

    }
    private void sendUserToNextActivity() {
        Intent intent=new Intent(Registered.this,login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(Registered.this, login.class);
        startActivity(intent);
    }
}


