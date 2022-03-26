package class_examplesAndHomeworks;

import java.util.Scanner;

public class w3_practice {
    public static void main(String[] args) {

        int math,english,history,science,java;
        int toplam;
        Scanner scn = new Scanner(System.in);
        System.out.println("Lutfen Matermatik Notunu Giriniz");
        math = scn.nextInt();


        System.out.println("Lutfen English Notunu Giriniz");
        english = scn.nextInt();


        System.out.println("Lutfen History Notunu Giriniz");
        history = scn.nextInt();


        System.out.println("Lutfen SCIENCE Notunu Giriniz");
        science = scn.nextInt();


        System.out.println("Lutfen java Notunu Giriniz");
        java = scn.nextInt();

        toplam = (math+science+java+history+english)/5;
        System.out.println(math+english+history+science+java + " DERSLERIN ORTALAMASI");

        if(toplam>=85){
            System.out.println("AA");

        }else if(toplam>=70 && toplam<85){
            System.out.println("BB");


        }else if(toplam>=50 && toplam<=69){
            System.out.println("CC");

        }else {
            System.out.println("FAIL");
        }









    }
}
