package MyProjects;

public class projectArray6 {
    public static void main(String[] args) {

        //Question 6
        //Write a Java program to find the largest and smallest element of an array.

        int[] array = {1, 10, 100, 150, 250, 555};
        int max = array[0];
        int min = array[0];

        for (int d = 0; d < array.length; d++) {
            if (array[d] > max) {
                max = array[d];

            }
            if (array[d]<min){
                min = array[d];

            }
        }
        System.out.println("min =" +min);
        System.out.println("max =" +max);
    }


}
