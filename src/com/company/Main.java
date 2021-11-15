package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger sample = new Burger(true, false, true, true);
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
    }
}
