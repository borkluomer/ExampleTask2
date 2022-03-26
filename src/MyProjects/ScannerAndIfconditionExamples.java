package MyProjects;

import java.util.Scanner;

public class ScannerAndIfconditionExamples {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("PLEASE ENTER YOUR NUMBER :");

        int number = 105 ;
        number = scan.nextInt();

        if (number % 5 ==0 && number % 3==0){
            System.out.println("FINRA");
        }else if(number % 5 == 0){
            System.out.println("FIN");
        }else if (number % 3 == 0){
            System.out.println("RA");

        }else {
            System.out.println("WRONG NUMBER INSERTED ");
        }


    }
}
