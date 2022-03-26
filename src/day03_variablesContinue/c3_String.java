package day03_variablesContinue;

public class c3_String {
    //string is none premitive data type

    public static void main(String[] args) {

        //dataType variable name=data;

        String nameOfStudent="Ozgur"; //text
        String schoolName="Renastech"; //text

        //id for ozgur
        //since id is a number it is better to use whole numbers
        int id=12424; // will be number
        String id2 = "124234"; // output will be text
        System.out.println(nameOfStudent);
        System.out.println("name of Student: " + nameOfStudent + ", Student id :" +id);



        //if you want to print in diffrent print line

        System.out.println("Name is :" +nameOfStudent + "\nSchool Name : "+schoolName);

        String number1= "100"; //tirnak icinde oldugu icin burda text olarak cikacak sonuc
        byte number2=100; // burda normal numara yazdigin icin numara cikar

        System.out.println(number1+10); // text + number == (since we have string inside it will concat)
        System.out.println(number2+10); // number +number== ( your result will be number)










    }
}
