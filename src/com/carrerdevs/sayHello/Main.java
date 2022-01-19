package com.carrerdevs.sayHello;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        whatIsYourName();
        whatIsYourFullName();
    }

    public static void whatIsYourName() {

        Scanner scanner= new Scanner(System.in);
        System.out.println("What is  your name\nName :");

        String name = scanner.nextLine();
        System.out.println("Hello, nice to meet you "+ name);
    }
    public static void whatIsYourFullName() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your First name\nFirst Name :");
        String firstName = scanner.nextLine();

        System.out.println("What is your Last name\nLast Name :");
        String lastName = scanner.nextLine();

        System.out.println("It is so nice to formally meet you"+ " "+ firstName +" "+ lastName);

    }



}
