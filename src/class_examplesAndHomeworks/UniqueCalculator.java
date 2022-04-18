package class_examplesAndHomeworks;

public class UniqueCalculator {

    public static void main(String[] args) {


    }

    /*
        Write a program that can print out the unique values from a String Array
        Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output: A
             C
 */
    public static void uniqueCalculator(String [] pick){
        String [] arr1= {"A","A","B","C","C"};

        for (int i = 0; i < pick.length ; i++) {
            int count=0;
            for (int j=0; j< pick.length; i++){
                if (pick[i]==pick[j]){
                    count++;

                }
            }

            if (count==1){
                System.out.println("that's your unique letter: " + pick);
            }
        }


    }
}
