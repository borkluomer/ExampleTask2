package MyProjects;

import java.util.Scanner;

public class creatingAmultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER HERE : ");

        int number = input.nextInt();
        String times = "";

        for (int i = 0 ; i<=10 ; i++){
            times=(number+ "x" + i + "=" + (number*i));
            System.out.println(times);
        }
    }
}
