package com.akash.polymorphism;

public class Zoo {
    public static void main(String[] args) {

        Cat kitty = new Cat();
        Dog doggy = new Dog();
        Rabbit ribby = new Rabbit();

        kitty.makeSound();
        kitty.getDetails();
        doggy.makeSound();
        doggy.getDetails();
        ribby.makeSound();
        ribby.getDetails();

        System.out.println("------------------");

        Cat kitty2 = new Cat("RED");
        Dog doggy2 = new Dog("GREEN");
        Rabbit ribby2 = new Rabbit("BLUE");

        kitty2.makeSound();
        kitty2.getDetails();
        doggy2.makeSound();
        doggy2.getDetails();
        ribby2.makeSound();
        ribby2.getDetails();

        System.out.println("------------------");

        Animal ani = new Animal();
        ani.makeSound();

        ani = new Cat();
        ani.makeSound();

        ani = new Dog();
        ani.makeSound();

        ani = new Rabbit();
        ani.makeSound();

    }
}
