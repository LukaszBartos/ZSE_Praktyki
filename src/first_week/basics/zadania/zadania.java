package first_week.basics.zadania;

public class zadania {
    public static void main(String[] args) {

        //zadanie 1

        //int
        int myIntA = 16;
        int myIntB = 10;

        System.out.println("To jest zmienna integer A: " + myIntA);
        System.out.println("To jest zmienna integer B: " + myIntB);
        int sum = myIntA +myIntB;
        System.out.println("Wynik dodawania to: " +sum);


        //double
        double myDoubleA = 3.14;
        double myDoubleB = 2.43;
        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;
        System.out.println("Wynik doubla wynosi: " + sumDouble);

        //char
        char myCharA='Ł';
        char myCharB='B';
        char myCharC='#';
        System.out.println("Moja pierwsza litera imienia: " + myCharA);
        System.out.println("Moja pierwsza litera nazwiska to: " +myCharB);
        System.out.println("Moj ulubiony znak to: " + myCharC);

        //string

        String myStringA = "Ala";
        String myStringB = " ma";
        String myStringC = " kota ";
        System.out.println(myStringA + myStringB + myStringC);

        //Zadanie 2
        int a, b, suma;
        a = 6;
        b = 8;
        suma = (a * 6) + (b * 8);
        System.out.println(suma);






        //Zadanie 3
        double Polowa = 3.5;
        double BokB = 7;
        double bokC = (BokB * BokB)-(Polowa * Polowa);
        double sqrt = Math.sqrt(bokC);
        double sumaa = BokB * sqrt * 0.5;
        System.out.println(sumaa);
        //Zadanie 4

        String myStringD = "Łukasz ";
        String myStringE = "Bartos ";
        System.out.println(myStringD+myStringE);


    }
}
