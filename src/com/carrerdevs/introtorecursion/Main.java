package com.carrerdevs.introtorecursion;

public class Main {
//   Recursion(Definition )
// Recursion is a process by which a function or a method calls itself again and again.
// This function that is called again and again either directly or indirectly is called the “recursive function”.
public static void main(String[] args) {
    System.out.println(countdown(10));
}
    public static  int countdown(int n) {
        if (n == 0) {
            System.out.println("Done");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
        return countdown(10);
    }
// Edabit Solution  :

//    public static void main(String[] args) {
//        System.out.println(sum(10));
//    }
//    public static int sum(int n) {
//        return (n == 0) ? 0 : n + sum(n - 1);
//    }
}
