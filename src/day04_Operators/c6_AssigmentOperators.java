package day04_Operators;

public class c6_AssigmentOperators {

    public static void main(String[] args) {

        int number = 125;
        System.out.println(number);

        // if you want to re assign your number to 100

        number=100;
        //you assign something else to your variable
        System.out.println(number);

        int number2 = 25;
        number2 = number;
        System.out.println(number2);

        int x = 10;
        x=x+10; // x= 10+10
        System.out.println(x);
        x=x+30; // x=20+30
        System.out.println(x);

        x+=100; // x= x+100
        System.out.println(x);

        int y = 20;
        y = y+20; //40
        y+= 20; //60
        y*=2; // y = y * 2 = 60 * 2
        System.out.println(y);



    }
}
