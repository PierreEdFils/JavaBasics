package com.carrerdevs.song;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createASong();
    }

    public static void createASong() {
        // Step 0 : Create the inner Instance
        Scanner scan = new Scanner(System.in);

        // 1st take user Input

        System.out.print(" Enter title  \nTitle :");
        String title =scan.nextLine() ;


        System.out.print(" Enter artist  \nArtist :");
        String artist =scan.nextLine() ;


        System.out.print(" Enter genre  \nGenre :");
        String genre =scan.nextLine() ;


        System.out.print(" Enter Seconds  \nSeconds :");
        int seconds  =scan.nextInt() ;



        //2nd create Song instance

        SongAlbum songalbum = new SongAlbum(title,artist,genre,seconds);

        //3rd print the fields values in the terminal
        System.out.println ( "The" +  " "+ songalbum.title + " is made by "+" "+ songalbum.artist + " with  "+ songalbum.genre +" with " + songalbum.seconds + " " + "seconds");

    }
}
