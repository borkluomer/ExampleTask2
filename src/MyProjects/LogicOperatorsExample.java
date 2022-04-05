package MyProjects;

public class LogicOperatorsExample {
    public static void main(String[] args) {

        //Operators  EXPRESSION1  && EXPRESSION2
        // && LOGIC AND (true only if both true)
        //only condition will give you true if both of your expressions are TRUE

        boolean b1 = 2>5 && 2>6; //false and false will give you FALSE
        boolean b2 = 2<5 && 2<6; //true and true it will be TRUE
        boolean b3 = 2>5 && 2<6; //false and true it will be FALSE
        boolean b4 = 2<5 && 2>6; // true and false it will be FALSE

        // ||  EXPRESSION1  || EXPRESSION2
        // Logic OR (true if any one of them is true)

        boolean b5 = 2>5 || 2>6; // false or false YOU CAN PICK WHICH EVER YOU WANT
        boolean b6 = 2<5 || 2<6; // true or true    SAME
        boolean b7 = 2>5 || 2<6; // false or true   SAME
        boolean b8 = 2<5 || 2>6; //  true or false  SAME


        //Logic NOT   !EXPRESSION
        // !  (it will be true if it had a false condition first) so it will flip whatever the first case is

        boolean bool1 = 10>=10; //true condition
        System.out.println(bool1); // it will give you a result of a TRUE
        System.out.println(!bool1); //since it was true first then it will give you a FALSE with the sign'!'
        System.out.println(!!bool1); // it was True then will false Then it will be Opposite again IT'S TRUE!








    }
}
