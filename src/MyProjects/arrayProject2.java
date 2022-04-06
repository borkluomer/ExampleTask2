package MyProjects;

public class arrayProject2 {
    public static void main(String[] args) {

        //Create a java program that will print sum of the ODD numbers from given array.
        // int[] arr={2,3,5,6,56,0,53};

        int [] arr = {2,3,5,6,56,0,53};
        int add = 0;

        for (int i =0 ; i<arr.length; i++){

            if ( arr[i] % 2 !=0){

                add += arr[i];
            }
        }
        System.out.println(add + " added all the numbers together ");



    }
}
