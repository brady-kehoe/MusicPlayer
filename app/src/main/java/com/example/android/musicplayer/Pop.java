package com.example.android.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Lost Cause","Billie Eilish", R.drawable.pop_lostcause));
        songs.add(new Song("positions","Ariana Grande", R.drawable.pop_positions));
        songs.add(new Song("Levitating","Dua Lipa, DaBaby", R.drawable.pop_levitating));
        songs.add(new Song("Save Your Tears","The Weeknd, Ariana Grande", R.drawable.pop_saveyourtears));
        songs.add(new Song("Diamonds","Sam Smith", R.drawable.pop_diamonds));
        songs.add(new Song("Skin","Sabrina Carpenter", R.drawable.pop_skin));
        songs.add(new Song("good 4 u","Olivia Rodrigo", R.drawable.pop_good4u));
        songs.add(new Song("The Nights","Avicii", R.drawable.pop_thenights));

        SongMerge adapter = new SongMerge(this, songs);

        ListView listView = (ListView) findViewById(R.id.display);

        listView.setAdapter(adapter);
    }
}