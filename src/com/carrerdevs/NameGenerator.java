package com.carrerdevs;

import java.util.Scanner;

public class NameGenerator {
    public static String generateFullName(String firstName, String lastName) {

        return firstName + " " + lastName;
    } public static void main(String [] args) {

        whatIsYourFullName();
    }

    public static void whatIsYourFullName() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your First name\nFirst Name :");
        String firstName = scanner.nextLine();

        System.out.println("What is your Last name\nLast Name :");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you"+ firstName +" "+ lastName);

    }
}