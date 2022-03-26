package day08_scanner_String;

import java.util.Scanner;

public class c3_scannerPractice {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.println("Enter employee First NAME :" );
        String firstName = object.next();
        //next will accept one word
        //next doesnt accept enter
        System.out.println("first name :" + firstName);

        //to handle enter that comes aftetr next use below line
        object.nextLine(); // this basically create a enter nextline SKIPPING TO NEXT LINE

        System.out.println("full name of the Employee : " );
        String fullName = object.nextLine(); // will accept enter
        System.out.println("fullname is " +fullName);

        System.out.println("enter employee age :" );
        int age = object.nextInt();
        System.out.println("employee age is :" + age);

        //after passing the age enter object.nextLine so it will read this before it prints on the bottom
        object.nextLine(); //this accepts the next line pretty much

        System.out.println("enter employee city");
        String cityName = object.nextLine();
        System.out.println("city name is " + cityName);

        System.out.println("enter salary for employee");
        double salary = object.nextDouble();
        System.out.println("salary is " + salary);









    }
}
