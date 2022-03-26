package StudyHallSessions.Week3.Week4;

public class Session3 {
    public static void main(String[] args) {

        //write a

        String mystring = "JAVA";
                         //0123 , length =4
        int a = 0; // it will be updated

        int countOfA= 0; // it will be updated

        //             0<4
        for (int i=0 ; i<mystring.length(); i++ ){
            if (mystring.charAt(i)=='A'){ // mystring.charAt(1)=> a=='a'

                countOfA++;

            }

        }
        System.out.println("countOfA = " +countOfA);

        System.out.println("------------------------------------------------");

        //create a program that will print numbers that divisiable by 4 and 3 from 0-99 please use while loop

        //step 1 : create a variable
        int startingPoint = 0;
        int endingPoint = 99;

        //step 2 create the loop
        //starting point is 0
        //ending point is 99
        // itiration 1 ++
        while( startingPoint<=endingPoint){
            //step 3 create a if statement
            if (startingPoint % 4== 0 && endingPoint % 3 == 0){ //  0%4==0 true && 0%3==3 true TRUE
                System.out.println(startingPoint); //true
            }
            startingPoint++; //true 0++

        }


    }
}
