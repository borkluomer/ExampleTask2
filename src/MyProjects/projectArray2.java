package MyProjects;

public class projectArray2 {
    public static void main(String[] args) {

        //Question 2
        //
        //a) Write a statement that declares a string array initialized with the following strings:
        //"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
        //b) Write a loop that displays the contents of each element in the array that you declared.

        //a) Write a statement that declares a string array initialized with the following strings:
        //"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
        String [] dayArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //b) Write a loop that displays the contents of each element in the array that you declared.
        for (int i = 0; i<dayArray.length ; i++){
            System.out.println("dayArray ["  +i+ "]: " +dayArray[i]);
        }







    }
}
