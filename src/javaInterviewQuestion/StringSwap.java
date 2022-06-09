package javaInterviewQuestion;

public class StringSwap {
    public static void main(String[] args) {
        //WAp to swap string without using temp/third variable:

        String a = "Hello";
        String b = "World";

        System.out.println("Before Swapping ");
        System.out.println("value of a is: " +a);
        System.out.println("value of b is: " +b);

        //1. append a and b:
        a = a + b ; //HelloWorld

        //2. Store initial string a in String b:
        b= a.substring(0,a.length()-b.length());

        //3. Store initial String b in String a:
        a= a.substring(b.length());

        System.out.println("The value of a and b after swapping");
        System.out.println("value of a is: " +a);
        System.out.println("value of b is: " +b);

    }




}
