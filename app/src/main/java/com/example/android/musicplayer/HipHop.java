package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HipHop extends AppCompatActivity {
    public static ArrayList<Song> songs = new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        songs.add(new Song("Laugh Now Cry Later","Drake, Lil Durk", R.drawable.hh_laughnowcrylater));
        songs.add(new Song("Mood","24kGoldn, iann dior", R.drawable.hh_mood));
        songs.add(new Song("Just Like You","NF", R.drawable.hh_justlikeyou));
        songs.add(new Song("Astronaut In The Ocean","artist", R.drawable.hh_astronautintheocean));
        songs.add(new Song("Holding On","iann dior", R.drawable.hh_holdingon));
        songs.add(new Song("Up","Cardi B", R.drawable.hh_up));
        songs.add(new Song("What You Know Bout Love","Pop Smoke", R.drawable.hh_whatyouknowboutlove));
        songs.add(new Song("Reminds Me Of You","Juice WRLD, The Kid LAROI", R.drawable.hh_remindsmeofyou));


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