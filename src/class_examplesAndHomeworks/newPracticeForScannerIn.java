package class_examplesAndHomeworks;

import java.util.Scanner;

public class newPracticeForScannerIn {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int baris, omer, taylan, ahmet, murat;

        System.out.println("Baris'in Yasi : ");
        baris = scn.nextInt();
        System.out.println(baris);

        System.out.println("Omer'in Yasi : ");
        omer = scn.nextInt();
        System.out.println(omer);

        System.out.println("Taylan'in Yasi : ");
        taylan = scn.nextInt();
        System.out.println(taylan);

        System.out.println("Ahmet'in Yasi : ");
        ahmet = scn.nextInt();
        System.out.println(ahmet);

        System.out.println("Murat'in Yasi : ");
        murat = scn.nextInt();
        System.out.println(murat);

        double toplam = (baris + omer + taylan + murat + ahmet);
        double result = toplam * 3;

        System.out.println("Toplam Yas Ortalamasi : " + result);

        if (baris > omer) {
            System.out.println("Baris bir kere Omer'in kardesidir hayirdir ya: ");
        } else if (murat < ahmet) {
            System.out.println("valla hic bir fikrim yok ama murat kesin ahmet'den kucuktur : ");

        } else if (taylan > baris) {
            System.out.println("Ozaman Baris'ta Taylandan kesin kucuktur");


        }

    }
}




