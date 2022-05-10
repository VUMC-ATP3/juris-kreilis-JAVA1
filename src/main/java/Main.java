public class Main {

    public static void main(String[] args) {
        //(mainīgā tips) (mainiga nosaukums) = (vērtība);
        int dogAge = 3; // Vesels skaitlis
        String dogName = "Reksis";
        String dogNameTwo = "Lesija";//Teksts
        double dogWeigth = 15.8123; //Daļskaitlis
        float augums = 60.2123F; // Daļskaitlis
        boolean isHungry = true; //true = 1 ; false = 0
        boolean isBreedDog = false;

        char dzimums = 'V';
        char dzimumsDivi = 'S';
        char vaditajaKategorija = 'B';


        boolean isStringsTheSame = dogName.equals(dogNameTwo);
        System.out.println("Vai abi vardi ir vienadi?" + isStringsTheSame);

        System.out.println("Mans suns");
        System.out.println("Vecums");
        System.out.println(dogAge);
        System.out.println("Vārds");
        System.out.println(dogName);
        System.out.println("Mana suņa svars");
        System.out.println(dogWeigth + " kg" + "\n\n\n");
        System.out.println("mans suņa augstums" + " " + augums + " cm");
        System.out.println("Vai mans suns ir izsalcis?");
        System.out.println(isHungry);
        System.out.println("Vai mans suns ir skirnes suns");
        System.out.println(isBreedDog);


        //(mainīgā tips) (mainiga nosaukums) = (vērtība);
        int gadaApgrozijumsDolaros = 2147483647;
        byte monthsInYear = 12;
        short autoPrice = 12312;
        long netIncome = 2147483699L;
        System.out.println(gadaApgrozijumsDolaros + "\n" + monthsInYear + "\n" + autoPrice + "\n" + netIncome);

        //Aritmētiskie operatori
        int summa;
        int starpiba;
        int reizinajums;
        double dalijums;
        int atlikums;
        int x = 5;
        int y = 10;

        double z= 5.4;
        double q = 10;
        double w = 12;
        summa = x + y;
        starpiba = x - y;
        reizinajums = x * y;
        dalijums = z / q;
        atlikums = 12%5;

//        int rezultats = z/x;
        System.out.println("DALIT" +x/z);


        int skaitlis = 51312561;
        System.out.println("Ja atbilde ir 0, sis ir para skaitlis " + skaitlis%2);

        System.out.println("SUMMA " + summa);
        System.out.println("Starpiba " + starpiba);
        System.out.println("Reizinājums " + reizinajums);
        System.out.println("Dalījums " + dalijums);
        System.out.println("Atlikums " + atlikums);
        char vaditajaApliecibasKategorija = 'A';


    }


}

