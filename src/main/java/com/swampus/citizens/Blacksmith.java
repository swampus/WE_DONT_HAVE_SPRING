package com.swampus.citizens;

import com.swampus.items.Bread;
import com.swampus.items.Horse;

public class Blacksmith implements Citizen {

    private Bread bread;
    private Horse horse;

    public Float payTax() {
        return 23.0f;
    }

    public void recieveNews() {

    }

    //need horse and need bread
    public void doWork() {
        System.out.println("Blacksmith do work. Items should be not null");
        horse.ride();
        System.out.println(bread);
        horse.ride();
    }
}
