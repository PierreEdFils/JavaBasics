package com.carrerdevs.company;

public class Company {
    //  name (String)
    //  yearEstablished (short)
    //  marketCap (double)

    // 1) Fields

    public String name;
    public short yearEstablished;
    public double marketCap;

    // 2) Constructor/s

    public Company(String name, short yearEstablished, double marketCap) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }


    // 3) Getter/Setter

    // 4) Others Methods


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", marketCap=" + marketCap +
                '}';
    }
}
