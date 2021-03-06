package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DetailProfileActivity extends AppCompatActivity {

    
    //GITHUB TEST
    RecyclerView recyclerView;
    DetailProfileActivityAdapter adapter;
    GridLayoutManager layoutManager;

    private List<Bitmap> list = new ArrayList<>();

    public static Bitmap clickImage;
    private AppCompatImageButton backButton, menuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile);


        Bitmap bitmap1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person1);
        Bitmap bitmap2 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person2);
        Bitmap bitmap3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person3);
        Bitmap bitmap4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person4);
        Bitmap bitmap5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person5);
        Bitmap bitmap6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person1);
        Bitmap bitmap7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person2);
        Bitmap bitmap8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person3);
        Bitmap bitmap9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person4);
        Bitmap bitmap10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.person5);

        list.add(bitmap1);
        list.add(bitmap2);
        list.add(bitmap3);
        list.add(bitmap4);
        list.add(bitmap5);
        list.add(bitmap6);
        list.add(bitmap7);
        list.add(bitmap8);
        list.add(bitmap9);
        list.add(bitmap10);

        backButton = (AppCompatImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        menuButton = (AppCompatImageButton) findViewById(R.id.menuButton);



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new DetailProfileActivityAdapter(list, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Object obj = v.getTag();
                if (obj != null) {
                    int position = (int) obj;
                    Toast.makeText(DetailProfileActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
                    clickImage = null;
                    clickImage = list.get(position);
                    if (clickImage != null) {
                        Intent intent = new Intent(DetailProfileActivity.this, DetailProfileImageActivity.class);
                        startActivity(intent);
                    }

                }
            }
        });
        recyclerView.setAdapter(adapter);
    }
}