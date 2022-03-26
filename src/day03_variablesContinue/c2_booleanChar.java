package day03_variablesContinue;

public class c2_booleanChar {
    public static void main(String[] args) {
       //boolean     1bit Stores TRUE OR FALSE values

        //char       2 bytes Stores a single character/letter or ASCII values 'a'
        //dataTypes variableNames=data;

        boolean b1=true;
        boolean b2=false;

        boolean b3=10>15; //false

        System.out.println(b3);
        System.out.println(b1);

        //char ch1='aasdad' char will only store single letter (character) or number from ascii table

        char ch2='a';
        System.out.println(ch2);

        ///
        // == means equal
        // != means not equal

        boolean bool1=25==30; // false
        System.out.println(bool1);
        boolean boole2=20!=21; //true
        System.out.println(boole2);

        // ! will chage your valies as opposite one
        // !true = false
        // !false= true

        System.out.println(true==false);
        System.out.println(!true==false); //false==false--------True

        System.out.println(!true != !false);
                           //(false != true)
                           //true
        System.out.println(!(true==false));
                           //( !(false) )
                           //   (true)

        System.out.println( !(true==true) ==false==!true);
                        // !( (true)      ==   (false == false) )
                        // false          ==    (true)
                        // (false)

        //char  2 byts Stores a single character/letter or ASCII values 'a'

        char c1= 'a';
        char c2= '2';
        char c3= '@';
        //char c4='aaa'; //this is an error char will only store a single character

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //ascii table
        // from ascii table number 97 is = small letter a
        //65 is capital A

        int i= 97;
        char ch1= 97;
        System.out.println(i); //97
        System.out.println(ch1); //a

        int i1= 65;
        char ch22=65;
        char ch23='A';

        System.out.println(i1);
        System.out.println(ch22);
        System.out.println(ch23);

        System.out.println(i1+ch22); // int + char =?? 65+65 basically
        //since we have int as a number and wanted to sum with char
        //java will take ascii number for char













    }
}
