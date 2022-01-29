package com.swampus.citizens;

import com.swampus.items.Hammer;
import com.swampus.items.Horse;

public class Farmer implements Citizen {

    private Horse horse;
    private Hammer hammer;

    public Float payTax() {
        return 23.0f;
    }

    public void recieveNews() {

    }

    public void doWork() {
        System.out.println("Farmer do work. Items should be not null");
        System.out.println(horse);
        System.out.println(hammer);
}
}
