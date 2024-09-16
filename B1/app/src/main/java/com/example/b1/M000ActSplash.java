package com.example.b1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class M000ActSplash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);
        LinearLayout layout = findViewById(R.id.main);


        int[] colors = {
                getResources().getColor(R.color.purple_200),
                getResources().getColor(R.color.purple_500),
                getResources().getColor(R.color.purple_700),
                getResources().getColor(R.color.teal_200),
                getResources().getColor(R.color.teal_700),
                getResources().getColor(R.color.black),
                getResources().getColor(R.color.white)
        };


        int[] icons = {
                R.drawable.penguin,
                R.drawable.turtle,

        };


        Random random = new Random();
        int randomColorIndex = random.nextInt(colors.length);
        int randomIconIndex = random.nextInt(icons.length);


        layout.setBackgroundColor(colors[randomColorIndex]);


        ImageView imageView = findViewById(R.id.iconImageView);
        imageView.setImageResource(icons[randomIconIndex]);

    };
    }
