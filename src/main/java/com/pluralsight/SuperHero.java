package com.pluralsight;

public class SuperHero extends Person {

    public SuperHero(String name, int health, int powerLevel) {
        //when we create a super hero the parent class already knows how to deal
        //with the name health and experience
        // so we use super to call the parent constructor
        super(name, health, powerLevel);
    }

    public int getPowerLevel(){
        return this.experiencePoints;
    }
}
