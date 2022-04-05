package MyProjects;

public class arrayExample2 {
    public static void main(String[] args) {

        double[] myList = {1.2,1.3,4.3,5.6}; // gave just any numbers since its decimal i used double here!
        double total = 0; //we gave a total a value here to gather together!!!!
        double max = myList [0];  // lets find out the max number in this list

        for (double number : myList){
            if (max<number){
                max=number;
            }
            total = total+ number;
            System.out.println( "double # :" + number );
        }
        System.out.println("TOTAL of double numbers sum is = " + total );
        System.out.println("MAX NUMBER = " +max);






    }
}
