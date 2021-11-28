package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DetailProfileImageActivity extends AppCompatActivity {

    Bitmap image;
    private ImageView imageView;
    private ImageButton finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile_image);
        image = DetailProfileActivity.clickImage;
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageBitmap(image);

        finishButton = (ImageButton) findViewById(R.id.finishButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}