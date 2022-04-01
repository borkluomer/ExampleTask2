package StudyHallSessions.Week5;

import java.util.Random;
import java.util.Scanner;

public class Session3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("------------------------");
            System.out.println("TABLE OF : " + i);
            System.out.println("------------------------");

            for (int k = 1; k <= 10; k++) {
                System.out.println(i + " x " + k + " = " + (i * k));

            }
        }
        System.out.println("***********************************************");

        //write a program to creat a Right Triangle Star Pattern Program
        //Please use nested for loop and height is 7.

        for (int j=1 ; j<=7 ; j++){

            for (int k =1 ; k<=j ; k++){
                System.out.print("*");

            }
            System.out.println();


        }

        // Guessing game
        //Please follow the steps below
        // Step 1-  Create 2 int variables with name of randomNumber , userInput;
        //Step 2- Create a program that will generate randomly a number between 1 to 10
        //to generate a random number use >>
        //Random random=new Random();
        //int randomNumber = random.nextInt(10) + 1;
        // Step 2- Ask the user to enter a number between 1-10
        //Step 3-  Create a logic with a do-while loop that will ask the user to enter a
        // number as long as the random number and user input are not matching.


        // Step 1-  Create 2 int variables with name of randomNumber , userInput;

        int randomNumber;
        int userInput;
        //Step 2- Create a program that will generate randomly a number between 1 to 10
        do {
            Random random = new Random();
            //Step 2- Create a program that will generate randomly a number between 1 to 10
            //to generate a random number use >>
            randomNumber = random.nextInt(10)+1;

            Scanner input = new Scanner(System.in);
            System.out.println("ENTER A NUMBER BETWEEN 1 and -10");

            userInput=input.nextInt();
            System.out.println("RANDOM WAS .. " +randomNumber);


            // Step 3- Ask the user to enter a number between 1-10

        }while(randomNumber != userInput);
        //Step 3-  Create a logic with a do-while loop that will ask the user to enter a
        // number as long as the random number and user input are not matching.
        System.out.println("CONGRATULATIONS... ");







    }
}
