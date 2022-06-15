package ckassroomFive;

public class Triangle {
    public int a;
    public int b;
    public int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double p = halfPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double halfPerimeter() {
        return (double) (a + b + c) / 2.0;
    }

}
