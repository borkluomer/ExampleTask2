package MyProjects;

public class projectArray1 {

    public static void main(String[] args) {

         //Question 1
         //Write Java statements that do the following:
         //a) Declare an array numArray of 15 elements of type int.
         //b) Output the value of the tenth element of the array alpha.
         //c) Set the value of the fifth element of the array alpha to 35.
         //d) Set the value of the ninth element of the array alpha to the
         // sum of the sixth and thirteenth elements of the array alpha.

         int [] NumArray = {10,20,30,40,50,60,70,80,90,100,101,102,103,104,105,};

        System.out.println("NumArray : " + NumArray.length);

        //c) Set the value of the fifth element of the array alpha to 35.
        NumArray[5] = 35;

        //b) Output the value of the tenth element of the array alpha.
        NumArray[9] = NumArray[6] + NumArray[13];

        System.out.println("NumArray[9] = " +NumArray[9]);
        System.out.println("NumArray[5] = " +NumArray[5]);








    }
}
