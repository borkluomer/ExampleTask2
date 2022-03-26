package class_examplesAndHomeworks;

import java.util.Scanner;

public class taksiMetreHesaplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //// km basina 2.20 tl tutmakta
        //taksi metre 10 tl den aciliyor
        // min odenecek miktar 20 tl

        int km;
        double perKm = 3.20, total, startPrice = 15;



        System.out.println("mesafeyi km tarzindan giriniz : " );
        km = input.nextInt();
        total = (km*perKm);
        total += startPrice;

        total = (total<20 ) ? 20 : total;
        System.out.println("TOPLAM TUTAR :  " +total );








    }
}
