package com.carrerdevs;

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




        }
        public static String createFullName (String fName, String lName){
           return fName + " "+lName;
    }

}
