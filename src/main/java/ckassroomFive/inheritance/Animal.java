package ckassroomFive.inheritance;

public class Animal {

    public Animal(){
        System.out.println("I am animal");
    }

    public Animal(String name) {
        this.name = name;
    }

    String name;

    public void printName(){
        System.out.println("Mans vārds ir : " + name);
    }

    public void makeSound(){
        System.out.println("I am animal. I make default sound. Arthhhhh...");
    }

}
