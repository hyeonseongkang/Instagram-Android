package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "MainActivity";

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id) {
                    case R.id.friendslist:
                        setFrag(0);
                        break;
                    case R.id.chatting:

                        setFrag(1);
                        break;

                    case R.id.sharp:
                        setFrag(2);
                        break;

                    case R.id.setting:
                        setFrag(3);
                        break;

                }
                return true;
            }
        });
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();



        setFrag(0);
    }


    private void setFrag(int n) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        switch(n) {
            case 0:
                fragmentTransaction.replace(R.id.frame, fragment1);
                fragmentTransaction.commit();
                break;
            case 1:
                fragmentTransaction.replace(R.id.frame, fragment2);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentTransaction.replace(R.id.frame, fragment3);
                fragmentTransaction.commit();
                break;
            case 3:
                fragmentTransaction.replace(R.id.frame, fragment4);
                fragmentTransaction.commit();
                break;
        }
    }
}