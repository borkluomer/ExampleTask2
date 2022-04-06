package MyProjects;

public class ArrayConcept {
    public static void main(String[] args) {



        //array concept is to store similar data type values in an array variables
        // 1. int array :
        //lowest bound/index =0
        //upper bound/index = n-1(n is size of array)
        //one dimensional array

        //dis-advantages
        //1. size fixed--static array is fixed--overcome this problem-- we use Collections--ArrayList,HashTable,use dynamic array
        //2. store ONLY SIMILAR data types   --to overcome of this problem, we use Object array.
        //advantages of array:
        //1. array list group everything have a easy access!!!!


        int i []  = new int[4];
        i [0] = 10;
        i [1] = 20;
        i [2] = 30;
        i [3] = 40;

        System.out.println(i[2]); //30
        System.out.println(i[3]); //40

        //System.out.println(i[4]); //i [4] doesn't exist ArrayOutOfBounceException

        System.out.println(i.length); //it will give you the size of the array basically the length

        //print all the values of array:for loop concept

        for ( int j = 0 ; j < i.length ; j++ ) {
            System.out.println( i[j] );
        }

        //2. double array
        double d [] =new double[3];
        d [0] = 12.33;
        d [1] = 13.44;
        d [2] = 45.55;

        System.out.println(d[2]);

        //char array :
        char c [] = new char[3];
        c [0] = 'q';
        c [1] =  2;
        c [2] = '$';

        //4. boolean array:
        boolean b [] = new boolean[2];
        b [0] = true;
        b [1] = false;

        //5. String array:
        String s [] =new String[3];
        s [0] = "test";
        s [1] = "Hello";
        s [2] = "World";

        System.out.println(s.length);
        System.out.println(s[1]); //"Hello" will Print

        //6. Object Array (Object is class) ---- is used to store different data types values

        Object ob[] = new Object[6];
        ob [0] = "Omer";
        ob [1] =  33;
        ob [2] =  12.33;
        ob [3] =  10/14/1988;
        ob [4] =  'M';
        ob [5] =  "Turkey";
        System.out.println(ob[5]); //Turkey
        System.out.println(ob.length); //6

        //**********************PRINT ANY ARRAY USING FOR-LOOP ********************************************









    }
}
