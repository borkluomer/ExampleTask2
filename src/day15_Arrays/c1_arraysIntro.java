package day15_Arrays;

public class c1_arraysIntro {
    public static void main(String[] args) {

        //int , double , float , string
        // each variable has their own value


        int number1 = 10;
        int number2 = 20;
        int number3= 30;

        int number4= 45 ,number5= 25;
        // if you want to store multiple values in one container list...

        //arrays: container for multiple variables
        //arrays will store multiple
        //array has some ready methods that you can modify your variables...

        //declaration of array
        //DataType [] nameOfYourContainer = { data1,data2,data3...} data==variable
        //each container will have their label
        //you CANNOT HAVE MIX CONTAINERS
        //Container for numbers far as like int, double,float,long,byte
        //container of such as container double, container int, container long...
        //Container for Strings will be in one Container
        //DataType [] nameOfYourContainer = { data1,data2,data3...} data==variable
        int [] numbers = {10,20,30,40,50,190,3,5,0}; //so this is an example of a int container
        //you cannot store any other data types
        //array has index numbers
                  //0,1,2,3,4,5,6,7......9==length-1

        //print third number of 30 (index 2)

        //hello
        //each letter is index in String
        //container
        //each data will have the index
        System.out.println( numbers[2] );

        //print the first number
        System.out.println(numbers[0]);

        System.out.println(number4+10);

        //second number
        int secondNumber=numbers[1];
        System.out.println("second number :" +secondNumber);

        System.out.println("numbers[15]" +numbers[15]); // array index out of bounds exception will appear
        //total we gad 10 numbers which last index is 9 for the last one
        //we don't have indexed 15



    }
}
