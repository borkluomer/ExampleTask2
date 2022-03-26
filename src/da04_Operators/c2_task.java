package da04_Operators;

public class c2_task {
    public static void main(String[] args) {

        //create 3 different number
        // second number should be = first number +7
        // third number should be = second number +8
        // ex : x= 25 y=32 z=40
        //ex  : x= 20 y=27 z=35.

        int x=25;
        int y= x+7;
        int z= x+8;
        System.out.println(x+y+z);
        System.out.println(y);
        System.out.println(z);

        int t= 20;
        int v= t+7;
        int b= t+8;
        System.out.println(t+v+b);
        System.out.println(v);
        System.out.println(b);
        System.out.println("Sum of number: " + (t+b+v));

        // x is devisiable by 2,3,5

        //3. check if x is divisible by 2 , 3 , 5 (Check for each number)//        if it is divisible print : 350 is divisible by 2 true
        //  if it is not divisible print : x is divisible by 2 false

        //x= 25
        // is x divisiable by 2
        System.out.println("25 is divisible by 2: true");

        //if number is divisible by 2 == that means number has reminder as 0
        boolean divisiableBy2forX= x%2==0; //if a reminder == to 0 that means number is divisialbe by 2

        System.out.println(x+ "is divisible by 2: " + divisiableBy2forX);

        boolean divisibleby3forX= x%3==0;
        System.out.println(x + "os divisible by 3 :" +divisibleby3forX);







    }
}
