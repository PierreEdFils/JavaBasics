package com.carrerdevs.animalfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creating Scanner var
        Scanner scanner = new Scanner(System.in);

        System.out.println( " Welcome to : Create an Animal");

        // ask questions
        System.out.println("Enter a species \nInput");
        String speciesInput = scanner.nextLine();

        System.out.println("Enter  number of the Legs \n(-32k 32k)");
        short legsInput = scanner.nextShort();

        System.out.println("Enter  number of the Legs \n(-32k 32k)");
        boolean livesOnlandInput = scanner.nextBoolean();


        // creating animal instance


        //output  field value for animal instance

    }



}
