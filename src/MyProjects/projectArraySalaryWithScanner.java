package MyProjects;

import java.util.Scanner;

public class projectArraySalaryWithScanner {
    public static void main(String[] args) {

             // create a logic that will store 5 employees salaries (double) from scanner input
             //  and print each salary's
             //Output :
             //Enter the salaries of 5 employees.
             //234  //789  //123  //456  //453
             //The salaries are: //234.0  //789.0  //123.  //456.0  //453.0

        double [] doubleArray = new double[5]; //since its 5 employees
        Scanner input = new Scanner(System.in); //setting a scanner for data entry

        for (int i = 0 ; i<doubleArray.length; i++){
            System.out.println("ENTER YOUR SALARY FOR Any EMPLOYEE : "+ (i+1));
            doubleArray[i] = input.nextDouble();
        }

        System.out.println("BASE SALARY");
        for (int i = 0; i<doubleArray.length; i++){
            System.out.println(doubleArray[i]+" ");
        }

    }
}
