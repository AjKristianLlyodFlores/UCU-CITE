package com.example.ucu_cite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Profile extends AppCompatActivity {
    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_profile);
        logout = (Button) findViewById(R.id.signOut);

        logout.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Profile.this,hub.class));
            }
        });
        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView greetingTextView = (TextView) findViewById(R.id.greeting);
        final TextView nameTextView = (TextView) findViewById(R.id.name);
        final TextView emailTextView = (TextView) findViewById(R.id.email);
        final TextView name1TextView = (TextView) findViewById(R.id.name1);
        final TextView idTextView = (TextView) findViewById(R.id.idnum);
        final TextView contactTextView = (TextView) findViewById(R.id.contact);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener( ) {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if(userProfile != null){
                    String name = userProfile.name;
                    String email = userProfile.email;
                    String contact = userProfile.contact;
                    String idnum = userProfile.idnum;
                    String name1 = userProfile.name1;



                    greetingTextView.setText("Profile," + name + "!");
                    nameTextView.setText(name);
                    emailTextView.setText(email);
                    name1TextView.setText(name1);
                    idTextView.setText(idnum);
                    contactTextView.setText(contact);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(Profile.this, "Something Wrong", Toast.LENGTH_SHORT).show( );

            }
        });


    }
}