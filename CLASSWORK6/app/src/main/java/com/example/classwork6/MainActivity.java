package com.example.classwork6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Movie M = new Movie("BATMAN","Bruce wain","10/10","10/10","16+");
        Movie M1 = new Movie("Arrow","Olvier queen","10/10","0/10 cause it,s not a movie","18+");
    }
}