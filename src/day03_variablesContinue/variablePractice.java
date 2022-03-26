package day03_variablesContinue;

public class variablePractice {
    public static void main(String[] args) {

        //boolean     1bit Stores TRUE OR FALSE values

        boolean b1= true;
        boolean b2= false;

        boolean b3= 55>45;
        boolean b4= 66<33;
        boolean b5= 99>44;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b5);
        System.out.println(b4);

        char c1= 'A'; // these actually repersent number due to the char initials
        char c2= 'B'; // same it will print as a number
        char c3= 'C'; // its basically a number not a character in the print out
        System.out.println(c1+c2+c3);
        // aritmatic operators examples

        //plus
        //minus Operators
        //multiple Operators
        //divisions
        //reminders

        byte t1= 100;
        byte t2= 111;
        byte t3= 122;
        byte t4= 123;

        short s1= -32768;
        short s2= -30768;
        short s3= -28768;
        short s4= -26768;

        int n1= -2555555;
        int n2= 2555555;
        int n3= 35000000;
        int n4= 55000000;


        System.out.println(t1+t2);
        System.out.println(s1-s4);
        System.out.println(n4*n1);
        System.out.println(n4>n3);
        System.out.println(n3%n1);
        System.out.println(n2/s2);
        System.out.println(n2*3);
        System.out.println(7/5);
        System.out.println(45/5);
        System.out.println(7/3.5);
        System.out.println(10%5);

        //testing 350 is divisiable to these 3 numbers which is 2-3-5

        boolean e1= true;
        boolean e2= false;
        int x1= 350;
        int x2= 2;
        int x3= 5;
        System.out.println(x1>x2);



    }
}
