package classroomTwo;


import java.util.InputMismatchException;
import java.util.Scanner;


public class PracticalTaskTwo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        manaRandomMetode();
        manaRandomMetode();
        manaRandomMetode();
        System.out.println("Ievadi savu vārdu!");
        String name = scanner.nextLine();
        System.out.println("Ievadi savu vecumu");
        int age = scanner.nextInt();
        System.out.println("Esi sveicināts: " + name + "!");
        System.out.println(String.format("Esi Sveicināts: %s !", name));
        System.out.println("Jūsu vecums ir: " + age);

//        Ievadi pirmo skatili
//        5
//        Ievadi otro skaitli
//        10
//        Skaitlu summa ir 15

        System.out.println("Ievadi pirmo skatili");
        int n = scanner.nextInt();
        System.out.println("Ievadi otro skatili");
        int t = scanner.nextInt();
        int summa = n + t;
        System.out.println("skaitļu summa ir " + summa);

        int a = 5;
        int b = 10;
        int c = 5;
        int d = 11;

        int x = 0;
        System.out.println(x > 0);

        String krasa = "Zila";
        krasa.equals("Zaļa"); //false
        krasa.equals("Zila"); //true
        //Lielāks >
        System.out.println(b > a); //true
        System.out.println(a > b); //false
        //Mazāks <
        System.out.println(a < b);//true
        System.out.println(b < a); //false
        //vienāds ==
        System.out.println(a == c);//true
        System.out.println(a == b);//false
        System.out.println(b == c);//false
        //nav vienāds !=
        System.out.println(a != b);//true
        System.out.println(a != c); //false
        //mazāks vienāds <=
        System.out.println(a <= c); // true
        //lielāks vienāds >=
        System.out.println(b >= d); //false

        int vecums = 18;
        boolean vaiDrikstBalsot = (vecums >= 18);
        System.out.println("Vai cilvēks drīkst balsot? " + vaiDrikstBalsot);

        String nameOne = "Juris";
        String secondName = "Juris";

        boolean vaiVardiSakrīt = (nameOne.equals(secondName));
        System.out.println("vai vardi sakrit? " + vaiVardiSakrīt);

        System.out.println();

        int e = 4;

        boolean vaiIrPatiess = ((e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = (!(e < 5) && (e < 10));
        System.out.println(vaiIrPatiess);

        vaiIrPatiess = ((e < 5) || (e < 10));
        System.out.println(vaiIrPatiess);

        e = 5;
        vaiIrPatiess = (!(e < 5));
        System.out.println(vaiIrPatiess);

        System.out.println(!(false == true));

        int vecumsDivi = 17;
        boolean drikstBalsot = false;

        if (vecumsDivi >= 18) {
            drikstBalsot = true;
        }

        if (drikstBalsot) {
            System.out.println("drikst balsot");
        } else {
            System.out.println("nedrikst balsot");
        }
//
        System.out.println("Koda turpinājums");


        System.out.println("Ievadi savu vecumu...");
        int vecumsTris = scanner.nextInt();
        if (vecumsTris >= 18) {
            System.out.println("Cilvēks drīkst balsot");
        } else {
            System.out.println("Cilvēks nedrīkst balsot");
        }


        System.out.println("Koda turpinājums");

        System.out.println("Ievadi skatli..");
        int skaitlisViens = scanner.nextInt();
        if (skaitlisViens == 10) {
            System.out.println("Printejam Skaitlis 10");
        } else if (skaitlisViens == 15) {
            System.out.println("Printejam Skaitlis 15");
        } else if (skaitlisViens == 20) {
            System.out.println("Printejam Skaitlis 20");
        } else {
            System.out.println("Skaitlis ir nezināms");
        }

        System.out.println("Koda turpinājums");


        //Janodefine cilveks
        //Cilveka vecums
        //cilveka dzimums - V vai S
        //Sieviete drikst doties pensija no 60 gadiem
        //Virietis driskt doties pensija no 65 gadiem


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

        System.out.println("Koda turpinājums.");


        int diena = 3;
        String dienasVards;

        switch (diena) {
            case 1:
                dienasVards = "Pirmdiena";
                break;
            case 2:
                dienasVards = "Otrdiena";
                break;
            case 3:
                dienasVards = "Trešdiena";
                break;
            case 4:
                dienasVards = "Ceturdiena";
                break;
            case 5:
                dienasVards = "Piektdiena";
                break;
            case 6:
                dienasVards = "Sestdiena";
                break;
            case 7:
                dienasVards = "Svētdiena";
                break;
            default:
                dienasVards = "Nezināma diena";
        }

        System.out.println(dienasVards);


        System.out.println("IEvadi veselu skaitli");

        int skaitlis;

        skaitlis = scanner.nextInt();
        if (skaitlis > 0) {
            System.out.println("Lielaks par 0");
        } else if (skaitlis < 0) {
            System.out.println("Mazaks par 0");
        } else {
            System.out.println("Skaitlis ir 0");
        }


        int skaitlisJauns = 5;
        if (skaitlisJauns % 2 == 0) {
            System.out.println("Skaitlis ir para skaitlis");
        } else {
            System.out.println("Skaitlis ir nepara skaitlis");
        }



    }

    static void manaRandomMetode() {
        System.out.println("HOHOHOOHOH JURIS");
    }

}


