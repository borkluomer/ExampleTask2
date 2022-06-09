package javaInterviewQuestion;

public class methods {

    int a =4;
    //methods
    //10 lines of code
    //pg 2 (10 lines of code)
    //avoid writing methods over and over

    public String getData(){
        System.out.println("I am inside the method");
        return "hello";
    }
    //objects are the instances/ references of a class

    public static void main(String[] args) {

        methods fn = new methods();
        secondClass sn = new secondClass();
        sn.setData();
        fn.getData();
        System.out.println(fn.a);

        //WHAT IS THE CONSTRUCTOR IN JAVA ? DIFFERENCE BETWEEN CONSTRUCTOR AND METHOD?
        //Constructor
        //it is a special method which instantiates /creates an object.
        //it needs to match with the class name
        //There is always a constructor in a class event if you don't define one. you will have the
        //default constructor in the case.
        //Abstract classes will not have constructor since you can't instantiate abstract classes.
        //we can have private constructor to prevent object creation.
        //we have a default and parameterized constructor.

        //System.out.println(a);
        System.out.println("hi");
        System.out.println("Hello World");
    }

}
