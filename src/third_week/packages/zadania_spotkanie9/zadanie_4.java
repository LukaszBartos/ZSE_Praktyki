package third_week.packages.zadania_spotkanie9;

import java.util.Scanner;

class pracownik{
    private String name;
    private String nazwisko;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName2() {
        return nazwisko;
    }
    public void setName2(String name){
        this.nazwisko = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class zadanie_4 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj wiek: ");
        int a = skaner.nextInt();
        System.out.print("Podaj imię: ");
        String n = skaner.next();
        System.out.println("Podaj nazwisko: ");
        String c =skaner.next();

        pracownik i = new pracownik();
        i.setAge(a);
        i.setName(n);
        i.setName2(c);

        System.out.println(" \nWiek : " + i.getAge()+ "\nImię: " + i.getName()+"\nNazwisko: "+i.getName2()  );
    }
}
