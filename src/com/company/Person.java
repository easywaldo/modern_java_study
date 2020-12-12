package com.company;

import java.util.Optional;

public class Person {
    private String name;
    private Optional<Car> car;

    public Person(String name) {
        this.name = name;
        this.car = Optional.empty();
    }

    public void haveCar(Car car) {
        this.car = Optional.of(car);
    }

    public Optional<Car> getCar() {
        return this.car;
    }
}
