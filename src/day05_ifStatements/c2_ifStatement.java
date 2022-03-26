package day05_ifStatements;

public class c2_ifStatement {

    public static void main(String[] args) {

        boolean b1 = 10>5; // true
        boolean b2 = 10== 12; // false
        System.out.println("hatice");

        if (2>2) {                       // opening bracket for if statement // false condition
            System.out.println("evi");
            System.out.println("halil");

            //if your if condition is false java will not check inside if statement bc 2is not bigger then 2 (2>2)
            // same thing samething wont print halil either bc you have a false statement
            //but if it was (2>1) it would have printed the 2 system you created
        } // closing bracket for if statment


        System.out.println("Sanjay");

        if (1==1){
            //java will execute body for if statement
            System.out.println("oscar");
            System.out.println("oscar");


        }

        if(b2){ // false
            //java wont read inside
            //java wont execute they body of if statement
            System.out.println("esra");


        }

        if (true){
            System.out.println("taylan");
        }
    } // closing for main method
} // closing for class
