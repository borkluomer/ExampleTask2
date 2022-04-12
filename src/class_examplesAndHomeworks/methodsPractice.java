package class_examplesAndHomeworks;

import java.util.Scanner;

public class methodsPractice {

    public static void factorial(){
        Scanner scan = new Scanner(System.in);

        System.out.println("INSERT NUMBER : ");

        int number = scan.nextInt();
        int factorial = 1;

        while (number>0){
            factorial*=number;
            number--;
        }

        System.out.println("FACTORIAL : " + factorial);




    }
    public static void main(String[] args) {
        factorial();
        factorial();
        factorial();





    }




}
