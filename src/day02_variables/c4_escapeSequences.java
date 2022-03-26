package day02_variables;

public class c4_escapeSequences {

    //    escape sequences:
//   \t: paragraph space
//  \n: new line
//  \": prints double quote " on the console
//  \\: prints \ on the console
//  \': prints single quote
//   ' : prints single quote

    public static void main(String[] args){

        System.out.println("Renastech");

        //   \t: paragraph space
        System.out.println("\tRenastech");
        System.out.println("      Renastech");
        System.out.println("\t\t\t\t\tRenastech");

        //  \n: new line
        System.out.println("Hello World");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \n\tWorld \tJava");

        //  \\: prints \ on the console
        System.out.println("\\\\");
        System.out.println("//");

        //  \": prints double quote " on the console
        System.out.println("Today is \"Tuesday\" . ");


        //  \': prints single quote
        //   ' : prints single quote
        System.out.println("Today is \'Friday\' .");
        System.out.println("Today is 'Friday' .");


    }
}