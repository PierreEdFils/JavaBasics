package com.carrerdevs.carFactory;

public class Car {

    //   ownerName (String)
    //   makeCar (String)
    //   modelCar (String)


    // 1) Fields


    public String make;
    public String model;
    public int carMileage;
    public float gasTankPercentage;


    // 2) Constructor/s

    public Car( String make, String model, int carMileage, float gasTankPercentage) {

        this.make = make;
        this.model = model;
        this.carMileage = carMileage;
        this.gasTankPercentage = gasTankPercentage;
    }




    // 3) Getter/Setter

    // 4) Others Methods


    @Override
    public String toString() {
        return "Car{" +

                ", makeCar='" + make + '\'' +
                ", modelCar='" + model + '\'' +
                ", carMileage=" + carMileage +
                ", gasTankPercentage=" + gasTankPercentage +
                '}';
    }
}
