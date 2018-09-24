package com.example.maxime.tp1;

import java.util.ArrayList;

public class Cellar {

    private static float RATE_EUR_DOLL = 0.8f;
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

    public float getTotalPriceInEuros() {
        Integer priceSum;
        priceSum = 0;
        for (Bottle currentBottle : bottleList) {
            priceSum += currentBottle.getPrice();
        }
        return priceSum;
    }

    public float getTotalPriceInDollars() {
        float priceEuros = getTotalPriceInEuros();
        return priceEuros * RATE_EUR_DOLL;
    }

    public int getNumberOfBottles() {
        int sumNb;
        sumNb = 0;
        for (Bottle currentBottle : bottleList) {
            sumNb++;
        }
        return sumNb;
    }


}
