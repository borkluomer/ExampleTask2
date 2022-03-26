package class_examplesAndHomeworks.scanner_Ornek;

import java.util.Scanner;

public class KullanicidanInputAlma {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("what is your username : " );
        String firstName=input.next();


        System.out.println("Plug in lastname : ");
        String lastName = input.next();

        System.out.println("Enter Username : ");
        String username = input.next();

        System.out.println("Enter the age : ");
        int age = input.nextInt();

        System.out.println("where the user is from : ");
        String city= input.next();

        System.out.println("Enter Id number here Please");
        double idNumber= input.nextDouble();







    }
}
