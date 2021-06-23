package com.example.android.musicplayer;


public class Song {

    public static String title;

    public String artist;

    public int icon;


    public Song(String songTitle, String songArtist, int songIcon)
    {
        title = songTitle;
        artist = songArtist;
        icon = songIcon;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getIcon() { return icon; }

}