package second_week.methodsAndObjects;

interface piecPiekacz {
    void pieczenieCiastek();
    void pieczenieChleba();
}

interface piecGrill {
    void grillowanieKurczaka();

}


public class zadaniePiec implements piecPiekacz, piecGrill {
    private int czas;
    private int temperatura;


    @Override
    public void pieczenieCiastek() {
        czas = 30;
        temperatura = 180;
        wlacz();
    }

    @Override
    public void pieczenieChleba() {
        czas = 120;
        temperatura = 170;
        wlacz2();
    }

    @Override
    public void grillowanieKurczaka() {
        czas = 20;
        temperatura = 200;

        wlacz3();
    }



    private void wlacz() {
        System.out.println("Włączamy piecPiekacz aby upiec ciastka, " +
                "ustawiamy temperature na: " + temperatura
                +
                " i czas trwania na: " + czas + "minut");
    }
    private void wlacz2() {
        System.out.println("Włączamy piecPiekacz aby upiec chleb, " +
                "ustawiamy temperature na: " + temperatura
                +
                " i czas trwania na: " + czas + "minut");
    }
    private void wlacz3() {
        System.out.println("Włączamy piecGrill aby grillowac kurczaka, " +
                "ustawiamy temperature na: " + temperatura
                +
                " i czas trwania na: " + czas + "minut");
    }

    public static void main(String[] args) {
        zadaniePiec zadaniepiec = new zadaniePiec();

        piecPiekacz Piec = zadaniepiec;
        piecGrill Grill = zadaniepiec;

        Piec.pieczenieCiastek();
        Piec.pieczenieChleba();
        Grill.grillowanieKurczaka();

    }
}



