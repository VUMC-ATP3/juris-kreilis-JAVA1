package classroomFive2.uzdevums3;

import java.util.Scanner;

public class Rinkis {
    private double radius;
    private String colour;

    Rinkis(){
        this.radius = 1.0;
        this.colour = "red";
    }

    public Rinkis(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    double calculateArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
