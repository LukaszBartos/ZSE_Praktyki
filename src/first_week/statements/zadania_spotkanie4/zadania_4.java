package first_week.statements.zadania_spotkanie4;

import java.util.Scanner;

public class zadania_4 {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

    //zadanie 1


        System.out.println("Podaj liczbe: ");
        int liczba = skaner.nextInt();

        if(liczba>0){
            System.out.println("Liczba jest większa od 0");
        }
        if(liczba<0){
            System.out.println("Liczba jest mniejsza od 0");
        }
        if(liczba==0){
            System.out.println("Liczba jest równa 0");
        }

        //Zadanie 2
        System.out.print("\n Podaj 1 liczbe: ");
        int liczba1 = skaner.nextInt();
        System.out.print("Podaj 2 liczbe: ");
        int liczba2 = skaner.nextInt();
        System.out.print("Podaj 3 liczbe: ");
        int liczba3 = skaner.nextInt();

        if(liczba1 > liczba2 && liczba1 > liczba3){
            System.out.print("Liczba1 jest najwieksza");
        }
        else if(liczba2 > liczba1 && liczba2 > liczba3) {
            System.out.print("Liczba2 jest najwieksza");
        }

        else if(liczba3 > liczba1 && liczba3 > liczba2) {
            System.out.print("Liczba3 jest najwieksza");
        }
        else if( liczba1==liczba2 || liczba1>liczba3 ) {
            System.out.println("  Najwieksza liczba to:  " +liczba1);
        }
        else if(liczba1==liczba3 || liczba1>liczba2) {
            System.out.println("Najwieksza liczba to: " +liczba3);
        }
        else if(liczba2==liczba3|| liczba2>liczba1) {
            System.out.println("Najwieksza liczba to: " +liczba2);
        }

        //zadanie 3


        System.out.println("\nPodaj login: ");
        String login = skaner.next();
        System.out.println("Podaj hasło: ");
        String haslo = skaner.next();

        if(login.equals("admin123") && haslo.equals("tajnehaslo16")){
            System.out.println("Zalogowano pomyślnie!");
        }

        else{
            System.out.println("Logowanie nieudane!");
        }

        //zadanie 4

        System.out.println("Podaj pierwszą liczbe: ");
        int pierwsza = skaner.nextInt();
        System.out.println("Podaj drugą liczbe: ");
        int druga = skaner.nextInt();
        System.out.println("Podaj trzecią  liczbe: ");
        int trzecia = skaner.nextInt();

        if(pierwsza > druga && pierwsza > trzecia&& druga>trzecia){
            System.out.print("Kolejność malejąca");
        }
        else if(druga > pierwsza && druga > trzecia || druga<pierwsza && druga<trzecia) {
            System.out.print("Brak kolejności");
        }
        else if(trzecia > druga && druga > pierwsza) {
            System.out.print("kolejnosc rosnąca");
        }
        else if(pierwsza==druga || pierwsza==trzecia ||  druga==trzecia  ) {
            System.out.println(" przynajmniej dwie takie same liczby, brak kolejności");
        }


        //zadanie 5
        System.out.println("\nPodaj 1 liczbe");
        float  A = skaner.nextFloat();
        System.out.println("Podaj 2 liczbe");
        float  B = skaner.nextFloat();
        System.out.print("\nWybierz działanie (+,-,*,/): ");
        char x = skaner.next().charAt(0);





        switch (x) {
            case '+':
                float sum = A + B;
                System.out.println("dodawanie: "+sum);
                break;
            case '-':
                float roz = A - B;
                System.out.println("odejmowanie: " +roz);
                break;
            case '*':
                float mnoz = A * B;
                System.out.println("mnożenie." +mnoz);
                break;
            case '/':
                float dziel = A/B;
                System.out.println("Dzielenie." +dziel);
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji");
                break;


        }



    }
}
