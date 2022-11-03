package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String colour, int numberOfPaws, boolean hasFur) {
        this.color = colour;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        if (hasFur == true) {
            if (numberOfPaws == 1) {
                return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
            }
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
        } else if (numberOfPaws > 1) {
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
        }
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
    }

}
