package MyProjects;

import java.util.Scanner;

public class HomeWorkWeek6 {
    public static void main(String[] args) {

        //Create a Java Program to Make a Simple Calculator Using switch...case

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        double d1 = scan.nextDouble();

        System.out.println("ENTER YOUR SECOND NUMBER : ");
        double d2= scan.nextDouble();
        System.out.println("YOU CALC : ");

        char calc = scan.next().charAt(0);
        double result = 0;
        switch (calc){
            case'+':
                result= d1 + d2;
                break;
            case'-':
                result= d1 - d2;
                break;
            case'*':
                result= d1 * d2;
            case'/':
                result= d1 / d2;
            default:
                System.out.println("WRONG SYSTEM USED TRY THE RIGHT TERMS SUCH AS (+,-,/,*) TO DO YOUR CALC ");

        }
        System.out.println(d1+ " " +calc + " " +d2 + " " + result);









    }
}
