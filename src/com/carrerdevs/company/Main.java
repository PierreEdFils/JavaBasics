package com.carrerdevs.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        createACompany ();
    }

    public static void  createACompany () {

        // Step 0 : Create the inner Instance
        Scanner scan = new Scanner(System.in);

        // 1st take user Input

        System.out.print(" Enter the name of the Company  \nCompany :");
        String name =scan.nextLine() ;
        System.out.println("The company name is "+""+ name);
        scan.nextLine();

        System.out.print(" What year the company was established ?  \nYear :");
        short yearEstablished  =scan.nextShort();
        System.out.println(yearEstablished);

        System.out.print(" Enter the market Cap of the Company  \nCompany :");
        double marketCap =scan.nextDouble() ;
        System.out.println(marketCap);
        scan.nextLine();


        Company  company = new Company(name,yearEstablished,marketCap);

        System.out.println("The"+""+ name + "was established "+ yearEstablished + "in" + marketCap );

    }


}
