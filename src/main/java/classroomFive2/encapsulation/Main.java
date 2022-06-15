package classroomFive2.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
        //weather.metodeDivi(); // nevar izsaukt, jo metode divi ir private
        weather.metodeTris();
        // weather.temperatureAtDay = 12.5;
        weather.isRaining = true;
        weather.temperatureAtNight = 13.4;

        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 154.2, "Pēteris");

        System.out.println(cilveks3.toString());

        cilveks3.setAge(-3);
        System.out.println(cilveks3.toString());
        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());

//        System.out.println(cilveks3.toString());
//        System.out.println(cilveks3.getAge());
//        System.out.println(cilveks3.getName());

    }
}


//
//    Jāuztaisa publiska klase riņķis
//    privāts mainīgais rādiuss (double)
//    privāts mainīgais krāsa (String)
//
//no-arg konstruktors, kur vienmēr tiek norādīts:
//        raduiss ir 1.0
//        krasa ir sarkana
//
//        konstuktors, kur mēs padodam rādiusu un krasu
//
//        Jāuztaisa setter un getter metodes abiem mainīgajiem.
//
//        Pēc tam main metodē jāuztaisa rinkis ar no-arg konsturktoru.
//        Jāpārraaksta šim rinkim radiuss.
//
//        Pēc tam main metodē jāuztaisa rinkis ar arg konsturktoru.
//        Jāpārraaksta šim rinkim krasa.
//
//        Extra: Uztaisīt default metodi, kas aprēķina UN atgriež riņķa laukumu.


