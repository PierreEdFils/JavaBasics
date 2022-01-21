package com.carrerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print(" What is your name ?  \nName :");
        String UserInput1 =scan.nextLine() ;
        System.out.println("Hello "+" "+ UserInput1);

        System.out.print(" What is your age ?  \nAge :");
        byte UserInput2 = scan.nextByte();
        System.out.println("Wow  "+" "+ UserInput2 +"is too old ");
        scan.nextLine();

        System.out.print(" What is your  weight ?  \nWeight :");
        float UserInput3 = scan.nextFloat();
        System.out.println("Your Weight is   "+" "+ UserInput3 );

        System.out.print(" What is your  gender ?  \nGender :");
        short UserInput4 =  scan.nextShort();
        System.out.println("Your Gender is   "+" "+ UserInput4 );

        System.out.print(" What is  your  Social Security Number  ?  \nSSN :");
        int UserInput5 =  scan.nextInt();
        System.out.println("Your SSN   "+" "+ UserInput5 );


        long UserInput6 =  scan.nextLong();


        double UserInput7 =scan.nextDouble();


        boolean UserInput8 = scan.nextBoolean();







    }
}
