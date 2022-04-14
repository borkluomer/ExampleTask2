package class_examplesAndHomeworks;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        /// write a method that will take 3 parameters
        //  // 2 numbers and one operator
        //  // it will do the calculation
        //  //ex : 200 100 +
        //  //result 300
        //  //ex 15 3 *
        //  //result 45
        System.out.println(count("java"));
        System.out.println(count("javascript"));

    }
    public static void calculation (int num1,int num2,char operator){
        int result=0 ;
        switch(operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case'*':
                result=num1*num2;
                break;
            case'/':
                result=num1/num2;
                break;
            case'%':
                result=num1%num2;
                break;
            default:
                System.out.println("invalid : ");

        }

    }
    /*
      write a program that can return the count of "java" and "javascript" anywhere in the sentence
      String sentence = "I like java and javascript,java is best, java and javascript,java ";
   */
    public static int count(String word){

        String sentence = "I like java and javascript,java is best, java and javascript,java ";
        String sentence2=sentence.replace("java","javascript");
        String [] sentence3=sentence.split(" ");
        System.out.println(Arrays.toString(sentence3));

        int count=0;

        for (String each:sentence3){

            if (each.equals(word)){
                count++;
            }
        }

        return count;
    }


}