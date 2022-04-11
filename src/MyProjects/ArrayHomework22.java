package MyProjects;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHomework22 {
    public static void main(String[] args) {
        // create a java logic that will count letter a or A from given string
        //example
        //JavA
        //output should be 2

        String letter = "Java";
        int temp = 0;

        for (int i = 0; i <letter.length() ; i++) {
            temp++;
            System.out.println(letter.charAt(i));

        }
        System.out.println(temp);

        //create a java program that will ask for 5 string name to store in the array
        //and print first and last letter from each string
        //example
        //input : berkan , firas ,merve ..
        //output : bn , fs ,me

       Scanner input = new Scanner(System.in);
       System.out.println("ENTER 5 NAMES : ");
       String [] names = new String [5];

        for (int i = 0; i < names.length ; i++) {
            String name= input.next();
            names[i]=name;


        }
        System.out.println(Arrays.toString(names));
        for (String x: names) {
            System.out.println(x.charAt(0)+ ""+ x.charAt(x.length()-1));

        }

        //task3
        //write a program that can return the largest string of text from an array
        //ex     String[] names = {"hello", "world", "java", "python", "sevgin", "renastechschool"};
        //output :renastechschool


        String[] names1 = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
        String longestWord = "";
        int max = names1.length;
        for (String word : names1){
            max=word.length();
            longestWord=word;


        }
        System.out.println("longestWord = " + longestWord);

        //create a java program that will check days string and depends on number you passed
        //you should be able to see day name
        //example : 2 tue
        //3 :wed
        //numbers should be between 1 and 7 (included)
        //if numbers are not between 1 and 7 print invalid number
        //and give user 3 attempt if it is still not between 1 and 7 then stop whole system

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Your # : ");
        int date =scan.nextInt();

        System.out.println("Whats the Day you like to Enter : " +date );
        String dateName = " ";

        switch (date){
            case 1: dateName = "MONDAY";
            break;
            case 2: dateName = "TUESDAY";
            break;
            case 3: dateName = "WEDNESDAY";
            break;
            case 4: dateName = "THURSDAY";
            break;
            case 5: dateName = "FRIDAY";
            break;
            case 6: dateName = "SATURDAY";
            break;
            case 7: dateName = "SUNDAY";
            break;
            default: dateName = "INCORRECT ENTRY : ";
            break;
        }
        System.out.println(" YOUR DATE IS : " +dateName);


        String [] daylist = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int incorrectNumber = 0;
        while (incorrectNumber<3){
            Scanner scn = new Scanner(System.in);
            System.out.println("Insert your number here : ");
            int number = scn.nextInt();

            if (number>=1 && number<=7){
                System.out.println(daylist[number-1]);
                break;
            }
            else {
                System.out.println("Wrong number inserted : ");
                incorrectNumber++;
            }
        }





    }
}
