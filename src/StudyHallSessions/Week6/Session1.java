package StudyHallSessions.Week6;

import java.util.Arrays;

public class Session1 {
    public static void main(String[] args) {

        //create a java program that will print only numbers that divisible by 3
        //int [] arr = {23,25,26,32,42,51,99,2};

        int [] arr = {23,25,26,32,42,51,99,2};
        // length     0  1   2  3  4  5  6  7 lastIndex ==length -1;

        for (int i =0 ; i<arr.length ;i++){

            if ( arr[i] % 3 == 0 ){
                //now print the number by 3
                System.out.print( arr[i] + " " );
            }

        }
        System.out.println("");
        System.out.println("*****************************************************");

        //create a java program that will print sum of the ODD numbers from given array.
        //int[] arr = {2,3,5,6,56,0,53}

        int[] arr1 = {2,3,5,6,56,0,53};
        //           0  1 2 3 4  5  6  ==> lastIndex ==>length-1

        int startingPoint=0;
        int endingPoint=arr1.length-1;
        int sumOfOddNumbers = 0; //we will store our answer in this variable

        while(startingPoint<endingPoint){ //we will loop list1 Array with while Loop

            //we will decide which number is odd number
            if ( arr1[startingPoint] %2 != 0){
                sumOfOddNumbers=startingPoint+arr1[startingPoint];
                //sumOfOddNumbers +=arr1[startingPoint] same thing

            }
            startingPoint++; // 0 ++ ,1 ++ .......lastPoint=7 it will break here when while loop statement is false



        }
        System.out.println("sumOfOddNumbers = " + sumOfOddNumbers);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Create a java program that will print how many times java is written in the given String array=.
        // String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}


        String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"};
        //                 0     1        2      3      4     5    6     7
        //1st step
        //to store your DATA
        int count = 0;

        //second step    i<names.length same thing
        for (int i = 0; i <= name.length -1 ; i++) {

           // System.out.println(name[i]); //it will only print all names !!!!!

            if (name[i].equalsIgnoreCase("java")){
                //next step will be
                count++;

            }

        }
        System.out.println("Java is repeated " + count + " times");

        //create a java program that will print numbers from biggest number to smallest number.
        // int [] arr={2,90,4,-99, 99,73};

        int [] numbers = {2,90,4,-99, 99,73};

        int [] newArray = new int [numbers.length]; // we will use this int array to store our answer

        System.out.println("numbers.length = " + numbers.length);
        System.out.println("newArray.length = " + numbers.length);

        Arrays.sort(numbers); //[-99, 2, 4, 73, 90, 99]

        System.out.println(Arrays.toString(numbers));

        int temp= 0; //we will temp for index number in new Array int.

        for (int i = numbers.length-1 ; i >=0 ; i--) {

            newArray[temp] = numbers[i];
            temp++;

        }
        System.out.println(newArray); // [I@1540e19d
        //YOU NEED TO PRINT IT OUT LIKE THIS VERY IMPORTANT
        System.out.println("********************************");

        System.out.println(Arrays.toString(newArray)); // this will be printed [-99, 2, 4, 73, 90, 99]






    }
}
