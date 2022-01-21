package com.carrerdevs.airplanefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Airplane myAirplane = new Airplane(100,(float)555.5,'A',"American" );
//        System.out.println(myAirplane);
        createAPlane();
    }
    public static void createAPlane(){
        // Step 0 : Create the inner Instance
        Scanner scan = new Scanner(System.in);

        // 1st take user Input
        //passenger
        System.out.print(" Enter passengers \nNum :");
        int passengers = scan.nextInt();
        scan.nextLine();// Clear the \n (new Line character)

        System.out.print(" Enter max speed \nNum :");
        float maxSpeed = scan.nextFloat();
        scan.nextLine();// Clear the \n (new Line character)

        System.out.print(" Enter Character \nNum :");
        char idCharacter = scan.nextLine().charAt(0);


        System.out.print(" Enter name  \nNum :");
        String airLineName =scan.nextLine() ;



        //2nd create Airplane instance
        Airplane airplane = new Airplane(passengers,maxSpeed,idCharacter,airLineName);

        //3rd print the fields values in the terminal
        System.out.println(airplane);
    }
}
