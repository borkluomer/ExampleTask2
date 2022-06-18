package StudyHallSessions.Week4;

public class Session1 {
    public static void main(String[] args) {

        //write a program to calculate the sum of first 20 natural numbers
        //0+1+2+3+4+5+6+7......20 = ?
        //basically asking 0 to 20 add all of them
        //starting point and ending point
        //we will create for loop

        //starting point; ending point;
        //create a new variable bc you gone need to store a data
        int sum = 0;

         for (int i  = 0 ; i<=20 ; i++){

             System.out.println("i equals to >>>>>> " +i);

             sum+=i; // sum =0 ;


             System.out.println("Sum is >>>>>> ");
         }
        System.out.println("---------------------------------------");

         //write a factorial number value of any number entered through the keyboard
        // 5 = ?  1*2*3*4*5
        //6 = ?   1*2*3*4*5*6
        //whatever number you pick it will muiltiply the rest

        //first step
        int myNumber = 4; // 1*2*3*4 ++
        int answer = 1; //0 // starting point

        //s starting point  ; ending point
        for(int i = 1 ; i<=4 ; i++ ){
            answer*=i; // answer will be muiltiply by one  answer=answer*1

            //break down of this below
            //i=1 ;     i=2;       i=3;
            //1*1=1 ;   1*2=2;     2*3=6;


        }

        System.out.println("ANSWER HERE == " +answer);

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        //write a program that can print all the odd numnbers between 0-100 that can be divisbale by 3 and 5

        for (int i =0; i<=100 ; i++){

            //odd number ?  , divisible by 3 and divisible by 5
            if (i % 2 !=0  &&  i%3==0 && i%5==0){
                System.out.println(i);

            }


        }
        





    }
}
