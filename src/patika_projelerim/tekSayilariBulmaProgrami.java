package patika_projelerim;

import java.util.Scanner;

public class tekSayilariBulmaProgrami {

    public static void main(String[] args) {

        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("sayi giriniz : ");
            n = scan.nextInt();
            if (n % 2 == 1) {
                total += n;

            }

        }while (n > 0) ;
        System.out.println("toplam: " + total);


        }

    }


