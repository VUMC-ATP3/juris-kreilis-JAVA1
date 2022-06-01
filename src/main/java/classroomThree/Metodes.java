package classroomThree;

import java.util.Scanner;

public class Metodes {

    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);
        int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnturaLaukums(3.4F,5.3F);
        printetTekstu(kvadrataLaukums(5),taisnturaLaukums(3.3F,5.6F));
        Metodes.printetTekstu(a,c);
        System.out.println(prettyPrint("##################"));

    }

    static String prettyPrint(String a){
        return "asdasda" + a + "Āsdasdasdasdasdas";
    }

    static void printetTekstu(int lalala, float bebebe){
        System.out.println("Kvadrata Laukums "+ lalala);
        System.out.println("Taisnstua  Laukums "+ bebebe);
    }

    static float taisnturaLaukums(float a, float b){
        float s = a*b;
        return s;
    }

    //metode, kas aprēķina kvadrāta lauku
    //int - tips ko atgriez
    //kvadrataLaukums - metodes nosaukums
    //int mala - arguments/parametrs
    static int kvadrataLaukums(int mala){
        int laukums = mala * mala;
        return laukums;
    }




}
