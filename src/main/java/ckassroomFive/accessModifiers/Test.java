package ckassroomFive.accessModifiers;

public class Test {

    private String name;

    public void printText(){ //var pieklut citas klases
        System.out.println("šī ir publiska metode");
    }
    private void printetTekstu(){ //nevar pieklust citas klases
        System.out.println("šī ir privāta metode");
    }

    void defaultMetodesPiemers() {
        System.out.println("default metode");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
