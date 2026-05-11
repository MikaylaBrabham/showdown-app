package com.pluralsight;

public class SuperVillian extends Person {

    public SuperVillian(String name, int health, int evillness) {
        super(name, health, evillness);
    }

    public int getEvilnessLevel() {
        return this.getExperiencePoints();
    }
}
