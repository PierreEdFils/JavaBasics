package com.carrerdevs;

import java.util.Scanner;

public class NameGenerator {
    public static String generateFullName(String firstName, String lastName) {

        return firstName + " " + lastName;
    } public static void main(String [] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is your first name\nfirstName :");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name\nlastName :");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you"+ firstName +" "+ lastName);


    }
}