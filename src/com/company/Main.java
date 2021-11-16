package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger sample = new Burger();
        System.out.println(sample.getPrice());
        sample.setDblMeat(false);
        sample.setDblMeat(false);
        sample.setDblMeat(false);
        System.out.println(sample.getPrice());
        sample.setOnion(false);
        System.out.println(sample.getPrice());
        sample.setOnion(true);
        System.out.println(sample.getPrice());
        sample.setTomato(false);
        System.out.println(sample.getPrice());
        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println(healthyBurger.getPrice());
    }
}
