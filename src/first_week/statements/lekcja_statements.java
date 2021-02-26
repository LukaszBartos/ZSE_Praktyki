package first_week.statements;

import java.util.Scanner;

public class lekcja_statements {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

//        boolean stan = true;
//        if(stan){
//            System.out.println("Wykonała sie instrukcja IF");
//
//        }
//        else{
//            System.out.println("Wykonała sie instrukcja else");
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.print("Podaj swoj wiek: ");
//        int wiek = skaner.nextInt();
//
//        if(wiek >= 18){
//            System.out.println("Jestes pełnoletni");
//        }
//        else{
//            System.out.println("Jestes niepełnoletni");
//        }

//        System.out.println("Podaj liczbe: ");
//        int liczba = skaner.nextInt();
//        if(10 < liczba && liczba < 20){
//            System.out.println("Liczba miesci sie w zakresie");
//        }
//        else{
//            System.out.println("Liczba nie mieści się w zakresie");
//        }
//
//        System.out.println("Podaj liczbe całkowitą A: ");
//        int a = skaner.nextInt();
//        System.out.println("Podaj liczbe całkowitą B: ");
//        int b = skaner.nextInt();
//
//        if(a>b){
//            System.out.println("A jest wieksze od B");
//        }
//        if(a<b){
//            System.out.println("B jest wieksze od A");
//        }
//        if(a == b){
//            System.out.println("A jest równe B");
//        }
//
//        char charA = "A";
//        char charB = "B";
//
//        if(charA>charB){
//            System.out.println("charA ma większą wartosc  od char B w tabeli ASCII");
//        }
//        else{
//            System.out.println("charA ma mniejszą wartosc od char B w tabeli ASCII");
//        }
//
//        String hello = "hello";
//        String world = "world";
//
//        if(hello.equals(world)){
//            System.out.println("hello jest rowne world");
//        }
//        else{
//            System.out.println("hello nie jest rowne world");
//        }

//        System.out.println("Podaj swój wybór (1,2): ");
//        int x = skaner.nextInt();
//
//        switch (x) {
//            case 1:
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case 2:
//                System.out.println("Przypadek drugi.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji");
//                break;
//
//
//        }

//        System.out.print("Podaj swój wybór (1,2,A,B): ");
//        String y = skaner.next();
//
//        switch (y) {
//            case "1":
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case "2":
//                System.out.println("Przypadek drugi.");
//                break;
//            case "A":
//                System.out.println("Przypadek A.");
//                break;
//            case "B":
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji");
//                break;
//
//
//        }
        System.out.print("Podaj swój wybór (1,2,A,B): ");
        char z = skaner.next().charAt(0);

        switch (z) {
            case '1':
                System.out.println("Przypadek pierwszy.");
                break;
            case '2':
                System.out.println("Przypadek drugi.");
                break;
            case 'A':
                System.out.println("Przypadek A.");
                break;
            case 'B':
                System.out.println("Przypadek B.");
                break;
            default:
                System.out.println("Nie wybrano poprawnej opcji");
                break;


        }



    }
}
