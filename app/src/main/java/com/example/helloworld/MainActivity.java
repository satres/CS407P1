package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Image image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
