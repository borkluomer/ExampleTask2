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
        System.out.println("DivisibelBy5 = "+DivisibleBy5);


        System.out.println("******************************************************");

        /*
        Task 2: Write a program that checks if a String is a Palindrome.

         Example: input : Java , output: java is not a palindrome
          Example: input : kayak , output: kayak is a palindrome
           Example: input level , output : level is a palindrome

         tip: A palindrome is a word, number, phrase, or other sequence of characters which reads
        the same backward as forward, such as madam or racecar.
         */

        // we ill use reverse to find how to read from ending point

        String str = "kayak";
                   //01234 length  is 5 and last index is length -1
        String reverse = "";
                 //length = 5-1 =4
        for (int i = str.length()-1 ; i>=0 ; i--){

            reverse+= str.charAt(i);


        }
        //step 2 create a logic :
        if (str.equalsIgnoreCase(reverse)){
            System.out.println(str+ "is a Polindrome ");
        }else{
            System.out.println(str + "is NOT a Polindrome ");
        }




        }





    }

