package da04_Operators;

public class c4_primitiveCasting {

    public static void main(String[] args) {
        //we have 2 type of primitive casting
        //1.implicit casting (done automaticly from java)
        //2.explicit casting (needs to be handle manually)

        //double > float > long > int > short > byte


        byte number1 = 20; //-128---127
        long number2 = number1; // data types are diffrent teqnicly this is IMPLICINT CASTING (java do it automatic)

        int i1 = 10;
        //byte b1 = i1; // this is an issue
        byte b1 = (byte)i1; // thi needs to be done manually so you can open a parantasis (type it in here ) i2 outside

        double d1 = 2.5;
        float f1 =(float) d1; // pay attention here so what ever covers as in bigger then the other you need to put the ()

        int i2 = 500;
        long l2 = i2;

        double d12 = 2.5;
        byte f2 =(byte) d12;
        System.out.println(d12);
        System.out.println(f2);





    }
}
