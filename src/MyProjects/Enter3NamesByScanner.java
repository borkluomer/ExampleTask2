package MyProjects;

import java.util.Scanner;

public class Enter3NamesByScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A FIRST NAME : ");

        String i1 = input.nextLine();
        System.out.println(i1);

        System.out.println("ENTER A SECOND NAME :");
        String i2 = input.nextLine();

        System.out.println("ENTER A THIRD NAME ");
        String i3 = input.nextLine();

        System.out.println(i1.charAt(0));
        System.out.println(i2.charAt(0));
        System.out.println(i3.charAt(0));





    }
}
