package com.carrerdevs.sayHello;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is  your name\nName :");

        String name = scanner.nextLine();

        System.out.println("Hello, nice to meet you "+ name);



    }


}
