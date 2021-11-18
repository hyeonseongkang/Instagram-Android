package com.example.instagram;

import android.graphics.Bitmap;
import android.widget.TextView;

public class Home {
    private Bitmap profile;
    private Bitmap imageView;
    private String name, textView1, textView2;

    public Home() {}

    public Home(Bitmap profile, Bitmap imageView, String name, String textView1, String textView2) {
        this.profile = profile;
        this.imageView = imageView;
        this.name = name;
        this.textView1 = textView1;
        this.textView2 = textView2;
    }

    public Bitmap getProfile() {
        return profile;
    }

    public void setProfile(Bitmap profile) {
        this.profile = profile;
    }

    public Bitmap getImageView() {
        return imageView;
    }

    public void setImageView(Bitmap imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTextView1() {
        return textView1;
    }

    public void setTextView1(String textView1) {
        this.textView1 = textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public void setTextView2(String textView2) {
        this.textView2 = textView2;
    }
}
