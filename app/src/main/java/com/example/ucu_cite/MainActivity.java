package com.example.ucu_cite;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    EditText editemail, editpass;
    FirebaseAuth mAuth;
    ProgressDialog progressDialog;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    float v = 0;
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    ImageView googleBtn,logo;

    Button loginBtn;
    Animation scaleUp,scaleDown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow( ).setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar( ).hide( );
        setContentView(R.layout.activity_main);


        googleBtn = findViewById(R.id.google);
        logo = findViewById(R.id.logo);



        logo.setOnTouchListener(new View.OnTouchListener( ) {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if (motionEvent.getAction()== MotionEvent.ACTION_UP){
                    logo.startAnimation(scaleDown);

                }else if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){

                    logo.startAnimation(scaleUp);

                }




                return true;
            }
        });


        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);


        editemail = findViewById(R.id.mEmail);
        loginBtn = findViewById(R.id.loginBtn);
        editpass = findViewById(R.id.pass);


        editemail.setTranslationX(800);
        editpass.setTranslationX(800);
        loginBtn.setTranslationX(800);


        editemail.setAlpha(v);
        editpass.setAlpha(v);
        loginBtn.setAlpha(v);


        editemail.animate( ).translationX(0).alpha(1).setDuration(500).setStartDelay(300).start( );
        editpass.animate( ).translationX(0).alpha(1).setDuration(500).setStartDelay(300).start( );
        loginBtn.animate( ).translationX(0).alpha(1).setDuration(500).setStartDelay(300).start( );




        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail( ).build( );
        gsc = GoogleSignIn.getClient(this, gso);

//        LoginManager.getInstance( ).registerCallback(callbackManager,
//                new FacebookCallback<LoginResult>( ) {
//                    @Override
//                    public void onSuccess(LoginResult loginResult) {
//                        startActivity(new Intent(MainActivity.this,hub.class));
//                        finish( );
//                    }
//
//                    @Override
//                    public void onCancel() {
//                        // App code
//                    }
//
//                    @Override
//                    public void onError(FacebookException exception) {
//                        // App code
//                    }
//                });


        googleBtn.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                signIn( );
            }

        });


        editemail = findViewById(R.id.mEmail);
        editpass = findViewById(R.id.pass);
        mAuth = FirebaseAuth.getInstance( );
        progressDialog = new ProgressDialog(this);


    }


    void signIn() {
        Intent signInIntent = gsc.getSignInIntent( );
        startActivityForResult(signInIntent, 1000);

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1000) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                task.getResult(ApiException.class);
                navigateToSecondActivity( );
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext( ), "Something went wrong", Toast.LENGTH_SHORT).show( );
            }
        }
    }



//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        callbackManager.onActivityResult(requestCode, resultCode, data);
//        super.onActivityResult(requestCode, resultCode, data);
//
//    }


    void navigateToSecondActivity(){
        finish();
        Intent i = new Intent(this,hub.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);



    }



    public void Toreg(View view) {
        Intent i = new Intent(this,Registered.class );
        Bundle b = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,b);
    }



    public void login(View view) {
        String email = editemail.getText().toString().trim();
        String password =editpass.getText().toString().trim();

        if (!email.matches(emailPattern)) {
            editemail.setError("Enter Proper Email");

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
                        Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), hub.class));

                    }else{
                        progressDialog.dismiss();
                        Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void sendUserToNextActivity() {
        Intent intent=new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
