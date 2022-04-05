package day15_Arrays;

public class c3_array {
    public static void main(String[] args) {

        int [] arr = {5,-15,35};
                //    0  1  2
        System.out.println(arr.length); //3

        int [] arr2 = new int [20];
        System.out.println(arr2.length); // 20
        System.out.println(  arr2[5] ); //default value will be 0

        //store numbers from 3 to 22
                //arr2[0]=3
                //arr2[1]=4
                //arr2[3]=5
        // ..
               //arr2[19]=22

        System.out.println("**************************");
        // arr2[0]=3;
        // arr2[1]=4;
        // arr2[2]=5;

        for (int i=0 ; i<=arr2.length-1 ; i++){
            arr2 [i] = i+3;
            // arr2[0]= 0 +3 = 3
            // arr2[0]= 1 +3 = 4
            // arr2[0]= 2 +3 = 5
            // arr2[0]= 3 +3 = 6
            // arr2[0]= 4 +3 = 7
            //..
            //arr2[19]= 19+3 = 22
            System.out.println(arr2[i]);



        }

        System.out.println("***********************");

        int [] numbers = {5,8,10};

        numbers [1] = 20;

        System.out.println(numbers[1]); //numbers index 1 will be reassigned to 20
                    // new number will be 20 instead of 8 because we replaced it REASSIGN the value
        //new array basically will be {5,20,8}

        numbers [0]= numbers [2];
        System.out.println(numbers[0]);//10
        System.out.println(numbers[2]); //10
        //{10,20,10} its re assigned // 10 //10











    }
}
