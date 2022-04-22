package class_examplesAndHomeworks;

import MyUtils.GenericUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayListExample {
    public static void main(String[] args) {



        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(500);
        numbers.add(50);
        numbers.add(5000);
        System.out.println(numbers); //before
        GenericUtils.Stars();
        numbers.add(2,4);
        System.out.println(numbers);// after

        ArrayList<String> letters =new ArrayList<>();

        System.out.println(letters);



        GenericUtils.Stars();
        ArrayList<Integer> number =new ArrayList<>();

            number.addAll(Arrays.asList(10,20,40,50,60,70,80,90));


            int maxNumberInNumber=number.get(0);


            for (int j = 0; j <number.size() ; j++) {

                if (number.get(j) > maxNumberInNumber){

                    maxNumberInNumber=number.get(j);
                }
            }
            System.out.println("YOUR MAX NUMBER IS : " + maxNumberInNumber);
            GenericUtils.Stars();
        int minNumberInNumbers=number.get(0);

        for (int k=0 ; k < number.size() ; k++){

                if (number.get(k) < minNumberInNumbers){
                    minNumberInNumbers=number.get(k);

                }
            }
        System.out.println("minNumberInNumbers = " + minNumberInNumbers);


    }










    }

