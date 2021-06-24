package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Electronic extends AppCompatActivity {
    public static ArrayList<Song> songs = new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        songs.add(new Song("Heaven","Avicii", R.drawable.edm_heaven));
        songs.add(new Song("Fake a Smile","Alan Walker, salem ilese", R.drawable.edm_fakeasmile));
        songs.add(new Song("Hero","Afrojack, David Guetta", R.drawable.edm_hero));
        songs.add(new Song("Used To Be","Steve Aoki, Kiiara, Wiz Khalifa", R.drawable.edm_usedtobe));
        songs.add(new Song("Leave A Little Love","Alesso, Armin van Buuren", R.drawable.edm_leavealittlelove));
        songs.add(new Song("Paradise","MEDUZA, Dermot", R.drawable.edm_paradise));
        songs.add(new Song("Heartbreak Anthem","Galantis, David Guetta, Little Mix", R.drawable.edm_heartbreakanthem));
        songs.add(new Song("BED","Joel Corry, RAYE, David Guetta", R.drawable.edm_bed));


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