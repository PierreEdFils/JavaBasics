package com.carrerdevs;

import java.util.ArrayList;

public class Main {
    public  static void main(String[] args) {
//       No1
//        FirstName("Pierre Edouard ");
//        LastName("Fils");
//        firstNameLastName("Pierre Edouard","Fils");
//
//    }
//    public static void firstNameLastName(String FirstName,String LastName){
//       System.out.println(FirstName +" "+ LastName);


            String firstName = "Pierre Edouard ";
            String lastName = "Fils";
//          String fullName= firstName +" "+ lastName;
//          System.out.println(fullName);

//        String createdName= createFullName(firstName,lastName);
//        System.out.println(createdName);
        String generatedName =NameGenerator.generateFullName("first","last");

        Car carOne = new Car("Camaro 2SS","Chevy",10_000,  0.10F);
        Car carTwo = new Car("Mustang GT","Ford",30_000,0.50F);
        Car carThree = new Car("Hellcat","Dodge",100,0.90F);

        System.out.println(carOne.make +" "+ carOne.model +" "+carOne.mileage + " "+ " "+ carOne.gasTankPercent);
        System.out.println(carTwo.make +" "+ carTwo.model +" "+carTwo.mileage + " "+ " "+ carTwo.gasTankPercent);
        System.out.println(carThree.make +" "+ carThree.model +" "+carThree.mileage + ""+ " "+ carThree.gasTankPercent);

//        Bonus Solution: Array

        Car[] myCarArr = new Car[3];
        myCarArr[0] = carOne;
        myCarArr[1]= carTwo;
        myCarArr[2] = carThree;

        Car[] carArr = new Car[] {carOne,carTwo,carThree};

        ArrayList<Car> carArrayList =new ArrayList<>();
        carArrayList.add(carOne);
        carArrayList.add(carTwo);
        carArrayList.add(carThree);


//        Array  outputs(Standard Array vs Arraylists)
//        standard Array
        for (int i=0;i< carArr.length;i++){
            Car tempCar = carArr[i];
            System.out.println(tempCar.make +" "+ tempCar.model);
        }

//     Array List
        for (int i=0;i< carArrayList.size();i++){
            Car tempCar = carArrayList.get(i);
            System.out.println(tempCar.make +" "+ tempCar.model);
        }




    }
    public static String createFullName (String fName, String lName){
        return fName + " "+lName;
    }



}
