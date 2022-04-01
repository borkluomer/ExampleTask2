package StudyHallSessions.Week5;

public class Session3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("------------------------");
            System.out.println("TABLE OF : " + i);
            System.out.println("------------------------");

            for (int k = 1; k <= 10; k++) {
                System.out.println(i + " x " + k + " = " + (i * k));

            }
        }
        System.out.println("***********************************************");

        //write a program to creat a Right Triangle Star Pattern Program
        //Please use nested for loop and height is 7.

        for (int j=1 ; j<=7 ; j++){

            for (int k =1 ; k<=j ; k++){
                System.out.print("*");

            }
            System.out.println();


        }



    }
}
