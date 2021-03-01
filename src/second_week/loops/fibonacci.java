package second_week.loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner liczba_przejsc= new Scanner(System.in);
        int number;

        int fibonnaci1=0;
        int fibonnaci2=1;
        int fibonnaci3=0;
        System.out.println("Ile liczb");
        number=liczba_przejsc.nextInt();

        for(int i=3; i<=number; i++){
            fibonnaci3 = fibonnaci1+ fibonnaci2;
            System.out.println(fibonnaci3);
            fibonnaci1=fibonnaci2;
            fibonnaci2=fibonnaci3;

        }

    }
}
