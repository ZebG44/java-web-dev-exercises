package org.launchcode.java.demos.lsn6inheritance;


public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());  // prints 13

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!" due to @Override

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());  // prints "Hello, my name is Suki!" because we can use the methods in class Cat on at class that extends Cat

    }
}
