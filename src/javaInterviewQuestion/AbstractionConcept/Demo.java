package javaInterviewQuestion.AbstractionConcept;

public class Demo {
    public static void main(String[] args) {

        String x = "Chad";
        String reverse = "";

        int lenght = x.length();

        for (int i = lenght-1; i >=0 ; i--) {
            reverse= reverse+x.charAt(i);

        }
        System.out.println(reverse);


    }
}
