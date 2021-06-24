package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RhythmBlues extends AppCompatActivity {
    public static ArrayList<Song> songs = new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        songs.add(new Song("Paradise","H.E.R., Yung Bleu", R.drawable.rb_paradise));
        songs.add(new Song("Touch You","Roy Woods", R.drawable.rb_touchyou));
        songs.add(new Song("Been Through That","Majid Jordan", R.drawable.rb_beenthroughthat));
        songs.add(new Song("I Like Dat","T-Pain, Kehlani", R.drawable.rb_ilikedat));
        songs.add(new Song("What You See","Migos, Justin Bieber", R.drawable.rb_whatyousee));
        songs.add(new Song("Come Through","H.E.R., Chris Brown", R.drawable.rb_comethrough));
        songs.add(new Song("Stacy","JON VINYL", R.drawable.rb_stacy));
        songs.add(new Song("BODY IN MOTION","DJ Khaled, Bryson Tiller, Roddy Ricch", R.drawable.rb_bodyinmotion));


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