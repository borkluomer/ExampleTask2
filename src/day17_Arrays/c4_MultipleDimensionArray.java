package day17_Arrays;

import java.util.Arrays;

public class c4_MultipleDimensionArray {
    public static void main(String[] args) {

        //declaration of array
        //1 dimension array
        //Datatype [] name = {data1,data2,data3}
        //2 dimension array
        //DataType [][] name =
        // {
        // {data1,data2,data3}
        // {data1,data2 },
        // {data1,data2,data3}
        // }

        int [] arr = {1,2,3,4,5};
        //            0 1 2 3 4
        System.out.println("arr 1D :" + arr.length); //5

        int [] [] arr2 = {     {10,20,30} , {0,20,40} , {20,40} , {50} };//has two seperate index
        //container indexes       0             1          2        3
        //index for each number  0  1  2     0  1  2      0  1      0

        System.out.println("arr 2d : " +arr2.length); //3
        System.out.println(arr2[2].length); //2

        //arr[][]
        //first bracket is always container number
        //second one is index of variable


        System.out.println(arr2[1][2]);
        //arr[1][2]   : get index 1 container and get index2 from index1 container

        //print 30

        System.out.println(arr2[0][2]); //prints 30
        System.out.println(arr2[3][0]); //prints 50

        System.out.println("..............................................");
        //how do i get length of each container
        System.out.println(arr2[0].length);
        System.out.println(arr2[2].length);
        System.out.println(arr2[3].length);
        // System.out.println(arr2[5].length); out of bond wont work you only have 4 total

        //how do you print each container?
        //if i want to print all the numbers from spesific container which was [2]
        System.out.println(Arrays.toString(arr2[2]));  //output will be [20, 40] below will be printed

        //can you seperate a container out of one dimension

        int [] container0 = arr2[0];










    }
}
