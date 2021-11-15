package com.company;

public class Burger {
    private String Roll;
    private String Meat;
    private boolean Onion;
    private boolean Lettuce;
    private boolean Tomato;
    private boolean dblMeat;
    private double Price;

    public Burger(boolean onion, boolean lettuce, boolean tomato, boolean dblMeat) {
        Roll = "Ciabatta";
        Meat = "ground beef";
        Onion = onion;
        Lettuce = lettuce;
        Tomato = tomato;
        this.dblMeat = dblMeat;
        Price = 5.00;
    }

    public void setOnion(boolean onion) {
        Onion = onion;
    }

    public void setLettuce(boolean lettuce) {
        Lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        Tomato = tomato;
    }

    public void setDblMeat(boolean dblMeat) {
        this.dblMeat = dblMeat;
    }

    public double getPrice() {
        if (Onion == true) {
            Price = Price + .50;
        }
        if (Lettuce == true) {
            Price = Price + .50;
        }
        if (Tomato == true) {
            Price = Price + .50;
        }
        if (dblMeat == true) {
            Price = Price + 2;
        }
        return Price;
    }
}
