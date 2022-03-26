package day05_ifStatements;

public class c3_minNumber {

    public static void main(String[] args) {
        // 3 different variables
        // x = 400 y=200 z=300
        // x=100 y=200 z= 300
        // x=300 y=100 z= 400


        // if x is the min number that means x<y and x<z
        // if y is the min numner that means y<z and y<z
        // if z is the min number that means z<x and z<y

        // to be able to apply my logic first i will create 3 number
        // 1.i will create 3 numbers
        //2. create 3 boolean conditions to check wchi boolean is true
        //3. create 3 if condition to check boolean

        int x = 200;
        int y = 100;
        int z = 150;

        boolean xMin = x < y && x < z; // 200 <100 && 200<150 which both of them wrong result is FALSE
        boolean yMin = y < x && y < z; //  100<200  && 100<150 which both of them TRUE
        boolean zMin = z < x && z < y; //  150<200 && 150<100 which is FALSE

        if (xMin) {
            System.out.println("Minumum number is :" + x);
        }
        if (yMin) {
            System.out.println("Minumum number is :" + y);
        }
        if (zMin) {
            System.out.println("Minumum number is :" + z);
            {
            }
        }
    }



}
