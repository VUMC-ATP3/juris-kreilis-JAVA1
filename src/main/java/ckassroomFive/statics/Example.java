package ckassroomFive.statics;

public class Example {

    public static void main(String[] args) {

        //It doesn't matter how many times we initialize a class.
        // There will always be only one copy of static field belonging to it.
        // The value of this static field will be shared across all objects of either the same or any different class.


        // Whenever we initialize new objects from this Car blueprint, each new object will have its distinct copy of these instance variables.

        // However, suppose we want a variable that holds the count of the number of initialized
        // Car objects and is shared across all instances so they can access it and increment it upon their initialization.

        new Car("Jaguar", "V8");
        new Car("Bugatti", "W16");

        System.out.println(Car.numberOfCars);

    }

}
