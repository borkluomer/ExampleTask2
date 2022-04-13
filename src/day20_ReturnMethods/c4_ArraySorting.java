package day20_ReturnMethods;

import java.util.Arrays;

public class c4_ArraySorting {

    public static void main(String[] args) {
        int [ ] numbers = {5,45,89,0,2,4,21,47};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("***********************************");

        int [] numbers2= {5,45,89,0,2,4,21,47};
        descendingSort(numbers2);
    }

    //create a method that will sort array //descending order meaning LARGE TO SMALL
    public static void descendingSort( int [] arr ){
        //first I will sort it and then reverse the array,
        // so I can have LARGE TO SMALL
        Arrays.sort(arr);

        int [] descArr = new int [arr.length];
        int lastIndex = arr.length-1;

        for (int i=0; i< descArr.length; i++){
            //descArr[0] == arr[lastIndex]
            //descArr[1] == arr[lastIndex-1]
            //descArr[2] == arr[lastIndex-2]
            //descArr[3] == arr[lastIndex-3]
            //descArr[4] == arr[lastIndex-4]
            //....
            //descArr[lastIndex]== arr[0]
            descArr[i] = arr[lastIndex];
            lastIndex--;

        }
        System.out.println(Arrays.toString(descArr));
    }
    //create a return method that will sort array //descending order meaning LARGE TO SMALL





}
