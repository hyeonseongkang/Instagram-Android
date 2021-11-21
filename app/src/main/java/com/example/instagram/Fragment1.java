package com.example.instagram;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.badge.BadgeDrawable;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {

    private View v;


    List<Bitmap> bitmap = new ArrayList<>();
    List<Home> homeList = new ArrayList<>();

    private AppCompatButton plusButton, heartButton, chatButton;

    RecyclerView recyclerView;
    HomeAdapter homeAdapter;
    RecyclerView.LayoutManager layoutManager;

    RecyclerView recyclerView2;
    HomeAdapter2 homeAdapter2;
    RecyclerView.LayoutManager layoutManager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.fragment_1, container, false);

        /*
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


        homeAdapter = new HomeAdapter(bitmap, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object obj = v.getTag();
                if (obj != null) {
                    int position = (int) obj;
                    Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        homeList.add(new Home(bitmap1, bitmap1, "test1", "textView1-1", "textView2"));
        homeList.add(new Home(bitmap2, bitmap2, "test2", "textView1-2", "textView2"));
        homeList.add(new Home(bitmap3, bitmap3, "test3", "textView1-3", "textView2"));
        homeList.add(new Home(bitmap4, bitmap4, "test4", "textView1-4", "textView2"));
        homeList.add(new Home(bitmap5, bitmap5, "test5", "textView1-5", "textView2"));
        homeList.add(new Home(bitmap6, bitmap6, "test6", "textView1-6", "textView2"));
        homeList.add(new Home(bitmap7, bitmap7, "test7", "textView1-7", "textView2"));
        homeList.add(new Home(bitmap8, bitmap8, "test8", "textView1-8", "textView2"));
        homeList.add(new Home(bitmap9, bitmap9, "test9", "textView1-9", "textView2"));
        homeList.add(new Home(bitmap10, bitmap10, "test10", "textView1-10", "textView2"));


        homeAdapter2 = new HomeAdapter2(homeList, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object obj = v.getTag();
                if (obj != null) {
                    int position = (int) obj;
                    Toast.makeText(MainActivity.this, homeList.get(position).getName(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        recyclerView2 = (RecyclerView) findViewById(R.id.recyclerView2);
        recyclerView2.setAdapter(homeAdapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
         */

        return v;
    }
}