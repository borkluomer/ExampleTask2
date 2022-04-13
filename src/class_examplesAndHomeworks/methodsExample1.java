package class_examplesAndHomeworks;

public class methodsExample1 {

    public static void oddNumbers(int startingPoint1, int endingPoint1 ){

        int i =startingPoint1;
        while (i<=endingPoint1 ){
            i++;
            if (i%3==0){
                System.out.println("print odd numbers :" +i);
            }
        }


    }

    public static void evenNumber(int startingPoint,int endingPoint){

        for (int i=startingPoint; i<=endingPoint;i++ ){
            if (i%2==0){
                System.out.println("Your number is even :" +i);
            }
        }
    }



    public static void main(String[] args) {

        evenNumber(0,100);
        oddNumbers(0,30);

    }
}
