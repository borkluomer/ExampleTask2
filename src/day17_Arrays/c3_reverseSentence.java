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

        ////create a condition that will reverse given sentence
        //        //ex: Omer Cihad Borklu
        //        //output should be Borklu Cihad Omer
        ////create a condition that will reverse given string
        //        //ex: Omer Cihad Borklu
        //output should be ulkrob dahiC remO



        String sentence1 = "Omer Cihad Borklu";
        String reverseSentence1 ="";
        String [] splitSentence1 = sentence1.split("");


        System.out.println(Arrays.toString(splitSentence1));

        for (int i=splitSentence1.length-1; i>=0; i--){
            reverseSentence1=reverseSentence1+splitSentence1[i] + " ";

        }
        System.out.println(reverseSentence1);

        String sentence3 = "HUSEYIN BORKLU";
        String reverseSentence3 = "";
        String [] splitName = sentence3.split("");

        System.out.println(Arrays.toString(splitName));

        for (int i = splitName.length-1 ; i>=0 ; i--) {
            reverseSentence3=reverseSentence3+splitName[i] + "";
        }
        System.out.println(reverseSentence3);


        String fullName = "Cihangir Sahin"; //create a text
        String space = ""; //create space to insert the flip text
        String [] split = fullName.split(""); //create an array to split

        System.out.println(Arrays.toString(split)); //print your split

        //now create a for loop to flip your word back words
        for (int i = split.length-1; i >= 0 ; i--) { // your for loop says here if i = flip.length-1 bc of index
            space=space+split[i] + "";               // then saying i>= if i bigger equal then 0
                                                     //since youre going backwords you do i--

        }
        System.out.println(space);





    }
}
