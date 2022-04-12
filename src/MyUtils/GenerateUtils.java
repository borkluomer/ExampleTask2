package MyUtils;

public class GenerateUtils {

    //print hello
    public static void hello() {
        System.out.println("Hello,Hello");

    }

    //reverse a string here
    public static void reverseString(String name) {
        String reversedResult = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversedResult = reversedResult + name.charAt(i);
        }
        System.out.println("reversedResult = " + reversedResult);



    }

    public static void biggerNumber(int num1,int num2){
        if (num1>num2){
            System.out.println(num1 + " is bigger thatn " + num2);
        }else if(num1==num2){
            System.out.println(num1 + " is equal " +num2);
        }
        else{
            System.out.println(num1 + " is smaller that " +num2);
        }
    }

}
