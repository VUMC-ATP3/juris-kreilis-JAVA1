package classroomTwo;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
//        System.out.println("Sākās koda izpilde");
//        checkPersonAge();
//        checkPersonPension();
//        checkPersionPension2(65,'V');
//        checkPersionPension2(64,'V');
//        checkPersionPension2(60,'S');
//        checkPersionPension2(65,'S');
//        checkPersionPension2(45,'S');
//        int manaKvadrataLaukums = aprekinatKvadrataLaukumu(5);
//        System.out.println("Kvadrata lauikuims ir: " + manaKvadrataLaukums);
//
//        System.out.println("Beidzās koda izpilde");
//        printBusinessCardTwo("Līga", "Kalniņa", "+371 12312313", 1965);
//        printBusinessCardTwo("Juris", "Vītols", "+371 5142431", 1930);
//        int summa = sum(4, 10);
//        System.out.println(summa);
        System.out.println(average(10,2,4));
    }

    static double average(double a, double b, double c){
        return (a+b+c)/3;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void printBusinessCard() {
        String name = "Jānis";
        String surname = "Bērziņš";
        int dateOfBirth = 1990;
        String telephone = "+371 12345678";
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + telephone);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("##########");
    }

    static void printBusinessCardTwo(String name, String surname, String telephone, int dateOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + telephone);
        System.out.println("Dzimšanas gads: " + dateOfBirth);
        System.out.println("##########");
    }

    static int aprekinatKvadrataLaukumu(int mala) {
        int laukums = mala * mala;
        return laukums;
    }

    static void checkPersionPension2(int vecums, char dzimums) {
        boolean drikstDotiesPensija = false;
        if (vecums >= 65 && dzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (vecums >= 60 && dzimums == 'S') {
            drikstDotiesPensija = true;
        }
        if (drikstDotiesPensija) {
            System.out.println(String.format("Dzimums: %s, Vecums: %s", dzimums, vecums));
            System.out.println("Cilveks drikst doties pensija!");
        } else {
            System.out.println(String.format("Dzimums: %s, Vecums: %s", dzimums, vecums));
            System.out.println("Cilveks nedrikst doties pensija!");
        }
    }

    static void checkPersonPension() {
        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        } else if (cilvekaVecums >= 60 && cilvekaDzimums == 'S') {
            drikstDotiesPensija = true;
        }

        if (drikstDotiesPensija) {
            System.out.println("Cilveks drikst doties pensija!");
        }
    }


    static void checkPersonAge() {
        System.out.println("Sākās  metodes izpilde");
        System.out.println("Ievadi vecumu...");
        Scanner scanner = new Scanner(System.in);
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }
        System.out.println("Beidzās  metodes izpilde");
    }


}
