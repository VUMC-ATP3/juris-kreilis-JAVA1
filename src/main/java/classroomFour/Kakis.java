package classroomFour;

public class Kakis {
    int gadi;
    boolean irPaedis;
    String dzimums;
    String krasa;
    String vards;


    public void printKakis() {
        System.out.println("Kaķa vārds ir " + vards);
        System.out.println("Kaķis ir " + krasa + " krāsā");
        System.out.println("Kaķis ir paēdis? " + irPaedis);
        System.out.println("Kaķa dzimums ir  " + dzimums + " tas ir " + gadi + " gadus vecs");

    }
}
