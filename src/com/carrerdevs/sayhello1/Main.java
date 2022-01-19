package com.carrerdevs.sayhello1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whatIsYourName();
    }

    public static void whatIsYourName() {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, nice to meet you "+ userName );


    }
    public static void whatIsYourFullName() {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello, nice to meet you "+ userName );


    }
}
