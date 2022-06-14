package javaInterviewQuestion.OverLoad;

public class CanWeOverLoadAMainMethodInJava {
    //JVM -- main (String arg[]) -- public static void
    //JVM JAVA VIRTUAL MACHINE

    public static void main(String[] args) {

        //can we overload a method in java?
        //yes we can same methods but different parameters
        System.out.println("Main Method-1");
        main("Testing");
        main(10);
        main(15,20);

    }

    public static void main(String args) {
        System.out.println("Main Method-2");
    }

    public static void main(int a) {
        System.out.println("Main Method-3");
    }
    public static void main(int a,int b) {
        System.out.println("Main Method-4");
    }

}
