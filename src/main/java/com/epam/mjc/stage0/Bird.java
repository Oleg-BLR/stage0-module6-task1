package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird(String colour, int numberOfPaws, boolean hasFur) {
        super(colour = "blue", numberOfPaws = 2, hasFur = false);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
