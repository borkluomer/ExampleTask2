package day16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c1_array1 {
    public static void main(String[] args) {

        //find the sum of the numbers from int array
        int [] numbers = {4,-90,200,5}; //sum of these numbers will be 119 if you run it
        //index of        0  1  2   3

        int sumOfTheArray = 0; // we will use this to store my answers since it has no value its zero 0

        int lastIndex = numbers.length-1;

        //index's    i=0 1 , 2 , 3
        for (int i = 0 ; i < lastIndex ; i++){
            //i=0    0<4               0++
            //i=1    1<4               1++
            //i=2    2<4               2++
            //i=3    3<4               3++
            //i=4    4<4   FALSE      IT WILL BREAK THE FOR LOOP NOW

            sumOfTheArray+=numbers[i]; // 0 + 4 -90 +200 +5
            //            =numbers[0]=4
            //            =numbers[1]=-90
            //            =numbers[2]=200
            //            =numbers[3]=5
            System.out.println("sumOfTheArray =" +sumOfTheArray);

            //ARRAY SIZE PART;
            //array size is fixed  *************** VERY IMPORTANT NOTE

            int[] ages= new int [5];
            // length is 5
            //length is only 5 so you cant ask for 10 below
           // System.out.println(ages[10]); // ArrayIndexOufOfBoundException!!!!!!!

            ages[2] =50;
            System.out.println(ages[2]); // it will print 50 since you updated the index 2
            System.out.println(ages[3]); // you will get a 0 because you didn't update the value DEFAULT VALUE 0

            boolean [] foundJob = new boolean[3]; //if you dont put number inside it will give you an error
            //                   0 1 2

            System.out.println(foundJob[0]); // it will give you false bc we didnt assign anything
            System.out.println(foundJob[1]); // as a default it will give FALSE WHEN YOU RUN IT

            foundJob[0] = true; //JUST UPDATED INDEX 0 with the value its TRUE now
            System.out.println("foundJob[0]" + foundJob[0]); //TRUE

            System.out.println("***************************************************");

            //ARRAY UTILS
            //array is a library inside java so
            //array is a JAVA which has some Methods

            String [] futureSdets = {"Omer" , "Baris", "Taylan", "Aslihan", "Abe", "Mahir"};

            System.out.println(futureSdets); // if i print names of the array, it will print hashcode!

            System.out.println(Arrays.toString(futureSdets));
            /**
            * Notes: Array.toString() is a method that converts an array as a String
            * */

            int [] numList = {0,0,78,900};

            System.out.println(numList); //[I@135fbaa4, which hashcode for numList

            System.out.println(Arrays.toString(numList)); // [0,0,79,900]

            System.out.println("-----------------------------------------------");
            //combine 2 int array

            int [] list1 = {1,0,5}; //length =3
            //              0  1 2
            int [] list2 = {-90,78,100,90}; //length 4

            // expected array will be like list3

            //create one array now int[]list3 = {1,0,5,-90,78,100}; length=7
            // length willbe= list.length+list2.length

            //                       3          +    4
            int [] list3 = new int[list1.length + list2.length];

            System.out.println(Arrays.toString(list3)); // [0, 0, 0, 0, 0, 0, 0] bc i didn't assign any value

            for (int j=0 ; j< list3.length; j++){ //we will put list1 into the list3
                //j=0      j<3       0++
                //j=1      1<3       1++ which is your ittiration
                //j=2      2<3       2++
                list3[j]=list1[j];
                //list3 index 0 >> 1
                //list3 index 1 >> 0
                //list3 index 2 >> 5;
            }System.out.println(Arrays.toString(list3));

            for (int j =0 ; j< list2.length; j++ ){
                // j=0      0<4
                // j=1      1<4
                // j=2      2<4
                // j=3      3<4
                // j=4      4<4


                list3[ list1.length +j ]=list2[j];
                //list3 [ 3+ 0 ]        = list[0]
            }







        }










    }
}
