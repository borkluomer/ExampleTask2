package day19_methods;

import MyUtils.GenerateUtils;

public class c5_reverseString {

    public static void main(String[] args) {

        //Arrays.sort();
        c2_Methods.hello();
        c3_methodsWithParameters.ageCategory(3);

        GenerateUtils.hello();
        reverseString("riham");
        reverseString("JAVA");


    }

    // we will create our own library that will reverse any string
    // this method accept a string so we can reverse it
    //as a result i should see revered string

    public static void reverseString(String name){
        String reversedResult= "";

        for (int i=name.length()-1; i>=0; i--){
            reversedResult=reversedResult+ name.charAt(i);
        }
        System.out.println("reversedResult = " + reversedResult);
    }
}
