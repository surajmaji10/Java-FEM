package com.akash.polymorphism;

public class Zoo {
    public static void main(String[] args) {

        Cat kitty = new Cat();
        Dog doggy = new Dog();
        Rabbit ribby = new Rabbit();

        System.out.println(kitty instanceof Animal);
        System.out.println(doggy instanceof Animal);
        System.out.println(ribby instanceof Animal);

        kitty.makeSound();
        kitty.getDetails();
        doggy.makeSound();
        doggy.getDetails();
        ribby.makeSound();
        ribby.getDetails();

        System.out.println("------------------");

        Animal animal = new Animal();
        animal.makeSound();

        boolean isAnimal = animal instanceof Animal;
        System.out.println("animal is Animal?" + isAnimal);



        animal = doggy;
        ((Dog)animal).play();

        boolean isDog = animal instanceof Dog;
        System.out.println("animal is Dog?" + isDog);

        animal = kitty;
        ((Cat)animal).sleep();

        boolean isCat = animal instanceof Cat;
        System.out.println("animal is Cat?" + isCat);

        animal = ribby;
        Rabbit animalRabbit = (Rabbit)animal;
        animalRabbit.doSomething();

        boolean isRabbit = animal instanceof Rabbit;
        System.out.println("animal is Rabbit?" + isRabbit);
        boolean isRabbit2 = animalRabbit instanceof Rabbit;
        System.out.println("animalRabbit is Rabbit?" + isRabbit2);

        System.out.println("------------------");



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
