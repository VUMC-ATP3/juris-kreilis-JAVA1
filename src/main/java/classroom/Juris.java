package classroom;

import java.util.Random;
import java.util.Scanner;

public class Juris {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zals = "zaļš";
        String dzeltens = "Dzeltens";
        String sarkans = "Sarkans";

        System.out.println("Lūdzu ievadi kādu no luksafora krāsām!");
        String krasa = scanner.nextLine();

        boolean isGreen = zals.equals(krasa);
        boolean isYellow = dzeltens.equals(krasa);
        boolean isRed = sarkans.equals(krasa);

        if (isGreen) {
            System.out.println("Ejam");
        } else if (isYellow) {
            System.out.println("Gatvajoamies");
        } else if (isRed) {
            System.out.println("Stāvam");
        } else {
            System.out.println("Luksoforā nav tāda krāsaz");
        }

        String[][] janNamesDays = {new String[]{"Laimnesis", "Solvija", "Solvita"}, {"Indulis", "Iva", "Ivis", "Ivo"}};
        String[][][] menesuVardaDienas = {janNamesDays};
        System.out.println(menesuVardaDienas[0][1][3]);

        Random random = new Random();
        int[] randomNumbers = {random.nextInt(0, 100), random.nextInt(0, 100), random.nextInt(0, 100)};
        System.out.println(randomNumbers[0]);
        System.out.println(randomNumbers[1]);
        System.out.println(randomNumbers[2]);

        String[] arrayName;

        arrayName = new String[]{"Test", "test2"};

        
        String teikums = "Mani sauc Juris";
        int count = 0;
        for (int i = 0; i < teikums.length(); i++) {
            System.out.println(teikums.charAt(i));
            if(teikums.charAt(i)=='i'){
                count= count + 1;
            }
        }
        System.out.println("i skaits" + count);
        
        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča kungs", "Kārava dāma"};

        int cardCount = kartis.length;
        int counter = 0;

        while (cardCount > counter) {
            System.out.println(kartis[counter]);
            counter = counter + 1;
        }

        int count1 = 0;
        for (int i = 1; i <= 50; i++) {
            if((i%3==0) || (i%5==0)){
                System.out.println("Šie numuri neder" + i);
            }else{
                System.out.println("Šie numuri der" + i);
                count1 = count1 +1;
            }

        }
        System.out.println(count1);




        int number;

        do{
            System.out.println("Ievadi pozitivu skaitli");
            number = scanner.nextInt();
        }while(!((number>0) && (number<10)));

        String parole = "SuperSecret";
        String lietoajaParole;
        int meginajumuSkaits = 0;
        do {
            System.out.println("Ievadi paroli");
            lietoajaParole = scanner.nextLine();
            System.out.println("pārbaudām paroli");
            meginajumuSkaits = meginajumuSkaits + 1;

        } while (!lietoajaParole.equals(parole) );

        System.out.println("Pareiza parole");

    }

    public static String printetTekstu() {
        return "dasdasdasdasda";
    }


}

//    Scanner scanner = new Scanner(System.in);
//    String zals = "zaļš";
//    String dzeltens = "Dzeltens";
//    String sarkans = "Sarkans";
//
//        System.out.println("Lūdzu ievadi kādu no luksafora krāsām!");
//                String krasa = scanner.nextLine();
//
//                boolean isGreen = zals.equals(krasa);
//                boolean isYellow = dzeltens.equals(krasa);
//                boolean isRed = sarkans.equals(sarkans);
//
//                if (isGreen == true) {
//                System.out.println("Ejam");
//                } else if (isYellow == true) {
//                System.out.println("Gatvajoamies");
//                } else if (isRed == true) {
//                System.out.println("Stāvam");
//                } else {
//                System.out.println("Luksoforā nav tāda krāsaz");
//                }