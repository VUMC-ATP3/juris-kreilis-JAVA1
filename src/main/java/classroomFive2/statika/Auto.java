package classroomFive2.statika;

public class Auto {
    public String marka;
    public static String klasesNosaukums = "AutoKlase";
    public static int totalCarsCreated = 0;

    Auto(String marka){
        this.marka = marka;
        totalCarsCreated++;
    }

    public static void printText(){
        System.out.println("Printeju tekstu" + totalCarsCreated);
    }
    public static void inrcreaseTotalCarsCreated(){
        totalCarsCreated++;
    }

}
