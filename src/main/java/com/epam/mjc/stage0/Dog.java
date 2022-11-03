package com.epam.mjc.stage0;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color = "brown", numberOfPaws = 4, hasFur = true);

        color = "brown";
        numberOfPaws = 4;
        hasFur = true;

    }

    @Override
    public String getDescription() {
//        return super.getDescription();
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and a fur.";
    }
}
