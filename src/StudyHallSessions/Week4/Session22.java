package StudyHallSessions.Week4;

public class Session22 {
    public static void main(String[] args) {

        //write a program that will print your name 5 times using the loop


        for (int i = 0 ; i<5 ; i++){
            System.out.println("Renastech");
        }



        //write a program print numbers 15 to 5 as
        //please use the loop
        //expected out put :  15 14 13 12 11 10  9 8 7 6 5

        for (int i=15; i>=5; i--){
            System.out.print( " " +i);
        }

        System.out.println();
        System.out.println("--------------------------------");

        //write a program that will print count of the odd numbers from 0 to 20
        //please use for loop and if statement

        int count =0; // this will be for updating a value

        for (int k = 0 ; k<20 ; k++){
            if( k%2 !=0){
                count++;
            }

        }

        System.out.println("count = " +count);
    }



    }

