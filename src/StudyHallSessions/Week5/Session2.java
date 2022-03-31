package StudyHallSessions.Week5;

public class Session2 {
    public static void main(String[] args) {

        //step 1
        String DivisibelBy15 = "";
        String DivisibelBy3 = "";
        String DivisibleBy5 = "";

        // step 2
        //1-100
        int number = 1;

        while(number < 100){
            //step 3 if statement
            //if the number can be divisible by3,5 and 15
            if (number % 3==0 && number % 5==0 && number % 15==0){

                //should be displayed in divisible by 15 section
                DivisibelBy15 +=number  + " ";
            }
            /////// if the number can be divisible by 5 but cannot be disible by 15
            if (number%5==0 && number%15!=0){

                //then it should be only displayed in the divisible by 5
                DivisibleBy5 += number+ " ";


        }////last step will be incrementing number++;
            number++;

        }
        System.out.println("DivisibelBy15 = " + DivisibelBy15);
        System.out.println("DivisibelBy3 = " + DivisibelBy3);
        System.out.println("DivisibelBy5 = "+DivisibelBy5);


        }





    }

