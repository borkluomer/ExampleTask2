package MyProjects;

public class UnaryOperatorsExample {
    public static void main(String[] args) {

        //Unary Operators
        // + Unary Plus : not necessary to use since numbers are positive without using it
        // - Unary minus: inverts the sign of an expression
        //++ Increment Operator: Increase your value by 1
        //-- Decrease Operator : Decrease your value by 1

        int number1 = +(20); // if you add a + sign in front of 20 isnt gone make a change its already positive #
        int number2 = -(30); // but if you add - sign in front of 30 it will turn to negative -30
        int number3 = +(-50);
        int number4 = -(-60);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        // increment and Decrement -- ++ (precondition)
        //pre condition will increase of decrease by 1 immediately

        int number5 = 100;
        int number6 = 150;
        System.out.println(++number5); //101
        System.out.println(--number6); //149

        // ++ ; -- POST CONDITION

        int x = 20;
        int z =10;

        System.out.println(x++); // it won't affect it the first condition it will on the next line 20
        System.out.println(x); //effected now 21

        System.out.println(z--); //wont effect here 10
        System.out.println(z); // it will affect now 9







    }
}
