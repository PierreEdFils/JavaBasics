package com.carrerdevs.countryfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createACountry();
    }

    public static void createACountry() {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter the name of the Country \nCountry :");
        String name =scan.nextLine() ;
        System.out.println("Country :"+ name);

        System.out.print(" Enter the population   \nPopulation :");
        long population =scan.nextLong();
        System.out.println("Population :"+ population );

        System.out.print(" Enter the capital of the Country \nCapital :");
        String capital =scan.nextLine() ;
        System.out.println("Capital :"+ capital);

        Country country = new Country(name,population,capital);

        System.out.println("The  Capital of "+name +" is "+ capital  + "." +name +"population in 2021 is estimated to be "+ population +"" );

    }
}
