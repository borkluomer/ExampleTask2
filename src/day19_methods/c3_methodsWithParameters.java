package day19_methods;

public class c3_methodsWithParameters {


        //declaration of the method
        //public              static         void            main         (String[] args){
        //Access-modifier     specifier      return-type     methodName   (parameter)
        //statements, code
        //}
        public static void main(String[] args) {
        hello();
        hello();
        evenNumbers(0,100); //print till 100;
             System.out.println("***************************");
        evenNumbers(0,20);  //print till till 20 now
        evenNumbers(35,55); // print from 35,55

            System.out.println("------------------------------");
        ageCategory(24);
        ageCategory(55);
        ageCategory(89);
        ageCategory(-5);
        }


        //print hello
    public static void hello(){

            System.out.println("hello");

    }
    //even numbers
    public static void evenNumbers(int startingPoint, int endingPoint){

            for (int i =startingPoint; i<=endingPoint ; i++){

                if (i%2==0){
                    System.out.println("Print all i w/ even numbers = " + i);
                }
            }
    }
    public static void ageCategory(int age){
            String result ="";

            if (age>=0 && age<=5){
                result =age+" is a baby";
            }else if(age>5 && age <=18){
                result=age+" is a young";
            }else if (age>18 && age<=80 ){
                result=age +" is a mature";
            }else if (age > 80){
                result=age +" is a older person";
            }else{
                result= age +" age doesnt exits!";
            }
        System.out.println(result);




    }








    }

