package day21_MethodOverloading;

import java.util.Arrays;

public class c1_methodOverloading {

    public static void main(String[] args) {
        method();
        method(10);
        method(5);

        method(5.5);//double
        method("text"); //string
        method(5,5);//2 int

        method(3);

        //if you don't define whole number java will take as an int

        byte number1=3;
        method(number1);


    }

    public static void method(){
        System.out.println("Method");
    }

    public static void method(int a){
        System.out.println("hello method int " + a);
    }

    public static void method(int a ,int b){
        System.out.println("method 2 int");
    }
    public static void method(double a){

        System.out.println("method double " + a);
    }

    public static void method(String s){
        System.out.println("method string " + s);
    }

    public static void method(byte b){
        System.out.println("method byte " + b);
    }


}