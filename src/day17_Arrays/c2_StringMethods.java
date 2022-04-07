package day17_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c2_StringMethods {
    public static void main(String[] args) {
        //Another String Methods
        //toCharArray()

        //Methods                                DESCRIPTION                                 RETURN TYPE
        //toCharArray()         this will take a string and return you a char array            char[]

        String str = "Hello world java is fun";

        // System.out.println(str.toCharArray()); it will print everything

        char[] letters = str.toCharArray();
        System.out.println(letters[3]); // this will print 'l'
        System.out.println(Arrays.toString(letters)); // all of them will store as a char method Array
        //This is what it will print  [H, e, l, l, o,  , w, o, r, l, d,  , j, a, v, a,  , i, s,  , f, u, n]

        System.out.println("----------------------------------------------------------");


        //string method
        //split()
        //this will split given string from specific condition in the string      RETURN TYPE
        //                                                                         string[]

        String myString = "Java is very fun";
        //task
        //to split given sentence from spaces

        String [] splitSentence = myString.split(" "); //to split from spaces
        System.out.println(Arrays.toString(splitSentence));
        System.out.println("splitSentence[1] = " + splitSentence[1]);

        String [] splitSentence2 = myString.split("a");
        System.out.println(Arrays.toString(splitSentence2));

        String [] split3 =myString.split(""); // to split from each letter
        System.out.println(Arrays.toString(split3));

        // tochararray vs split
        //split is more spesific to split anywhere you want
        //split returns string array tochararray returns char array

    }
}
