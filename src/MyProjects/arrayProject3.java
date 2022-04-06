package MyProjects;

import java.util.Arrays;

public class arrayProject3 {
    public static void main(String[] args) {


        //create a java program that will print numbers from biggest number to smallest number.
        // int [] arr={2,90,4,-99, 99,73};

        int [] arr= {2,90,4,-99, 99,73};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] biggerToSmallerNum = new int [arr.length];

        int value = 0;

        for ( int i = arr.length-1 ; i>=0 ; i--){

            biggerToSmallerNum[value]=arr[i]; //step 1 to arrange it
            value++; //step 2 is to up the value 1 by 1 ++

        }
        System.out.println(Arrays.toString(biggerToSmallerNum)); //print the line with Array.toString






    }
}
