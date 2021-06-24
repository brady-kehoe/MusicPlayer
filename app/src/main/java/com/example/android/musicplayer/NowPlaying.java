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

        Bundle extra = getIntent().getExtras();
        if (extra != null) {
            int chosenSong = (int) extra.get("chosenSong");
            TextView nowPlayingTitle = findViewById(R.id.now_playing_title);
            nowPlayingTitle.setText(Country.countrySongs.get(chosenSong).title);
            TextView nowPlayingArtist = findViewById(R.id.now_playing_artist);
            nowPlayingArtist.setText(Country.countrySongs.get(chosenSong).artist);
            ImageView nowPlayingImage = findViewById(R.id.now_playing_image);
            nowPlayingImage.setImageResource(Country.countrySongs.get(chosenSong).icon);
        }








    }

}
/**/
