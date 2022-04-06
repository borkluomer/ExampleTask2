package MyProjects;

public class multiIfElseStatementExample {
    public static void main(String[] args) {

        // if - else if ladder
        //this has multiple conditions
        //JAVA will read top to bottom
        //so it will read the first IF and if its TRUE statement it will execute
        //if not will read the second IF else check and see if the second statement is true and execute if its TRUE
        //if not it will continue till it finds the result till the END

        int number= -25;

        if (number>0){
            System.out.println("NUMBER IS POSITIVE");
        }else if (number==0){
            System.out.println("NUMBER IS ZERO ");
        }else{
            System.out.println("NUMBER IS NEGATIVE");
        }
        //outside of multi if else statements
        System.out.println("OUTSIDE OF MULTI ifelse");

        System.out.println("----------------------------------------------");

        int number1= 25;

        if (number1>0){
            System.out.println("NUMBER IS POSITIVE");
        }else if (number1==0){
            System.out.println("NUMBER IS ZERO ");
        }else{
            System.out.println("NUMBER IS NEGATIVE");
        }
        //outside of multi if else statements
        System.out.println("OUTSIDE OF MULTI ifelse");

        System.out.println("------------------------------------------------");

        int number2= 0;

        if (number2>0){
            System.out.println("NUMBER IS POSITIVE");
        }else if (number2==0){
            System.out.println("NUMBER IS ZERO ");
        }else{
            System.out.println("NUMBER IS NEGATIVE");
        }
        //outside of multi if else statements
        System.out.println("OUTSIDE OF MULTI ifelse");













    }
}
