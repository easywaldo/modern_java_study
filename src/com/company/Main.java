package com.company;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.with(Tax::general)
                .with(Tax::regional)
                .with(Tax::surcharge)
                .calculate(new Order(100));
        System.out.println(tax);

        Supplier<Car> carSupplier = () -> new Car("new one", "new Company");
        Person me = new Person("waldo");
        Optional<Car> car =  me.getCar();
        Car result = car.orElseGet(carSupplier);
        System.out.println(result.getName());

        me.haveCar(new Car("my car", "hyundai"));
        Car myResult = me.getCar().orElseGet(carSupplier);
        System.out.println(myResult.getName());



    }
}
