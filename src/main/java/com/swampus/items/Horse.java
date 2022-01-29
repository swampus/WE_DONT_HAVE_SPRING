package com.swampus.items;

public class Horse {
    private String horseParameterA;
    private String horseParameterBForConfiguration;
    private int gHCoeficent;
    private String iHaveNoIdeaWhatIsItButItIsNeed;

    private Wheat wheat;

    public Horse(String horseParameterA, String horseParameterBForConfiguration,
                 int gHCoeficent, String iHaveNoIdeaWhatIsItButItIsNeed, Wheat wheat) {
        this.horseParameterA = horseParameterA;
        this.horseParameterBForConfiguration = horseParameterBForConfiguration;
        this.gHCoeficent = gHCoeficent;
        this.iHaveNoIdeaWhatIsItButItIsNeed = iHaveNoIdeaWhatIsItButItIsNeed;
        this.wheat = wheat;
    }

    public void ride(){
        System.out.println("Horse Ride!");
    }
}
