package day19_methods;

import java.util.Arrays;
import java.util.Scanner;

public class c1_FirstLastLetter {
    public static void main(String[] args) {

        //create a java program that will ask for 5 string name to store in the array
        //and print first and last letter from each string

        // example
        //input :
        //output : bn,sn,hb,

        //WHAT WILL YOU USE LIST IT ?
        //Scanner: input scan to store numbers
        //Array string [] to store 5 names
        //For loop: loop to store 5 names ....|| you can do it with while loop as well
        //charAt: to get each letter from each name
        //foreach: to store initials from each name a new string

        //first set up your scanner
        Scanner input = new Scanner(System.in);
        //to store 5 names we set a scanner

        String [] nameList = new String [5];
        //to store 5 names you create a list and put 5 inside the array
        //nameList[0] ="hello";
        //nameList[1] ="hello";
        //nameList[2] ="hello";
        //nameList[3] ="hello";
        //nameList[4] ="hello";

        for (int i =0 ; i< nameList.length; i++){
            System.out.println("Enter a name for index : " +i);
            nameList[i]= input.next();
        }

        //to print all the names
        System.out.println(Arrays.toString(nameList)); // now you can enter 5 names below

        String firstLastLetters="";
        for (String eachName : nameList){

            firstLastLetters =firstLastLetters + " " +eachName.charAt(0) +eachName.charAt(eachName.length()-1);
        }

        System.out.println(firstLastLetters);











    }
}
