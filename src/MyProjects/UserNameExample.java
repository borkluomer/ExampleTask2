package MyProjects;

import java.util.Scanner;

public class UserNameExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("FIRST NAME :");
        String name1 = input.nextLine();
        System.out.println("MIDDLLE NAME :");
        String name2 = input.nextLine();
        System.out.println("LAST NAME :");
        String name3 = input.nextLine();
        System.out.println("USERS INITIALS : " +name1.charAt(0) + name2.charAt(0) + name3.charAt(0));

        if (name2.equals("N/A") || name2.equals("n/a")){
            System.out.println(name2.charAt(0) + " " + name2.charAt(0));
        }else{
            System.out.println(name1.charAt(0) + " " + name2.charAt(0)+ " " + name3.charAt(0));
        }



    }
}
