package second_week.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class zadania_tablice {

    public static void main(String[] args) {
        //Zadanie 1
        System.out.println("Zadanie 1");
        char[] charArray = {'d', 'c', 'b', 'f', 'z', 'x', 'h', 'u', 'p', 'a'};
        Arrays.sort(charArray);
        System.out.println("Sortowanie w porządku rosnącym " + Arrays.toString(charArray));

        //Zadanie 2
        System.out.println("Zadanie 2");
        String[] stringArray = {"Jan ", "ma", "psa ", "o ", "imieniu ", "Popek", "oraz", "kota", "Pimpka", ".",};
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(stringArray));

        //zadanie3

        System.out.println("Zadanie 3");
        String imiona[] = {"Roki", "Popek", "Pimpek"};
        Random rand = new Random();
        int imie_psa = rand.nextInt(imiona.length);
        System.out.println("Wylosowane imie psa to:" +imiona[imie_psa]);


        //Zadanie 4
        System.out.println("Zadanie 4");
        String Potrawy[] = {"Pizza", "Zupa", "Płatki z mlekiem", "nic", "Spaghetti", "jajecznica"};
        Random rand1 = new Random();
        int jedzenie = rand.nextInt(Potrawy.length);
        System.out.println("Na sniadanie zjem:" +Potrawy[jedzenie]);
        Random rand2 = new Random();
        int jedzenie2 = rand.nextInt(Potrawy.length);
        System.out.println("Na obiad zjem:" +Potrawy[jedzenie2]);
        Random rand3 = new Random();
        int jedzenie3 = rand.nextInt(Potrawy.length);
        System.out.println("Na kolacje zjem:" +Potrawy[jedzenie3]);

        //Zadanie 5
        System.out.println("Zadanie 5");
        Integer[] x={7, 11, 20, 9, 5, 3, 12, 2, 10, 4, 6, 15, 19, 18, 1, 16,  14, 8, 13, 17 };
        Arrays.sort(x,0,10,Collections.reverseOrder());
        Arrays.sort(x,10,20);
        System.out.println("Sortowanie: "+Arrays.toString(x));











    }
}
