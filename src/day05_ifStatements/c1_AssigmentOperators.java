package day05_ifStatements;

public class c1_AssigmentOperators {
    public static void main(String[] args) {

        int x = 100;
        int y = 200;

        System.out.println(x+ "  ,  " + y );

        x = -y; // x= -200
        System.out.println(x + "  ,  " +y);

        x -= y; // x = s-y --------x = -200-200 = -400
        System.out.println(x+ "  ,  " +y); //-400, 200

        //-= or += means add or remove up to given number

        int z = 10;
        int w = 20;

        z= w -z+10 + --z;
        //z = 20 -10 + 10 + 9 so the result will be =29
        System.out.println(z);
        // z is 29 in result bc of the --z in front means minus 1 from the 10 value of 10 which is z's orginal value

        int a  = 10;

         a-= a+a-a+20; // a = a- (a+a-a+20)
        //a = 10 - (10+10-10+20)
        //a = 10 - (30)
        //a = 10-30
        //result will be a = 20
        System.out.println(a);

        int number  = 20;

        number *=2;//number =number *2
        System.out.println(number);

        number /=3; // number = number /2
        System.out.println(number); //13



    }
}
