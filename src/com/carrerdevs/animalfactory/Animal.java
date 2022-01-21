package com.carrerdevs.animalfactory;

public class Animal {

//    Fields: species (String), legs (short), livesOnLand (boolean)
    public String species ;
    public short legs;
    public boolean livesOnland;

    public Animal(String species,short legs,boolean livesOnland) {
        this.species =species;
        this.legs =legs ;
        this.livesOnland= livesOnland;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", livesOnland=" + livesOnland +
                '}';
    }
}
