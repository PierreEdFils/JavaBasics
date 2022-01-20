package com.carrerdevs.carFactory;

public class Car {

    //   ownerName (String)
    //   makeCar (String)
    //   modelCar (String)


    // 1) Fields

    public String ownerName ;
    public String makeCar;
    public String  modelCar ;
    public int carMileage;
    public float gasTankPercentage;


    // 2) Constructor/s

    public Car(String ownerName, String makeCar, String modelCar, int carMileage, float gasTankPercentage) {
        this.ownerName = ownerName;
        this.makeCar = makeCar;
        this.modelCar = modelCar;
//        this.carMileage = carMileage;
//        this.gasTankPercentage = gasTankPercentage;
    }

    public Car(String ownerName, String makeCar, String modelCar) {
    }


    // 3) Getter/Setter

    // 4) Others Methods


    @Override
    public String toString() {
        return "Car{" +
                "ownerName='" + ownerName + '\'' +
                ", makeCar='" + makeCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
//                ", carMileage=" + carMileage +
//                ", gasTankPercentage=" + gasTankPercentage +
                '}';
    }
}
