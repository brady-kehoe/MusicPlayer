package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Country extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Freedom Was A Highway","Jimmie Allen, Brad Paisley", R.drawable.country_freedomwasahighway));
        songs.add(new Song("Famous Friends","Chris Young, Kane Brown", R.drawable.country_famousfriends));
        songs.add(new Song("half of my hometown","Kelsea Ballerini, Kenny Chesney", R.drawable.country_halfofmyhometown));
        songs.add(new Song("To Us It Did","Mitchell Tenpenny", R.drawable.country_tousitdid));
        songs.add(new Song("Things A Man Oughta Know","Lainey Wilson", R.drawable.country_thingsamanoughtaknow));
        songs.add(new Song("Forever After All","Luke Combs", R.drawable.country_foreverafterall));
        songs.add(new Song("Gone","Dierks Bentley", R.drawable.country_gone));
        songs.add(new Song("Memory I Don't Mess With","Lee Brice", R.drawable.country_memoryidontmesswith));



        SongMerge adapter = new SongMerge(this, songs);

        ListView listView = (ListView) findViewById(R.id.display);

        listView.setAdapter(adapter);

        /* (Messing around to try and get it working here)
        RelativeLayout chosenSong = findViewById(R.id.song_view);
        chosenSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chosenIntent = new Intent(Country.this, NowPlaying.class);
                startActivity(chosenIntent);
            }
        });
        */
    }
}