package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HeavyMetal extends AppCompatActivity {
    public static ArrayList<Song> songs = new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        songs.add(new Song("Archangel","Amaranthe", R.drawable.hm_archangel));
        songs.add(new Song("The World Is Burning","Ember Falls", R.drawable.hm_theworldisburning));
        songs.add(new Song("BEST TIME","Helloween", R.drawable.hm_besttime));
        songs.add(new Song("My Demons Can't Sleep","Temperance", R.drawable.hm_mydemonscantsleep));
        songs.add(new Song("We Stand as One","Burning Witches", R.drawable.hm_westandasone));
        songs.add(new Song("Bring It On","Memoremains", R.drawable.hm_bringiton));
        songs.add(new Song("One with the Gun","Oceanhoarse", R.drawable.hm_onewiththegun));
        songs.add(new Song("Cloud Connected","Metalite", R.drawable.hm_cloudconnected));


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