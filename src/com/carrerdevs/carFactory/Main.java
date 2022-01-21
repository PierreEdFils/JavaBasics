package com.carrerdevs.carFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        createACar();
        createACarObject();
    }

    public static void createACar() {
        // Step 0 : Create the inner Instance
        Scanner scanner= new Scanner(System.in);

        // 1st take user Input
        System.out.println("What is your  name of the  owner\n owner Name :");
        String ownerName = scanner.nextLine();

        System.out.println("What is  the make of the car\n make of the car :");
        String makeCar = scanner.nextLine();

        System.out.println("What is the model of the car\n model of the Car:");
        String modelCar = scanner.nextLine();

        System.out.println("End of User Input ");




        //3rd print the fields values in the terminal
        System.out.println(ownerName + " owns the car "+ makeCar+ " "+ modelCar);



    }

    public static void createACarObject() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("What is  the make of the car\n make of the car :");
        String makeCar = scanner.nextLine();

        System.out.println("What is  the model of the car\n model of the Car :");
        String modelCar = scanner.nextLine();

        System.out.println("What is   the mileage of the car\n mileage of the Car :");
        int carMileage = Integer.parseInt(scanner.nextLine());

        System.out.println("What is your  the gas Tank Percentage of the car\n gas Tank Percentage of the Car :");
        float gasTankPercentage = Float.parseFloat(scanner.nextLine());

        Car car= new Car (makeCar,modelCar,carMileage,gasTankPercentage);

        //3rd print the fields values in the terminal
        System.out.println ( "The" + car.make+ " "+ car.model+ " has"+" "+ car.carMileage + " and "+ car.gasTankPercentage +" gas Tank Percentage  ");


    }


}
