package day18_ForEachLoop;

public class c3_ForEachLoop {
    public static void main(String[] args) {

        //loop types
        //for loop
        //while loop
        //do while
        //for each loop

        int [] numbers = {1,2,3,4,5,6};

        for (int eachNumber : numbers){
            System.out.println(eachNumber);
        }

        System.out.println("------------------------------------");

        //for each loop will store each variable from the numbers list
        //in each ittiration from first one to last one

        String [] initials = {"OCB", "BK" , "HB", "CEB" , "MTB"};
        // print all initials using for each

        for ( String x : initials){
            System.out.println(x);
        }

        System.out.println("----------------------------------------");


        String sentence = "Hello world java is here";
        String [] words = sentence.split("");
        // why did we use split here bc that way we can separate the words from each other

        for (String word : words){
            System.out.println(word);
        }








    }
}
