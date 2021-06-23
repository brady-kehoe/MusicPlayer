package com.example.android.musicplayer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Seven Nation Army","The White Stripes", R.drawable.rock_sevennationarmy));
        songs.add(new Song("Are You Gonna Be My Girl","Jet", R.drawable.rock_areyougonnabemygirl));
        songs.add(new Song("Sweet Child O' Mine","Guns N' Roses", R.drawable.rock_sweetchildomine));
        songs.add(new Song("Black Betty","Ram Jam", R.drawable.rock_blackbetty));
        songs.add(new Song("You Give Love A Bad Name","Bon Jovi", R.drawable.rock_yougiveloveabadname));
        songs.add(new Song("Butterfly","Crazy Town", R.drawable.rock_butterfly));
        songs.add(new Song("Mr. Brightside","The Killers", R.drawable.rock_mrbrightside));
        songs.add(new Song("American Idiot","Green Day", R.drawable.rock_americanidiot));


        SongMerge adapter = new SongMerge(this, songs);

        ListView listView = (ListView) findViewById(R.id.display);

        listView.setAdapter(adapter);
    }
}
