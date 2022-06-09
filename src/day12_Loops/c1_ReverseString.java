package day12_Loops;

import java.util.Scanner;

public class c1_ReverseString {
    public static void main(String[] args) {

        // how can you reverse a string
        // input hello
        //output olleh

        //input Java
        //output avaJ

        //reverse a string
        //you print your reverse string from last index to first index

        String word = "Hello";

        String reverseString = "" +word.charAt(4) + word.charAt(3) + word.charAt(2) +word.charAt(1)+word.charAt(0);
        System.out.println("a2_reverseString :" + reverseString);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Word :" );
        String word2 = input.nextLine();
        int lastindex = word2.length()-1;

        String reverseWord2 = ""; //i need to store word2 from last index to first index


        //last index -1
        //first index 0
        //i need to go from last to first one by one
        //itiration will be -1

        //Galatasaray total leght 11 last index is  10
        //reverse = char10 + char9 + char8..... until char0 which is the first initial
        for (int i =lastindex ; i >=0 ; i--){
            System.out.println("i = " +i); // print index from last to first
            System.out.println("reverseWord2 = " + reverseWord2); // prints reverseword
            System.out.println("word.charAt(i) =" + word2.charAt(i) ); // prints what you add to reverse
            reverseWord2 += word2.charAt(i); // reverseword2 = reverseword2 + letter
            System.out.println(" after adding charAt reverseWord2 = " +reverseWord2);

        }
        System.out.println(reverseWord2);








    }
}
