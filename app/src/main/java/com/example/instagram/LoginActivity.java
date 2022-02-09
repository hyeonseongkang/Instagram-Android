package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    
    public static String TAG = "LoginActivity";

    private FirebaseDatabase instance = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = instance.getReference("users");

    private List<User> userList = new ArrayList<>();

    private AppCompatButton loginButton;

    private EditText userId, userPw;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userId = (EditText) findViewById(R.id.userId);
        userPw = (EditText) findViewById(R.id.userPw);

        loginButton = (AppCompatButton) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id = userId.getText().toString();
                String pw = userPw.getText().toString();

                if (id.length() >= 0 || pw.length() >= 0) {
                    return;
                }

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        userList.clear();
                        for (DataSnapshot snapshot1: snapshot.getChildren()) {
                            User user = snapshot1.getValue(User.class);
                            Log.d(TAG, user.getId()) ;
                            Log.d(TAG, user.getPassword());
                            userList.add(user);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });



            }
        });
    }
}