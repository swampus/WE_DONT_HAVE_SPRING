package com.swampus.citizens;

import com.swampus.items.Hammer;
import com.swampus.items.Wheat;

import java.util.HashMap;

public class Baker implements Citizen {

    private Wheat wheat;
    private Hammer hammer;

    public Float payTax() {
        return 23.0f;
    }

    public void recieveNews() {

    }

    //need wheat, hammer, horse
    public void doWork() {
        System.out.println("Baker do work. Items should be not null");
        System.out.println(wheat);
        System.out.println(hammer);
    }
}
