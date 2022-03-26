package day03_variablesContinue;

public class c5_relationalOperators {
    public static void main(String[] args) {

        byte b1=10;
        byte b2=25;

        boolean example= b1==b2; //false
        System.out.println();

        // == equal operators
        System.out.println(example == false); // false == false -- true


        // != opposite of equal -- not equal
        System.out.println(b1 !=b2);

        //means bigger
        System.out.println(b1 > b2); // false

        //means smaller
        System.out.println(b1<b2); //true

        //> means bigger or equal
        System.out.println( 10  >=  5); 

        // <= smaller or equal
        System.out.println(10 <= 5);

    }
}
