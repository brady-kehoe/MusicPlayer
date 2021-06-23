package com.example.android.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rock = findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, Rock.class);
                startActivity(rockIntent);
            }
        });
        TextView pop = findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, Pop.class);
                startActivity(popIntent);
            }
        });
        TextView country = findViewById(R.id.country);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent countryIntent = new Intent(MainActivity.this, Country.class);
                startActivity(countryIntent);
            }
        });
        TextView heavyMetal = findViewById(R.id.heavy_metal);
        heavyMetal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent heavyMetalIntent = new Intent(MainActivity.this, HeavyMetal.class);
                startActivity(heavyMetalIntent);
            }
        });
        TextView hipHop = findViewById(R.id.hip_hop);
        hipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hipHopIntent = new Intent(MainActivity.this, HipHop.class);
                startActivity(hipHopIntent);
            }
        });
        TextView electronic = findViewById(R.id.electronic);
        electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent electronicIntent = new Intent(MainActivity.this, Electronic.class);
                startActivity(electronicIntent);
            }
        });
        TextView rhythmBlues = findViewById(R.id.rhythm_blues);
        rhythmBlues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rhythmBluesIntent = new Intent(MainActivity.this, RhythmBlues.class);
                startActivity(rhythmBluesIntent);
            }
        });


    }
}