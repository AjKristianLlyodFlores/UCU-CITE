package com.example.ucu_cite;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
    String contact = "[0-9]";
    float v = 0;
    Button registerBtn;

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
        registerBtn = findViewById(R.id.registerBtn);
        editidnum = findViewById(R.id.Idnum);
        editemail = findViewById(R.id.email);
        editpass = findViewById(R.id.pass);
        editpass2 = findViewById(R.id.pass2);
        editcontact = findViewById(R.id.contact);
        progressDialog = new ProgressDialog(this);

        editemail.setTranslationX(800);
        editpass.setTranslationX(800);
        editfname.setTranslationX(800);
        editLname.setTranslationX(800);
        editpass2.setTranslationX(800);
        editidnum.setTranslationX(800);
        editcontact.setTranslationX(800);
        registerBtn.setTranslationX(800);


        editemail.setAlpha(v);
        editpass.setAlpha(v);
        editpass2.setAlpha(v);
        editfname.setAlpha(v);
        editLname.setAlpha(v);
        editidnum.setAlpha(v);
        editcontact.setAlpha(v);
        editpass.setAlpha(v);
        registerBtn.setAlpha(v);



        editemail.animate().translationX (0).alpha (1).setDuration (500).setStartDelay(300).start();
        editpass.animate().translationX(0).alpha (1).setDuration (500).setStartDelay(300).start();
        editpass2.animate().translationX (0).alpha (1).setDuration (500).setStartDelay(300).start();
        editfname.animate().translationX(0).alpha (1).setDuration (500).setStartDelay(300).start();
        editLname.animate().translationX (0).alpha (1).setDuration (500).setStartDelay(300).start();
        editidnum.animate().translationX(0).alpha (1).setDuration (500).setStartDelay(300).start();
        editcontact.animate().translationX(0).alpha (1).setDuration (500).setStartDelay(300).start();
        registerBtn.animate().translationX(0).alpha (1).setDuration (500).setStartDelay(300).start();



        mAuth = FirebaseAuth.getInstance();


    }

    public void register(View view) {
        String name, name1, idnum, email, password,password1, contact;
        name = editfname.getText().toString().trim();
        name1 = editLname.getText().toString().trim();
        idnum = editidnum.getText().toString().trim();
        email = editemail.getText().toString().trim();
        password = editpass.getText().toString().trim();
        password1= editpass2.getText().toString().trim();
        contact = editcontact.getText().toString().trim();
        if (!email.matches(emailPattern)) {
            editemail.setError("Enter Correct Email");
        } else if (password.isEmpty() || password.length() < 6) {
            editpass.setError("Enter 6 character above");
        }else if(!password.equals(password1)) {
            editpass2.setError("Password not Match both field");

        }
        else{
            progressDialog.setMessage("Please Wait Registration.....");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();


            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {
                                User user = new User(name,name1,password,idnum,email,contact);
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
        Intent intent=new Intent(Registered.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void btnlogin(View view) {
        Intent intent = new Intent(Registered.this, MainActivity.class);
        startActivity(intent);
    }
}


