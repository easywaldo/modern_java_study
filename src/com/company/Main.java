package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.with(Tax::general)
                .with(Tax::regional)
                .with(Tax::surcharge)
                .calculate(new Order(100));
        System.out.println(tax);
    }
}
