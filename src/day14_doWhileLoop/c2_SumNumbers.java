package day14_doWhileLoop;

import java.util.Scanner;

public class c2_SumNumbers {

    /// task
    //Write a do-while loop that asks the user to enter two numbers.
    // The numbers should be added and the sum displayed.
    // The loop should ask the user whether he or she wishes to perform the operation again.
    // If so, the loop should repeat; otherwise it should terminate.
    // if user says y or Y continue
    // if user says n or N stop the loop


    //class color is red that means this class is not added to git
    //class color is green that means this class is added (git add comments done)
    //class color is blue that means this class is committed (git add and git commit comments done)
    // class color is white that means this class is  pushed

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char choice; // just tell me yes or not
        int number1 , number2  ;

        do {
            System.out.println("Enter a First Number :");
            number1= input.nextInt();
            System.out.println("Enter a Second Number :");
            number2 = input.nextInt();
            //The number should be added and the sum displayed
            int sum= number1+number2;
            System.out.println("Sum of "+ number1 + " + " +number2 +" is : " +sum);

            //The loop should ask the user wheter he or she wishes to perform to the operation again
            //if so the loop should repeat otherwise it should terminate
            //if yser says y or Y it will do the sum over and over
            //if use says n or N it will finish the sum of the loop

            System.out.println("DO YOU WANT TO SUM 2 NEW NUMBERS YES/NO");
            choice= input.next().charAt(0);



        }while (choice == 'y' || choice== 'Y');







    }
}


