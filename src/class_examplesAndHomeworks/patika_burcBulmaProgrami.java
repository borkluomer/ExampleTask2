package class_examplesAndHomeworks;

import java.util.Scanner;

public class patika_burcBulmaProgrami {

    public static void main(String[] args) {

       int month,day;


        Scanner input= new Scanner(System.in);
        System.out.println("dogdugu ay ");
        month = input.nextInt();

        System.out.println("dogdugunuz gun");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day >= 31 && day <= 31)
                if(day < 22){
                    System.out.println("oglan burcu");
                }else{
                    System.out.println("kova burcu");
                }
                else {
                    System.out.println("gecersiz bir ay girdiniz");
                }
                break;
            case 2: if(day >= 1 && day <= 31)
                if(day < 22){
                    System.out.println("kova burcu");
                }else{
                    System.out.println("balik burcu");
                }
            else {
                System.out.println("gecersiz bir ay girdiniz");
            }
                break;

            default:
                System.out.println("HATALI BIR AY GIRDINIZ");

        }

    }
}
