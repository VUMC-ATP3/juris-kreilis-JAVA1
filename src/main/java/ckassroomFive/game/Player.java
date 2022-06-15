package ckassroomFive.game;

import java.util.Scanner;

public class Player {
    int number = 0;
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void guess() {
        System.out.println(name + "! Enter a number...");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("I am guessing " + number);
    }

}
