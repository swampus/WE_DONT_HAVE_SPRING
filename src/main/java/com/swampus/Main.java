package com.swampus;

import com.swampus.citizens.Baker;
import com.swampus.citizens.Blacksmith;
import com.swampus.citizens.Farmer;
import com.swampus.citizens.Headman;

public class Main {
    public static void main(String args[]){
        System.out.println("hello wourld!");

        Baker baker = new Baker();
        Blacksmith blacksmith = new Blacksmith();
        Farmer farmer = new Farmer();
        Headman headman = new Headman();

        headman.tellMessageFromCapital();
        headman.getTax();
        headman.goTown();

        baker.doWork();
        blacksmith.doWork();
        farmer.doWork();


    }
}
