package MyProjects;

public class ifStatementsExample {
    public static void main(String[] args) {

        //if(condition){
        // body of the if
        // statement to be executed
        // }
        //if its true (BODY) it will run
        //if its false (BODY) it won't run

        //example for if

        int number =10;
        //check if this number is a positive number
        if (number >0){ // true since 10>0
            //body of the if statement
            //body will get executed if its CONDITION IS TRUE
            System.out.println("Number is Positive ");
        }
        //outside of if statement
        //this will always get executed since JAVA reads top to bottom
        System.out.println("Outside of if statement ");

        int number2 =-10;

        //check if this number is a positive number
        if (number2 >0){ // true since 10>0
            //body of the if statement
            //body will get executed if its CONDITION IS TRUE
            System.out.println("Number is Positive ");
        }
        //outside of if statement
        //this will always get executed since JAVA reads top to bottom
        System.out.println("Outside of if statement ");






    }
}
