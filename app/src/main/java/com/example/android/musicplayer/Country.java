package com.example.android.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Country extends Activity implements Serializable {
    public static ArrayList<Song> countrySongs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_display);
        countrySongs.add(new Song("Freedom Was A Highway","Jimmie Allen, Brad Paisley", R.drawable.country_freedomwasahighway));
        countrySongs.add(new Song("Famous Friends","Chris Young, Kane Brown", R.drawable.country_famousfriends));
        countrySongs.add(new Song("half of my hometown","Kelsea Ballerini, Kenny Chesney", R.drawable.country_halfofmyhometown));
        countrySongs.add(new Song("To Us It Did","Mitchell Tenpenny", R.drawable.country_tousitdid));
        countrySongs.add(new Song("Things A Man Oughta Know","Lainey Wilson", R.drawable.country_thingsamanoughtaknow));
        countrySongs.add(new Song("Forever After All","Luke Combs", R.drawable.country_foreverafterall));
        countrySongs.add(new Song("Gone","Dierks Bentley", R.drawable.country_gone));
        countrySongs.add(new Song("Memory I Don't Mess With","Lee Brice", R.drawable.country_memoryidontmesswith));

        SongMerge adapter = new SongMerge(this, countrySongs);

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

















