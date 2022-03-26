package patika_projelerim;

import java.sql.SQLOutput;
import java.util.Scanner;

public class kullaniciSifresiGirisi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userName, passcode,country;

        System.out.println("LOG IN USER INFO : ");
        userName = inp.nextLine();

        System.out.println("LONG IN PASSCODE :");
        passcode = inp.nextLine();

        System.out.println("WHAT COUNTRY YOURE LOGGING IN FROM : ");
        country = inp.nextLine();

        if (userName.equals("OMERBORKLU") && passcode.equals("PATIKA1234") && country.equals("UKRAINE")) {
            System.out.println("CONGRATULATION ENTER SYSTEM");


        } else {
            System.out.println("SYSTEM ERROR FALSE LOG IN :");


        }
    }
}
