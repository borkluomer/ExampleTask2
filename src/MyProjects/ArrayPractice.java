package MyProjects;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {


        String [] info = {"Omer" , "Cihad" , "Borklu" , "1988" , "TURKEY"};
        System.out.println(Arrays.toString(info));

        for (int i = 0; i < info.length ; i++) {
            System.out.print(info[i] + " 🇹🇷 "   );

        }
        System.out.println();
        System.out.println("--------------------------------");

        int [] years = { 2022, 1988, 1453, 1905, 2000, };
        Arrays.sort(years);
        System.out.println(Arrays.toString(years));

        String [] cities = {"Istanbul" , "Ankara" , "Bursa" , "Izmir" , "Trabzon" , "Antalya" , "GaziAntep" , "Adana"};
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        System.out.println("--------------------------------------------");

        //Q17 Write a program to check whether two given Arrays are equal,

        int [] number1 = {11,22,33,44,55,66};
        int [] number2 = {11,22,33,99,55,77};
        int [] number3 = {11,66,33,44,55,88};

        boolean n1 = Arrays.equals(number1,number2);
        boolean n2 = Arrays.equals(number2,number3);
        boolean n3 = Arrays.equals(number1,number3);

        System.out.println(n1 + " , " +n2 + " , " +n3);

        //Q18 Which is legal int[] arr or int arr[] ?
        //ANSWER for: 18 ------- int [] arr

        //Q19 Write a program to throw ArrayOutOfBoundsException?
        //ANSWER FOR 19:when you only have certain amount of length, and you exceed the limit which you go out of the Range
        //example String [] names = {"ali" , "ahmet", "hasan" }
        //you trying to pring Systen.out.println(names.[9]) you only have 0,1,2 index which is length-1 is 2 is the max
        // you can use not any larger number so cant put 9 inside []

        //Q20 There are two arrays object one containing 100 elements and another containing 50 elements.
        // ANSWER FOR 20: if they are same dataType we can assign them together.
        // Both are of same data type. Can we assign one Array to another Array

        //Q21 What will happen if you do not initialize variables in the Array?
        //unknown value or default value

        //Q22 How to find duplicate elements in a given Array?
        //loops and nested loops

        //Q23 Is this a legal way to define arrays int[] arr = new int [4]{1, 2, 3, 4};
        //no its wrong


        //Q24 Write a program to sum all the values of a given Array in java?

        int [] value ={10,20,30,40,50,60,70,80,90,100};
        int total = 0;

        for (int i = 0; i < value.length ; i++) {
            total=total+value[i];


        }
        System.out.println("sum = " + total);


        ////Q25 create a condition that will reverse given sentence
        //   //ex: Java is fun
        //   //output should be fun is java
        ////create a condition that will reverse given string
        //   //ex: Java is fun
        //   //output should be nuf si avaJ

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
