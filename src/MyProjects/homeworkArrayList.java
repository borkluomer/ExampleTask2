package MyProjects;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class homeworkArrayList {
    public static void main(String[] args) {

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        ArrayList<String> StringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

       //double
        doubleArrayList.add(5.0);
        doubleArrayList.add(4.9);
        doubleArrayList.add(77.7);
        doubleArrayList.add(9.1);
        doubleArrayList.add(2.2);
        //String
        StringArrayList.add("Omer");
        StringArrayList.add("Baris");
        StringArrayList.add("Firat");
        StringArrayList.add("Ozgur");
        StringArrayList.add("Sevgin");
        //integerArrayList
        integerArrayList.add(34);
        integerArrayList.add(22);
        integerArrayList.add(27);
        integerArrayList.add(33);
        integerArrayList.add(32);
        //remove
        StringArrayList.remove("Sevgin");
        integerArrayList.remove(4);
        doubleArrayList.remove(2.2);
        //size
        System.out.println(doubleArrayList.size());
        System.out.println(StringArrayList.size());
        System.out.println(integerArrayList.size());
        //clear
        doubleArrayList.clear();
        StringArrayList.clear();
        integerArrayList.clear();
        //addAll
        doubleArrayList.addAll(Arrays.asList(1.0,5.5,6.6,7.7,8.8,9.9));
        integerArrayList.addAll(Arrays.asList(33,44,55,66,77,88,99));
        StringArrayList.addAll(Arrays.asList("Omer","Baris","Firat","Taylan","Ozgur"));
        //contain
        doubleArrayList.contains(Arrays.asList(1.0,5.5,6.6,7.7,8.8,9.9)); //true
        integerArrayList.contains(Arrays.asList(45,46,47,48,49,50)); //false
        StringArrayList.contains(Arrays.asList("Omer","Baris","Firat","Taylan","Ozgur"));
        //retain
        doubleArrayList.retainAll(Arrays.asList(1.0,5.5,6.6,9.9));
        integerArrayList.retainAll(Arrays.asList(45,46,47,48));
        StringArrayList.retainAll(Arrays.asList("Omer","Baris","Firat"));
        //print
        System.out.println(doubleArrayList);
        System.out.println(integerArrayList);
        System.out.println(StringArrayList);


    }
}
