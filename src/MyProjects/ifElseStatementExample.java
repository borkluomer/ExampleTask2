package MyProjects;

public class ifElseStatementExample {
    public static void main(String[] args) {

        //create a java program to check if given number is even or odd number
        //even numbers are: numbers that can be divided by 2 ex : 2,4,6,8,10

        int number =20;

        if ( number % 2 == 0 ) { //TRUE CONDITION bc its a 20/2=0 so the result is 0 its TRUE
            //body of if
            //will ger executed if condition is true
            System.out.println("Number is a EVEN NUMBER: ");
        }else{ //odd condition will be here
            //body of else
            //else will get executed if your if condition is false
            System.out.println("NUMBER is a ODD NUMBER :");

        }
        //outside of if else statement
        System.out.println("OUTSIDE OF IF-ELSE CONDITION ");


        System.out.println("****************************************************************");


        //odd numbers are: numbers that are not divisible by 2 ex: 1,3,5,7

        int number1 =21;
        if ( number1 % 2 == 0 ) { //TRUE CONDITION bc its a 20/2=0 so the result is 0 its TRUE
            //body of if
            //will ger executed if condition is true
            System.out.println("Number is a EVEN NUMBER: ");
        }else{ //odd condition will be here
            //body of else
            //else will get executed if your if condition is false
            System.out.println("NUMBER is a ODD NUMBER :");

        }
        //outside of if else statement
        System.out.println("OUTSIDE OF IF-ELSE CONDITION ");


        //if (condition){ if condition is TRUE it will read only if
        // //body of the if
        // statement to be executed
        // }
        //else{ if else condition is TRUE will read this one since if is FALSE first
        // body of the else
        // statement to be executed
        // }
        //statements outside the if-else




    }
}
