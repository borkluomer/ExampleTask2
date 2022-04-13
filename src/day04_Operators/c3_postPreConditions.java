package day04_Operators;

public class c3_postPreConditions {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(x);
        // lets apply for pre condition here
        System.out.println(++x);  // pre condition here will increase your number by 1 immediatly
        System.out.println(--x); // pre condition here will decrease your number by -1 immediatly
        System.out.println(+x); // its not a plus plus sign its only + wont change anything

        int y = 20;
        System.out.println(y);
        //post a condition : WONT EFFECT THE NUMBER RIGHT AWAY IT WILL EFFECT THE NEXT STEP
        System.out.println(y++);
        System.out.println(y); // now its effecting the next step on your println if you notice by 1 points up

        byte number1 = 30;
        System.out.println(number1); // 30
        System.out.println(--number1); // 29

        int number2 = 50;
        System.out.println(number2--); // post // 50 will be 49 on next line
        System.out.println(number2--); // post 49 but it will be 48 on next line
        System.out.println(--number2); // pre // 48 and since its pre condition it is now 47 on the next line
        System.out.println(number2); // 47
        System.out.println(number2++); // post // 47 but it will be 48 on the nex line
        System.out.println(number2); // 48

    }
}
