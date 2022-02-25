package com.carrerdevs.introtorecursion;

import java.util.Scanner;

public class Main {

//   Recursion(Definition )
// Recursion is a process by which a function or a method calls itself again and again.
// This function that is called again and again either directly or indirectly is called the “recursive function”.

    public static Scanner userInput = new Scanner(System.in);
public static void main(String[] args) {
//    System.out.println(countdown(10));

//    public static  int countdown(int n) {
//        if (n == 0) {
//            System.out.println("Done");
//        } else {
//            System.out.println(n);
//            countdown(n - 1);
//        }
//        return countdown(1);
//    }
// Edabit Solution  :
//    countdown();
//    countDown(num);
}
    public static void countdown() {
        System.out.println("Entering number ");
        int num = userInput.nextInt();
        for (int i = num; i>= 0;i--){
            System.out.println(i + " countdown ");
        }

    }
    public static void countDown(int num){

    if (num >= 0){
        System.out.println(num);
        countDown(num - 1);
    }

    }
//    public static void main(String[] args) {
//        System.out.println(sum(10));
//    }
//    public static int sum(int n) {
//        return (n == 0) ? 0 : n + sum(n - 1);
//    }
}
