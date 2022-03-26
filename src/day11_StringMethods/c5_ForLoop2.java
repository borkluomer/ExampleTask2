package day11_StringMethods;

public class c5_ForLoop2 {
    public static void main(String[] args) {
        //starting point is 8
        // ending point is -1
        // iteration -1
        for (int i = 8; i > -2; i--) { // i = 8 7 6 5 4 3 2 1 0 -1 -2

            System.out.println("AYSE");

        }

        //startin point is 0
        //ending point is 4
        //iteration is -1
        //loop will be running until your condition gets false
        //if the condition always true your loop will be infitinive loop it wont stop
        //for (int i = 0 ; i < 5 ; i--){ // i = 0 , -1 , -2 , -3 ....... no end point
        //  System.out.println("abe"); // 0 , -1 , 2 no end point it will keep typing abe bc of infiniti on negative

        System.out.println("***********************************");

        //starting point is 10
        //ending point is -1
        //itiration +1
        for (int l = 10; l < 0; l++) { // l=10 , 11,12
            System.out.println("BARIS");

        }
        // it will start at 10
        // ending point is 1
        // ititation +1
        // it will be infitiniti loop
        //for (int k=10 ; k>0 ; k++){
        //  System.out.println("Muhammed");

        //}

        for (int k = 10; k > 0; k--) { // 10,9,8,7,6,5,4,3,2,1,0 not gonee run for zero
            System.out.println("OMER"); // 10 9 8 7 6 5 4 3 2 1 so 10 times zero isnt included

        }

        //create an condition that will print square numbers from 0 10
        //square of number means number * number
        //output
        // number0  0
        // number1  1
        // number2  4
        // number3  9
        //...
        // number10 100


        for (int number=0 ; number <=20 ; number++){//0 ,1,2 3,4 5 ... 10 11

            //number * number == to get square of the number
            System.out.print("Number is " + number);

            System.out.println(" Square of number is " + (number * number));//0 ,1,2 3,4 5 ... 10
        }



    }
}

