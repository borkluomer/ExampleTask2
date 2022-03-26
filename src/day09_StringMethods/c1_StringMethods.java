package day09_StringMethods;

public class c1_StringMethods {
    public static void main(String[] args) {

        //concat()	          Appends a string to the end of another string	    String

        String firstName = "Hello";
        String lastName = "World";

        // + was used to concat strings
        System.out.println(firstName + " " +lastName );

        //pretty much all this will give you the same results
        System.out.println(firstName.concat(" "+ lastName));
        System.out.println(firstName.concat(" ").concat(lastName));

        System.out.println("**************************************");

        int score = 90;
        String fullName = firstName.concat(" ").concat(lastName);

        //number + text = TEXT as a number

        System.out.println(fullName.concat(" score is :").concat(" " + score));

        //contains()---Checks whether a string contains a sequence of characters-----boolean

        //contains will check if the string contains given value
        // if string contains it will return TRUE
        //if the string doesnt contains it will give you FALSE

        System.out.println("****************************************");
        String sentence = "Java is fun@@233!";
        System.out.println(sentence.concat("a")); // this is a true condition
        System.out.println(sentence.contains("A")); // FALSE
        System.out.println(sentence.contains("Ja")); // TRUE
        System.out.println(sentence.contains("Ja ")); // FALSE BC OF THE SPACE BECAREFUL
        System.out.println(sentence.contains("va")); // TRUE BC WE HAVE va in Java
        System.out.println(sentence.contains("@2@ ")); //FALSE

        boolean b1 = sentence.contains(" ");

        System.out.println("************************************************");

        //contains()----Checks whether a string contains a sequence of characters---- boolean

        // if your string ends with the given condition it will be true
        //if it is not ending it will be false

        String sentence2 = "Hello world java is here 47"; //bc of the space in the end PAY ATTN
        System.out.println(sentence2.endsWith("here")); // this one doesnt have a space in text
        System.out.println(sentence2.endsWith("7")); // FALSE
        System.out.println(sentence.endsWith(" 47")); // TRUE bc 47 had space just like it
        System.out.println(sentence2.endsWith("here47")); //FALSE bc of the SPACE
        System.out.println(sentence2.endsWith("Hello world java is here 47")); //TRUE IDENTICAL




    }




}

