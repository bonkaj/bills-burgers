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

    }

    public void setOnion(boolean onion) {
        if (onion && !this.Onion) {
            Price = Price + .5;
        } else if (!onion && this.Onion) {
            Price = Price - .5;
        }
        Onion = onion;
    }

    public void setLettuce(boolean lettuce) {
        if (lettuce && !this.Lettuce) {
            Price = Price + .5;
        } else if (!lettuce && this.Lettuce) {
            Price = Price - .5;
        }
        Lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        if (tomato && !this.Tomato) {
            Price = Price + .5;
        } else if (!tomato && this.Tomato) {
            Price = Price - .5;
        }
        Tomato = tomato;
    }

    public void setDblMeat(boolean dblMeat) {
        if (dblMeat && !this.dblMeat) {
            Price = Price + 2;
        } else if (!dblMeat && this.dblMeat) {
            Price = Price - 2;
        }
        this.dblMeat = dblMeat;
    }

    public double getPrice() {

        return Price;
    }
}
