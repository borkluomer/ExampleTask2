package Week5;

public class Session1 {
    public static void main(String[] args) {
        //Reverse an int

        int myNumber = 63;
        //expected answer will be 36;
        //flip of the number basically

        int answerofInt=0; // this is just to store a variable

        //as long as my number is not 0 while loop will run

        //my number at 2nd step = 6
        //my number at 3rd step = 0
        //0 !=0 its false
        //it will finish your loop
        while(myNumber!=0) {

                                     // 6%10=0
            int remainderOf10 = myNumber % 10;

            // variable = 0 *10 = 30+3
            //              3*10=30+6==>36
            answerofInt = answerofInt*10 +remainderOf10;

            //63 / 10 ? 6
            //6 / 6 == ? 0 of course
            myNumber/=10;


        }

        System.out.println(answerofInt);




    }

}
