package class_examplesAndHomeworks;

import MyUtils.GenericUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4Homeworks {
    public static void main(String[] args) {



         //        (ArrayList) Remove Some Value
        //     Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 95; i <105 ; i++) {
            list.addAll(Arrays.asList(i));
            if (i > 100) {
                list.remove(Arrays.asList(i));

            }

        }
        System.out.println(list);
        GenericUtils.Stars();

        //    (String) Sum of Digits in a string
        //    Write a method that can return the sum of the digits in a
        //    string
        //    str="a4v6aaa9!44";
        //    Excepted output= 27

        String str = "a4v6aaa9!44";
        int result =0;

        for (int j = 0; j < str.length() ; j++) {
            if (str.charAt(j)>47 && str.charAt(j)<58 ){
                result=result +Integer.parseInt(String.valueOf(str.charAt(j)));
            }

        }
        System.out.println(result);

         //        (ArrayList) Remove "Amed"
         //        Given a list of people' names: "Amed", "hello", "mike","renas","Amed",""...)
         //        Write a java operation to remove all the names named Ahmed


        GenericUtils.Stars();
        ArrayList<String> name = new ArrayList<>();

        name.addAll(Arrays.asList("Amed", "OMER", "BARIS","TAYLAN","Amed"));
        System.out.println(name);

        GenericUtils.Stars();
        name.retainAll(Arrays.asList("OMER","BARIS","TAYLAN"));
        System.out.println(name);









    }
}
