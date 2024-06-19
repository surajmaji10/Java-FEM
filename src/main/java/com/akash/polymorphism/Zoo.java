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

        Animal animal = new Animal();
        animal.makeSound();

        animal = doggy;
        ((Dog)animal).play();

        animal = kitty;
        ((Cat)animal).sleep();

        animal = ribby;
        Rabbit animalRabbit = (Rabbit)animal;
        animalRabbit.doSomething();

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

        Animal animal2 = new Animal();
        animal2.makeSound();

        animal2 = new Cat();
        animal2.makeSound();

        animal2 = new Dog();
        animal2.makeSound();

        animal2 = new Rabbit();
        animal2.makeSound();

    }
}
