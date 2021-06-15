package com.example.examandroidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
public class MainActivity extends AppCompatActivity {

     VehiclesFragment FragmentA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}