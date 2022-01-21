package com.carrerdevs.song;

public class SongAlbum {
    //    title (String)
    //    artist (String)
    //    genre (String)
    //    seconds (int)

    // 1) Fields
    public String title;
    public String artist;
    public String genre;
    public int   seconds;


    // 2) Constructor/s

    public SongAlbum(String title, String artist, String genre, int seconds) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }


    // 3) Getter/Setter

    // 4) Others Methods


    @Override
    public String toString() {
        return "songAlbum{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", seconds=" + seconds +
                '}';
    }
}
