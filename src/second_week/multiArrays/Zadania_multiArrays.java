package second_week.multiArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Zadania_multiArrays {

    public static void main(String[] args) {

        System.out.println("Zadanie 1");
        int[][] array2 = new int[5][5];
        int value = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                array2[i][j] = value;
                value = value + 5;
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Zadanie 2");
        int[][][][] tablica4 = new int[3][3][3][3];
        int value2 = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int n = 0; n < 3; n++){
                    for (int z = 0; z < 3; z++) {
                        tablica4[i][j][n][z] = value2;
                        value2 += 2;
                        System.out.print("[" + i + "][" + j + "][" + n + "][" + z + "]= " + tablica4[i][j][n][z] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Zadanie 3");
        int[][][][][] tablica5 = new int[2][2][2][2][2];
        int value3 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int n = 0; n < 2; n++) {
                    for (int z = 0; z < 2; z++) {
                        for (int x = 0; x < 2; x++) {
                            tablica5[i][j][n][z][x] = value3;
                            value3 += 3;
                            System.out.print("[" + i + "][" + j + "][" + n + "][" + z + "][ " + x + " ]= " + tablica5[i][j][n][z][x] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Zadanie 4");
        Random rand= new Random();
        System.out.println("liczby tablicy 1: ");
        int[][] tabliczka = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                tabliczka[i][j]=rand.nextInt(10);
                System.out.println(tabliczka[i][j]);






            }

        }
        System.out.println("liczby tablicy 2: ");
        int[][] tabliczka2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                tabliczka2[i][j] = rand.nextInt(10);
                System.out.println(tabliczka2[i][j]);
            }
        }
        System.out.println("Suma liczb tablic:");
        int [][] tabliczka3 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int sum= tabliczka[i][j]+tabliczka2[i][j];
                tabliczka3[i][j] =sum ;
                System.out.println("suma liczb wynosi:"+ tabliczka3[i][j]);

            }
        }




        System.out.println("\nZadanie1_lista");
        ArrayList<String> lista_warzywa = new ArrayList<>();
        lista_warzywa.add("Brokuł");
        lista_warzywa.add("Ziemniak");
        lista_warzywa.add("Marchewka");
        lista_warzywa.add("Papryka");
        System.out.println("lista warzyw: " +lista_warzywa);

        lista_warzywa.add(3, "Ogórek");
        System.out.println("lista warzyw po dodaniu Ogórka: " +lista_warzywa);

        lista_warzywa.remove(1);
        System.out.println("lista warzyw po usunięciu ziemniaka indeksem: " +lista_warzywa);

        lista_warzywa.remove("Papryka");
        System.out.println("lista warzyw po usunięciu Papryki nazwą: " +lista_warzywa);

        lista_warzywa.set(1, "fasola");
        System.out.println("lista warzyw po zastąpieniu marchewki fasolą:" +lista_warzywa);

        Collections.sort(lista_warzywa);
        System.out.println("Sortowanie: " + lista_warzywa);

        lista_warzywa.clear();
        System.out.println("czyszczenie listy: " +lista_warzywa);



    }
}
