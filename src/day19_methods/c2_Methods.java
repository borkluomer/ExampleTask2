package day19_methods;

public class c2_Methods {

    public static void main(String[] args) {

        //we call
        printJava10();
        hello();
        evenNumbers100();
        evenNumber123();

    }

        //declaration of the method
        //public              static         void            main         (String[] args){
        //Access-modifier     specifier      return-type     methodName   (parameter)
        //statements, code
        //}

        //Access-Modifier = pub;ic , protected, default ,private
        //specifier: states , final, abstract, synchronized
        //return type: void : , any datatype (int,string,char,int[].....)
        //some methods has parameters some don't have parameter

        //create a method that will print java 10 times
        public static void printJava10() {
            for (int i = 1; i <= 10; i++) {

                System.out.println("Java");

            }
        }


        //print a hello
    public static void hello(){
        System.out.println("Hello Hello");
    }
    //create a method that will print even numbers betweeen 1-100
    //name this method evenNumbers100

    public static void evenNumbers100(){
        for (int i=2; i<101; i=i+2){
            System.out.print(i+ " , ");

        }
        System.out.println();
        System.out.println("-------------------------------");
    }
    //second way of doing it with if condition
    public static void evenNumber123(){
        int i = 1;
        while (i<101){
            if (i%2==0){
                System.out.print(i + " , ");
            }
            i++;
        }

    }








        }











