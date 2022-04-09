package day18_ForEachLoop;

import java.util.Arrays;

public class c2_arrayDeepToString {
    public static void main(String[] args) {

        int [] number= {1,2,3};
        System.out.println(Arrays.toString(number));

        //2nd
        int [] [] number2D= { {1,2} , {2,3,4} , {4}};

        System.out.println(number2D); //this isnt gone work bc output is [[I@1540e19d

        System.out.println(Arrays.toString(number2D)); // output [[I@677327b6, [I@14ae5a5, [I@7f31245a]

        System.out.println(Arrays.toString(number2D[0])); // output will be  [1,2]
        System.out.println(Arrays.deepToString(number2D)); // deeptoString for 2nd dimension to print



    }
}
