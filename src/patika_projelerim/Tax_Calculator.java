package patika_projelerim;

import java.util.Scanner;

public class Tax_Calculator {
    public static void main(String[] args) {

        double tutar, kdvOrani =0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ucret Tutarini Giriniz : ");
        tutar = input.nextDouble();


        kdvTutar = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz TUTAR :" + tutar);
        System.out.println("KDV ORANI : "+ kdvOrani);
        System.out.println("KDV TUTARI : " + kdvTutar);
        System.out.println("KDV'li TUTAR :" + kdvliTutar);









    }
}
