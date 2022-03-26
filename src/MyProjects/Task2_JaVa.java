package MyProjects;

import java.util.Scanner;

public class Task2_JaVa {
    public static void main(String[] args) {

        String name1 = "HELLO";
        String name2 = "";

        for(int i = (name1.length()-1) ; i>=0 ; i--){
            name2+= name1.charAt(i);
        }
        System.out.println(name2);
    }
}
