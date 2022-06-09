package javaInterviewQuestion;

public class stringClassDemo {

    public static void main(String[] args) {
        //String: it is one of the rebuilt class in java
        //1. String literal
        //2. By creating object of string


        String a = "javaTraining"; // string literal
        String b = "Hello";
        // String a = new String("hello"); with string class
        // String b = new String("hello");
        System.out.println(a.charAt(2)); //v
        System.out.println(a.indexOf("e")); //-1
        System.out.println(a.substring(3, 6)); //atr
        System.out.println(a.substring(5)); //raining
        System.out.println(a.concat(" Chad Teaches")); //javaTraining Chad Teaches
        System.out.println(a.length()); //12
        System.out.println(a.trim()); //javaTraining
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        String arr [] = a.split("t");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("t","s"));

    }
}
