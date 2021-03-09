package third_week.packages.zadania_spotkanie9;

public class zadanie_5 {


    public static class Bank {
        public void wszedles(){
            System.out.println("Wszedłeś do Banku");
        }
    }



    public static class Bankomat extends Bank{
        public void zobaczyłeś(){
            System.out.println("Zobaczyłeś saldo");
        }
    }


    public static class Pieniądze extends Bankomat{
        public void wypłaciłeś(){
            System.out.println("Wypłaciłeś pieniądze");
        }
    }

    public static void main(String[] args) {
        Pieniądze pieniądze = new Pieniądze();
        pieniądze.wszedles();
        pieniądze.zobaczyłeś();
        pieniądze.wypłaciłeś();
    }

}
