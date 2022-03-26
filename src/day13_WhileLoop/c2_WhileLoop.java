package day13_WhileLoop;

public class c2_WhileLoop {
    public static void main(String[] args) {

        //structure of for loop

        for (int i = 0 ; i <100 ; i++){
            //starting point 0
            //comdition which is the ending point 99 i<100
            //itiration ++

        }

        //while loop : while loop will keep running till as long as while condition is TRUE
        // initilization will be outside of while loop

        int i = 0; // starting point initilazation

        while(i<11){ //condition : as long as condition is TRUE while will run
            //ending point of this condition is 10
            //starting point is 0
            System.out.println("HELLO WORLD " +i); //0 1 2 3 4 5 6 7 8 9 10 but 11 isnt included

            i++;

        }

        //while (100>95){
          //  System.out.println("java");


        // java will keep running there is no equal sign between 100>= thats why it wont stop
        // infitiniti loop

        int number1 = 5;

        while (number1> 0){
            System.out.println("number1 = " +number1);
            number1--;
        }




    }

}
