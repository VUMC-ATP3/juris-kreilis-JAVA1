package ckassroomFive.inheritance;

public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Moew...");
    }

    public void test(){
        makeSound();//izsauc šo metodi
        super.makeSound(); // izsauc metodi no parent class
    }

}
