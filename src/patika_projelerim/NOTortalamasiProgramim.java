package patika_projelerim;

import java.util.Scanner;

public class NOTortalamasiProgramim {
    public static void main(String[] args) {

        int math, chemistry , english , history , music;

        //sinifi tanimla
        Scanner input = new Scanner(System.in);

        //kullanicidan degerlerini al
        System.out.println("math Grade : " );
        math = input.nextInt();

        System.out.println("chemistry Grade : " );
        chemistry = input.nextInt();

        System.out.println("English Grade : " );
        english = input.nextInt();

        System.out.println("History Grade : " );
        history = input.nextInt();

        System.out.println("Music Grade : " );
        music = input.nextInt();


        double toplam = (math+chemistry+music+history+english)/5;
        System.out.println(toplam + " DERSLERIN ORTALAMASI");

        if(toplam>=90) {
            System.out.println("AFERIN");
        }else if (toplam>=80 && toplam<=89){
            System.out.println("IYI");

        }else if (toplam>=70 && toplam<=79){
            System.out.println("OKAY");

        }else if(toplam>=50 && toplam<=69){
            System.out.println("GECTIN");

        }else{
            System.out.println("KALDINIZ");
        }





    }
}
