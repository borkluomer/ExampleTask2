package javaInterviewQuestion;

public class SwapTwoIntegers {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        //x=10,y=10
        //1. with using third variable :t
        int t;
        t = x;
        x = y;
        y = t;

        //2. without using third variable: using + operator

        x = x + y ; //15
        y = x - y ; //5
        x = x - y ; //10

        //3. without using third variable: using * operator

        x = x + y ; //50
        y = x - y ; //5
        x = x / y ; //10

        System.out.println(x);
        System.out.println(y);


    }
}
