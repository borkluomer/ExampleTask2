package day16_Arrays;

import java.util.Arrays;

public class c2_Arrays {
    public static void main(String[] args) {

        //ARRAY METHODS

        //sort

        int [] numbers = {90,-2,45,87,-299,4,6};

        System.out.println(Arrays.toString(numbers)); // [90, -2, 45, 87, -299, 4, 6]

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //smallest numbers to biggest numbers

        //create a method that will print max numbers from int array

        //first solution

        int max = numbers[0]; //assume numbers index 0 is the max numbers
        for (int i=0 ; i < numbers.length ; i++){
            if (numbers[i] > max){
                max=numbers[0];

            }
        }
        System.out.println("max :" +max);

        //solution number 2
        int [] ages = {24,89,100,5,25};

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        int length = ages.length;

        int maxNumber = ages[ages.length-1];
        System.out.println("maxNumber = " + maxNumber);

        int minNumber = ages[0];
        System.out.println("*****************************************************");

        String [] names = {"Omer", "Baris", "Taylan", "Ali"};
        //it will print all the names as a String

        System.out.println(Arrays.toString(names)); // [Omer, Baris, Taylan, Ali]

        Arrays.sort(names); // it will sort names as a alphabetic numbers

        System.out.println(Arrays.toString(names)); // [Ali, Baris, Omer, Taylan]







    }
}
