package da04_Operators;

public class c1_unaryOperators {
    public static void main(String[] args) {
        //+
        //-
        //++
        //--

        int number1=20;
        int numbers2=15;

        //number3=20
        int number3= +number1;
        //number4=-20
        int number4= -number1;
        System.out.println("number3:" + number3);
        System.out.println("number4:" +number4);

        int x= 10;
        int y= -x; // meaning t is =-10 whatever - or + sign there changes it
        System.out.println(y);

        boolean b1= y>0; //-10 >0 false
        boolean b2= x>=0; // 10>= is true tecqniclySystem.out.println(b1);
        System.out.println(b2);

        // if you have a + sign variable it wont effect the number
        // but if you have a - sign it will make your number opposite

        int i1= -15;
        int i2= +i1; //i2 = +(-15) that plus sign wont effect your number
        int i3= i1+ - i1; // i3= (-15) + - (-15)
                          // i3= -15 + +15 == 0
        int i4= -i1; //- (-15)=15
        int i5= -i3; // -(0) == 0

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);




    }
}
