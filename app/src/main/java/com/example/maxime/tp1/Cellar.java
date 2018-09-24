package com.example.maxime.tp1;

import java.util.ArrayList;

public class Cellar {
    private ArrayList<Bottle> bottleList;

    Cellar() {
        bottleList = new ArrayList<Bottle>();
    }

    public void addBottle(String name, Integer price) {
        Bottle newBottle = new Bottle(name, price);
        bottleList.add(newBottle);
    }

    public Bottle getBottle(String name) {
        for (Bottle currentBottle : bottleList) {
            if (currentBottle.getName() == name) {
                return currentBottle;
            } else {
                return null;
            }
        }
    }
}
