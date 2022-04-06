package MyProjects;

public class ternaryExample {
    public static void main(String[] args) {

        //ternary : Shortcut of if else
        // : means else
        // ? means if
                 // (condition) ? == if block
                 // :(condition) ? == else if block
                 // :              == else block

        //task1 max number
        //print max number between 2 numbers

        //task 2 - credit score
        //0-300 poor
        // 301-600 good
        //601-800 very good

        //task1 max number
        //print max number between 2 numbers

        int number1=25 , number2=35, max, max2;

        if (number1>number2){
            max=number1;

        }else {
            max=number2;
        }


        //LET'S DO IT WITH TERNARY NOW

        max2 = (number1>number2) ? number1 : number2;

        System.out.println("max number = " +max);
        System.out.println("max2 number = " +max2 );

        //second TASK
        //- credit score
        //0-300 poor
        // 301-600 good
        //601-800 very good

        int score =450;
        String result;

        if (score>0 && score<301){
            result="poor";

        }else if (score>=301 && score<601){
            result="good";
        }else if (score>=601 && score<=800){
            result="VERY GOOD";
        }else{
            result="invalid Score";
        }

        String result2;

        //ternary : Shortcut of if else
        // : means else
        // ? means if

        result2=(score>0 && score<301) ? "poor" : (score>=301 && score <601)? "good":
                (score>=601 && score<800)? "very good" : "invalid score";

        System.out.println("result = " +result);
        System.out.println("result2 = " +result2);












    }
}
