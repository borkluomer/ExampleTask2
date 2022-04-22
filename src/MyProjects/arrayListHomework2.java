package MyProjects;

import MyUtils.GenericUtils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayListHomework2 {
    public static void main(String[] args) {

        //1. Write a Java program to create a new array list,
        // add some colors (string) and print out the collection.
        ArrayList<String> colors=new ArrayList<>();
        colors.add("RED");
        colors.add("BLUE");
        colors.add("WHITE");
        colors.addAll(Arrays.asList("BLACK","BEIGE"));
        colors.add(2,"GREEN");

        Collections.sort(colors);
        //3. Write a Java program to insert an element into the array list at the first position.
        //changing the index o basically replacing it
        colors.add(0,"GRAY");
        System.out.println("BEFORE CHANGING THE 0's index color List : " +colors);
        GenericUtils.Stars();
        System.out.println("After changes now My colors = " + colors);


        GenericUtils.Stars();
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.

        //retrieve
        System.out.println(colors.get(2)); //basically pulling the index #2 out of the list by get method //BLACK
        GenericUtils.Stars();

        //5. Write a Java program to update specific array element by given element.
        colors.set(0,"PINK"); //now instead of gray very first our list changes which is index 0 GRAY to PINK
        System.out.println(colors);
        GenericUtils.Stars();

        //6. Write a Java program to remove the third element from an array list.
        //our third element of this was [PINK, BEIGE, BLACK, BLUE, GREEN, RED, WHITE]
                                       // 0      1       2     3     4     5     6    == third one is BLUE
        //will remove the third element which is BLUE so the length and indexes of this list will change
        //output expected [PINK, BEIGE, BLACK, GREEN, RED, WHITE]
        colors.get(3);
        System.out.println(colors);

        GenericUtils.Stars();
        //5. Write a Java program to update specific array element by given element.
        colors.set(0,"PURPLE");
        System.out.println(colors);
        GenericUtils.Stars();
        //6. Write a Java program to remove the third element from an array list.
        //contains will return as true and false boolean
        //lets print one true and one false to see the result
        colors.contains("PURPLE");
        colors.contains("NAVY");
        System.out.println(colors.contains("PURPLE"));
        System.out.println(colors.contains("NAVY"));

        //8. Write a Java program to sort a given array list.
        //basically we put it in order here on alp order
        Collections.sort(colors);
        System.out.println(colors);
        GenericUtils.Stars();
        //9. Write a Java program to copy one array list into another.
        ArrayList<String> cars =new ArrayList<>();
        ArrayList<String> carsCopy=new ArrayList<>();
        cars.addAll(Arrays.asList("FERRARI","LAMBORGHINI","PORSCHE","BUGATTI"));
        carsCopy.addAll(Arrays.asList("MERCEDES","BMW","AUDI"));
        Collections.copy(cars,carsCopy);
        System.out.println(cars+ "" + carsCopy);
        GenericUtils.Stars();

        //10. Write a Java program to shuffle elements in an array list.
        // hint : Collections.shuffle(list_Strings); mixed them up basically however the system likes
        GenericUtils.Stars();
        Collections.shuffle(colors);
        Collections.shuffle(cars);
        Collections.shuffle(carsCopy);
        System.out.println(colors);
        System.out.println(cars);
        System.out.println(carsCopy);
        //11. Write a Java program to reverse elements in an array list.
        GenericUtils.Stars();
        ArrayList<String> cities =new ArrayList<>();
        cities.addAll(Arrays.asList("ADANA","ANTALYA","ISTANBUL","ANKARA","BURSA","TRABZON"));
        System.out.println(cities);
        Collections.reverse(cities);
        System.out.println(cities);
        //13. Write a Java program to compare two array lists.
        GenericUtils.Stars();

        ArrayList<String> states =new ArrayList<>();
        states.addAll(Arrays.asList("FLORIDA","TEXAS","NORTH CAROLINA","CALIFORNIA","LOUISIANA"));
        ArrayList<String> flags =new ArrayList<>();
        flags.addAll(Arrays.asList("TURKISH FLAG","AMERICAN FLAG","ENGLAND FLAG","CANADA FLAG"));
        System.out.println("ALL THIS CODING JUST TO GET A " + states.equals(flags));

        //14. Write a Java program of swap two elements in an array list.
        GenericUtils.Stars();





















    }
}
