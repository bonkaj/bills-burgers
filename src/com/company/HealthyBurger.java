package com.company;

public class HealthyBurger extends Burger{

    private String Roll;
    private String Meat;
    private boolean Onion;
    private boolean Lettuce;
    private boolean Tomato;
    private boolean dblMeat;
    private double Price;

    public HealthyBurger() {
        Roll = "Whole Grain";
        Meat = "Turkey";
        Onion = false;
        Lettuce = false;
        Tomato = false;
        this.dblMeat = false;
        Price = 7.00;
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
}
