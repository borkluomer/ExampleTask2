package MyProjects;

import java.util.Scanner;

public class patika12 {

    public static void main(String[] args) {


        /* What is the syntax to if else condition

        if(conditions){

        }

        else if(other conditions) {

        }

        else
        {
          you dont need conditions final result
        }
         */

        int galataray, fenerbahce, besiktas, basaksehir, trabzonspor;

        //scanner siniflari toparla
        Scanner scn = new Scanner(System.in);

        System.out.println("Galatasaray sampiyonluk sayisi: ");
        galataray = scn.nextInt();
        System.out.println(galataray);

        System.out.println("Fener sampiyonluk sayisi: ");
        fenerbahce = scn.nextInt();
        System.out.println(fenerbahce);

        System.out.println("besiktas sampiyonluk sayisi:");
        besiktas = scn.nextInt();
        System.out.println(besiktas);

        System.out.println("basaksehir sampiyonluk sayisi: ");
        basaksehir = scn.nextInt();
        System.out.println(basaksehir);

        System.out.println("trabzonspor sampiyon sayisi");
        trabzonspor = scn.nextInt();
        System.out.println(trabzonspor);

        double add = (galataray + fenerbahce + basaksehir + besiktas + trabzonspor);
        double finish = add / 7.0;

        System.out.println("Avarage Championship:" + finish);

        if(galataray>fenerbahce) {
            System.out.println("Galatasaray Daha cok sampiyon olmustur: ");
        }

            else if (fenerbahce>besiktas) {
            System.out.println("Fenerbahce Daha cok samiyon olmustur besiktastan: ");

        }

           else  if (besiktas>trabzonspor){
               System.out.println("Besiktaas daha cok sampiyon olmustur");


            }

           else if(trabzonspor>basaksehir){
               System.out.println("Trabzon daha cok sampiyon olmustur");

        }
           else
        {

            System.out.println("Akbilspor daha cok sampiyon olmustur");
        }




            }

        }





