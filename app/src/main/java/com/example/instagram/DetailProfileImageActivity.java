package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class DetailProfileImageActivity extends AppCompatActivity {

    Bitmap image;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile_image);
        image = DetailProfileActivity.clickImage;
        if(image == null) {
            finish();
        }
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageBitmap(image);

    }
}