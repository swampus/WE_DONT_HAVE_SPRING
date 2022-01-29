package com.swampus.citizens;

import com.swampus.items.Horse;

public class Headman implements Administration {

    private Baker baker;
    private Blacksmith blacksmith;
    private Farmer farmer;
    private Horse horse;

    //tell all news from capital to all citizen
    public void tellMessageFromCapital(){
        baker.recieveNews();
        blacksmith.recieveNews();
        farmer.recieveNews();
    }

    //get tax from all the citizen
    public void getTax(){
        baker.payTax();
        blacksmith.payTax();
        farmer.payTax();
    }

    public void goTown(){
        horse.ride();
    }


}
