package com.company;

public class Car {
    private String carName;
    private String carCompany;

    public Car(String carName, String carCompany) {
        this.carCompany = carCompany;
        this.carName = carName;
    }

    public String getName() {
        return this.carName;
    }

}
