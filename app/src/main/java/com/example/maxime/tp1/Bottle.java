package com.example.maxime.tp1;

import java.io.Serializable;

public class Bottle implements Serializable{

    private String name;
    private float price;

    Bottle(String nm, float pr) {
        name = nm;
        price = pr;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name + " " + Float.toString(this.price);
    }

    public float getPrice() {
        return price;
    }
}
