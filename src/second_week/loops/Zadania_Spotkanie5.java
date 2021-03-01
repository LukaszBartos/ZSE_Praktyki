package second_week.loops;

public class Zadania_Spotkanie5 {
    public static void main(String[] args) {

        //Zadanie 1


       System.out.println("Zadanie 1: ");
       for(int i=0; i<=20; i=i+2){
            System.out.println(i);
       }

       //Zadanie 2

        System.out.println("Zadanie 2: ");
        for(int i=30; i>=0; i=i-3) {
            System.out.println(i);
        }
        //Zadanie 3
        System.out.println("Zadanie 3: ");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " przejscie pętli");
            for ( int j = 1; j < 11; j++) {

                if(i*j%2==0){
                    System.out.println(" [i:" + i + "]" + "j:" + j + "]\t" + i +"*" + j + " = " + i *j + "\t");
                    }
                else {
                    System.out.println(" [i:" + i + "]" + "j:" + j + "]\t" + i +"*" + j + " = " + "x" + "\t");
                }
            }
        }



        //Zadanie 4
        System.out.println("Zadanie 4: ");

        System.out.println("liczby z zakresu podzielne przez 4 to:  ");
        for(int i=-40;i<=40;i++){

            if (i%4==0) {
                System.out.println(i);
            }
        }





    }
}
