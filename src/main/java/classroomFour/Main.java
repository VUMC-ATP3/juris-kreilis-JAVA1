package classroomFour;


public class Main {
    public static void main(String[] args) {
        House majaViens = new House(4,true,false,"Zaļa","Brīvibas",21);
        House majaTris = new House();
        majaViens.printHouse();
        House majaDivi = new House(55,false,true,"Zila","Stabu",99);
        majaDivi.printHouse();

        Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
        zzk.printetAtrumu();
        System.out.println("Cilveks uzkapj uz velosipeda un min pedalus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();
        System.out.println("Priekšā izlec kaķis. vajag bremzēt");
        zzk.bremzet();
        zzk.bremzet();
        zzk.printetAtrumu();
        Velosipeds merida = new Velosipeds();
        merida.bremzuTips = 'V';
        merida.printetAtrumu();
        Velosipeds vecsVelosipeds = new Velosipeds();
        vecsVelosipeds.bremzet();

        Automasina viens = new Automasina();
        viens.atrumkarba = 'A';
        viens.durvjuSkaits = 5;
        viens.marka = "bmw";
        viens.vietas = 7;

        Darbinieks ruta= new Darbinieks();
        ruta.vards= "Ruta Jurjane";
        ruta.vecums= 31;
        ruta.alga= 2000;
        System.out.println("Jaunā darbinieka vārds ir "+ ruta.vards+ " , tās alga ir "+ ruta.alga+ " eur nedēļā.");
        ruta.pielikums();
        ruta.pielikums();
        ruta.printAlga();

        Zivs Karpa = new Zivs();
        Karpa.suga = "Karpa";
        Karpa.jurasZivs = false;
        Karpa.saldudensZivs = true;
        Karpa.svars = 1;
        System.out.println("Zivju suga" + Karpa.suga);
        System.out.println("Vai jūras zivs?" + Karpa.jurasZivs);
        System.out.println("Vai saldūdens zivs?" + Karpa.saldudensZivs);
        System.out.println("Karpa svars ir" + Karpa.svars);

        Kompanija displeji = new Kompanija();
        displeji.nosaukums = "Displeji";
        displeji.kompanijasVecums = 20;
        displeji.darbibasJoma = "Multimediju ierīces";
        displeji.atrašnāsVieta = "Rīga";
        displeji.darbiniekuSkaits = 10;

        displeji.printKompanija();

        Rinkis mansRinkis = new Rinkis(5);
        System.out.println(Math.PI);
        System.out.println(mansRinkis.radiuss);
        System.out.println(mansRinkis.aprekinatLaukumu());
        Rinkis mansRinkis2 = new Rinkis();
        System.out.println(Math.PI);
        mansRinkis2.radiuss = 50;
        System.out.println(mansRinkis2.radiuss);
        System.out.println(mansRinkis2.aprekinatLaukumu());
        System.out.println(mansRinkis2.aprekinatRinkaLinijasGarumu());
         mansRinkis.printCreatedTime();
        mansRinkis2.printCreatedTime();
        System.out.println("======================");
        Rinkis mansRinkis3 = new Rinkis(12.3);
        System.out.println(mansRinkis3.laukums);
        System.out.println(mansRinkis3.rinkaLinijasGarums);
        System.out.println("======================");
        Taisnsturis taisnsturisViens = new Taisnsturis(12.4,34.32);
        System.out.println("Taisnstura laukums " + taisnsturisViens.aprekinatLaukumu());

        Suns reksis = new Suns();
        reksis.vaiRej = false;
        reksis.name = "Dingo";
        System.out.println(reksis.vaiRej);
        reksis.astesGarums = 10;
        reksis.printName();
        reksis.izdodSkanu();

        Animal dzivnieks = new Animal();
        dzivnieks.izdodSkanu();
        dzivnieks.name = "Dzīvnieks";
        Cat cat = new Cat();
        cat.name = "Muris";
        cat.printName();
        cat.izdodSkanu();

    }
}
