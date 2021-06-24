package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Pop extends AppCompatActivity {
    public static ArrayList<Song> songs = new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent(getBaseContext(), NowPlaying.class);
                nowPlayingIntent.putExtra("chosenSong", position);
                startActivity(nowPlayingIntent);
            }
        });
    }
}