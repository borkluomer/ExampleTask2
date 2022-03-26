package class_examplesAndHomeworks;

public class testThree {
    public static void main(String[] args) {
       //1)
        String s1 = "Hello";
        String s2 = "Omer Borklu";

        System.out.println(s1);
        System.out.println(s2);

        //2)
        int num1 = 74;
        int num2 = 36;
        System.out.println(num1+num2);

        //3)
        int num3 = 50;
        int num4 = 3;
        System.out.println(num3/num4);

        //4)
        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+ -3*5/8);
        System.out.println(5+15/3*2-8%3);

        //5
        int i1= 25;
        int i2= 5;
        System.out.println(i1*i2);

        //6
        int i3 = 125;
        int i4 = 24;
        System.out.println(i1+i2);
        System.out.println(i1-i2);
        System.out.println(i1*i2);
        System.out.println(i1/i2);

        System.out.println("*************************");
        //7
        int in1 = 8;

        System.out.println(in1 + "x" +1+ "=" +(8*1));
        System.out.println(in1 + "x" +2+ "=" +(8*2));
        System.out.println(in1 + "x" +3+ "=" +(8*3));
        System.out.println(in1 + "x" +4+ "=" +(8*4));
        System.out.println(in1 + "x" +5+ "=" +(8*5));
        System.out.println(in1 + "x" +6+ "=" +(8*6));
        System.out.println(in1 + "x" +7+ "=" +(8*7));
        System.out.println(in1 + "x" +8+ "=" +(8*8));
        System.out.println(in1 + "x" +9+ "=" +(8*9));
        System.out.println(in1 + "x" +10+ "=" +(8*10));

        System.out.println("*************************");
        //8 JAVA

        System.out.println("J  a   v   v   a " );
        System.out.println("J   a   v   v   a   a");
        System.out.println("J  J aaaaa  VV aaaaa");
        System.out.println("JJ a   a   V   a  a");

        System.out.println("***************************");

        //9 Testing
        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));

        System.out.println("****************************");

        //10 spesific formula

        System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));

        System.out.println("*************************");
        //LAST ONE not 11 but 12 😂

        double a = 33;
        double b = 77;
        double c = 99;
        double avarage = (a+b+c)/3;
        System.out.println(avarage);

        System.out.println("*******************************");
       //mahirs liquar task

        double birthYear = 1988;
        double todaysDate = 2022;

        double buyersAge = todaysDate-birthYear;
        if(buyersAge>=17){
            System.out.println("THE BUYER IS TOO YOUNG TO PURCHSE ALCOHOL");
            if(buyersAge<21){
                System.out.println("YOU ARE OVER 21 OKAY TO BUY ALCOHOL");

            }

            System.out.println("******************************");
        }
           //MAHIRS HEIGH AND WEIGHT EXAMPLE FOR JOHN AND MARK
        double markHeight = 1.69;
        double markWeight = 78;
        double markMBI = markWeight/ (markHeight*markHeight);


        double johnHeight = 1.95;
        double johnWeight = 92;
        double johnMBI = johnWeight/ (johnHeight*johnHeight);

        if(markMBI>johnMBI) {
            System.out.println("MARK has higher MBI");
            System.out.println("markMBI = " + markMBI);
        }else if(johnMBI>markMBI){
            System.out.println("JOHN has higher MBI");
            System.out.println("johnBMI =" +johnMBI);

        }else{
            System.out.println("Surprisingly MARK's and JOHN's probably has the same MBI ");
            System.out.println("MARKS MBI = " +markMBI);
            System.out.println("JOHNS MBI = " +johnMBI);
        }

        // BMI = mass / (height * height) (mass in kg and height in meter)











    }

        }










