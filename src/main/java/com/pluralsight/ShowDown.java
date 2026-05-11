package com.pluralsight;

public class ShowDown {
    public static void main(String[] args) {
        Person somePerson = new Person("Eric", 100, 100);
        SuperHero someSuperHero = new SuperHero("super eric", 150, 200);

        System.out.println("This person has this much experience" + somePerson.getExperiencePoints());
        System.out.println("the hero has this much power" + someSuperHero.getExperiencePoints());

        if(somePerson.isAlive()){
            System.out.println(somePerson.getName() + "is alive");
        }else{
            System.out.println(somePerson.getName() + "isnt alive");
        }

        if (someSuperHero.isAlive()) {
            System.out.println(someSuperHero.getName() +"is alive");
        }else{
            System.out.println(someSuperHero.getName() + "isn't alive");


        }
    }

}
