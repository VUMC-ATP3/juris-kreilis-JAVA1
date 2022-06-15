package ckassroomFive.inheritance.shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];

        shape[0] = new Circle(2);
        shape[1] = new Rectangle(2, 2);

        System.out.println("Area of the Circle: " + shape[0].getArea());
        System.out.println("Area of the Rectangle: " + shape[1].getArea());
    }
}
