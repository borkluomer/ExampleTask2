package day17_Arrays;

import java.util.Arrays;

public class c3_reverseSentence {
    public static void main(String[] args) {


        ////create a condition that will reverse given sentence
        //        //ex: Java is fun
        //        //output should be fun is java
        ////create a condition that will reverse given string
        //        //ex: Java is fun
        //output should be nuf si avaJ


        String sentence = "java is fun";

        String []splitSentence=sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));

        String reverseSentence="";
        for (int i = splitSentence.length-1 ; i >=0 ; i--) {
            reverseSentence=reverseSentence+splitSentence[i] + " ";


        }
        System.out.println(reverseSentence);

        String sentence2 = "Java is fun";
        String [] split2=sentence2.split(""); // we will split from each letter and store in to string array

        String reverse2 = "";
        for (int i = split2.length-1; i >=0 ; i--) {
            reverse2=reverse2+split2[i];



        }
        System.out.println(reverse2);


    }
}
