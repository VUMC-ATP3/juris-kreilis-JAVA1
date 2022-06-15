package ckassroomFive.inheritance;

import ckassroomFive.encapsulation.Person;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Muris");
        Dog dog = new Dog();
        Fox fox = new Fox();
        Animal animal1 = new Animal();
        System.out.println(fox.age);


        cat.name = "Muris";
        dog.name = "Reksis";
        animal1.name = "Bamby";
        cat.makeSound();
        dog.makeSound();
        animal1.makeSound();
        fox.printName();

        cat.printName();
        dog.printName();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = animal1;

        for (Animal animal : animals) {
            animal.printName();
        }

    }

    public void printAnimalName(Animal animal){
        animal.printName();

    }


}
