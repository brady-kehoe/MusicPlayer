package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        String chosenSong = getIntent().getStringExtra("chosenSong");
        int chosenFromList =Integer.parseInt("chosenSong");
        ArrayList<Song> countryList = (ArrayList<Song>) getIntent().getSerializableExtra("countryList");
        TextView nowPlayingTitle = findViewById(R.id.now_playing_title);
        nowPlayingTitle.setText(countryList.get(chosenFromList).title);
        TextView nowPlayingArtist = findViewById(R.id.now_playing_artist);
        nowPlayingArtist.setText(countryList.get(chosenFromList).artist);
        ImageView nowPlayingImage = findViewById(R.id.now_playing_image);
        nowPlayingImage.setImageResource(countryList.get(chosenFromList).icon);








    }

}
/**/
