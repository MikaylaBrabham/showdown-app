package com.pluralsight;

public class ShowDown {
    public static void main(String[] args) {
        Person somePerson = new Person("Eric", 100, 100);
        SuperHero someSuperHero = new SuperHero("super eric", 150, 200);
        SuperVillian someVillian = new SuperVillian("Lovi", 300, 1000);


        System.out.println("This person has this much experience" + somePerson.getExperiencePoints());
        System.out.println("the hero has this much power" + someSuperHero.getExperiencePoints());
        System.out.println("The supervillian has this much evilness" + someVillian.getEvilnessLevel());

        if (somePerson.isAlive()) {
            System.out.println(somePerson.getName() + "is alive");
        } else {
            System.out.println(somePerson.getName() + "isnt alive");
        }

        if (someSuperHero.isAlive()) {
            System.out.println(someSuperHero.getName() + "is alive");
        } else {
            System.out.println(someSuperHero.getName() + "isn't alive");


        }
        if (someVillian.isAlive()) {
            System.out.println(someVillian.getName() + "is alive");
        } else {
            System.out.println(someVillian.getName() + "isn't alive");
        }
        System.out.println(somePerson.getStatus());
        System.out.println(someSuperHero.getStatus());
        System.out.println(someVillian.getStatus());

        System.out.println(someVillian.getName() + "has been attacked");
        someVillian.takesdamage(75);
        System.out.println(someVillian.getStatus());
    }

}
