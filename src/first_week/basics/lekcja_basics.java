package first_week.basics;

public class lekcja_basics {


    public static void main(String[] args) {
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;
        System.out.println("To jest zmienna integer A" + myIntA);
        System.out.println(myIntB);
        System.out.println(myIntC);

        //dodawanie zmiennych
        int sum = myIntA +myIntB + myIntC;
        System.out.println("Dodawanie wynik: " +sum);

        //Odejmowanie zmiennych
        sum = myIntA -myIntB -myIntC;
        System.out.println("Odejmowanie wymik:" + sum);

        //Mnożenie zmiennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie wynik:" + sum);

        //Dzielenie zmiennych
        sum=myIntB / 2;
        System.out.println("Dzielenie B przez 2:" + sum);
        sum=myIntC / 2;
        System.out.println("Dzielenie C=77 przez 2:" + sum);

        //float /double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;
        double sumDouble;
        sumDouble = myDoubleA * myDoubleB;
        System.out.println(sumDouble);

        //znaki
        char myCharA='F';
        char myCharB='T';
        char myCharC='$';

        System.out.println("Moja ulubiona literka to:" + myCharA);
        System.out.println("Moj ulubiony znak to:" + myCharC);

        int sumChar= myCharA + myCharB +myCharC;
        System.out.println("Suma znakow to: " + sumChar);

        //string ciagi znakow
        String myStringA = "Marcin";
        String myStringB = " Lubi placki";
        String myStringC = " z dzemem.";
        System.out.println(myStringA + myStringB + myStringC);

        //boolean
        boolean myBoolean = true;
        System.out.println(!myBoolean);

    }

}
