package com.example.supakit.bmicalculator;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import static android.support.v7.appcompat.R.attr.height;

public class Human extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        Intent intent=getIntent();
        float weight;
        float heightsum=((height/100)*(height/100));
        float BMI=heightsum;
        intent.getIntExtra("BMI",-1);
    }
}
