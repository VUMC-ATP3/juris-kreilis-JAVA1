package classroomFive2.polymorphism;

public class Calculator {

    public int sum(int a, int b) {
        System.out.println("Saskaitam veselus skaitlus");
        return a + b;
    }

    public double sum(double a, double b) {
        System.out.println("Saskaitam daļskaitlus");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        System.out.println("Saskaitam tris skaitlus");
        return a + b + c;
    }


    public double sum(int i, int i1, int i2, double v) {
        return i + i1 + i2 + v;
    }
}
