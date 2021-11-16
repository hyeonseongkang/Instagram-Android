package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "MainActivity";

    List<Bitmap> bitmap = new ArrayList<>();

    private AppCompatButton plusButton, heartButton, chatButton;

    RecyclerView recyclerView;
    HomeAdapter homeAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = (AppCompatButton) findViewById(R.id.plusButton);
        heartButton = (AppCompatButton) findViewById(R.id.heartButton);
        chatButton = (AppCompatButton) findViewById(R.id.chatButton);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "plusButton");
            }
        });

        heartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "heatButton");
            }
        });

        chatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "chatButton");
            }
        });

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.person1);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.person2);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.person3);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.person4);
        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.person5);
        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.person1);
        Bitmap bitmap7 = BitmapFactory.decodeResource(getResources(), R.drawable.person2);
        Bitmap bitmap8 = BitmapFactory.decodeResource(getResources(), R.drawable.person3);
        Bitmap bitmap9 = BitmapFactory.decodeResource(getResources(), R.drawable.person4);
        Bitmap bitmap10 = BitmapFactory.decodeResource(getResources(), R.drawable.person5);

        bitmap.add(bitmap1);
        bitmap.add(bitmap2);
        bitmap.add(bitmap3);
        bitmap.add(bitmap4);
        bitmap.add(bitmap5);
        bitmap.add(bitmap6);
        bitmap.add(bitmap7);
        bitmap.add(bitmap8);
        bitmap.add(bitmap9);
        bitmap.add(bitmap10);

        homeAdapter = new HomeAdapter(bitmap);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

    }
}