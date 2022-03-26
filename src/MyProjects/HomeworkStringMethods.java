package MyProjects;

import java.util.Locale;

public class HomeworkStringMethods {
    public static void main(String[] args) {
        String name = "hello my name is hello worlD.";
        String age = "   i am 25 years old.";
        String city = " i am living in new yorK .";
        String job =" i have been in the IT industry for about 6 years.";
        String experience =" i starteD as a manUal tesTer and now doing AutOMation for about 4 years.";
        String certification ="i have experience in different DOmains: education, Energy, " +
                "finance.i have Scrum Master and Oracle Java Programmer certificates.";
        String java =" my main lanGuage is JAVA.";
        String design =" i designed and deveLoped many automation test scripts by using BDD framework";
        System.out.println("----------------------------------------------------------------------------");
        String n = name.substring(0,1).toUpperCase().concat(name.substring(1).replace("hello worlD","Omer Borklu")).trim();
        System.out.println(n);
        String a = age.substring(0,4).toUpperCase().concat(age.substring(4).toLowerCase()).replace("25","33").trim();
        System.out.println(a);
        String c = city.substring(1,3).toUpperCase().concat(city.substring(2).replace("new yorK" , "Sun Shine State Florida").trim());
        System.out.println(c);
        String j = job.substring(0,3).toUpperCase().concat(job.substring(5).toLowerCase()).replace("it" , "IT").trim();
        System.out.println(j);
        String e = experience.substring(1,4).toUpperCase().concat(experience.substring(4).toLowerCase().trim());
        System.out.println(e);
        String ce = certification.substring(0,2).toUpperCase().concat(certification.substring(4).toLowerCase().trim().replace(".i",".I"));
        System.out.println(ce);
        String java1 = java.substring(0,2).toUpperCase().concat(java.substring(2,21).toLowerCase().concat(java.substring(21,22).toUpperCase().concat(java.substring(22).toLowerCase().trim())));
        System.out.println(java1);
        String dd = design.substring(0,2).toUpperCase().concat(design.substring(2)).trim();
        System.out.println(dd);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Length of 1st Line :" + n+ "------LENGTH IS " +name.length() );
        System.out.println("Length of 2nd Line : " + a+ "------LENGTH IS " +age.length() );
        System.out.println("Length of 3st Line : " + c+ "------LENGTH IS " +city.length() );
        System.out.println("Length of 4st Line : " + j+ "------LENGTH IS " +job.length() );
        System.out.println("Length of 5st Line : " + e+ "------LENGTH IS " +experience.length() );
        System.out.println("Length of 6st Line : " + ce+ "------LENGTH IS " +certification.length() );
        System.out.println("Length of 7st Line : " + java1 + "-------LENGTH IS " +java.length());

















    }
}
