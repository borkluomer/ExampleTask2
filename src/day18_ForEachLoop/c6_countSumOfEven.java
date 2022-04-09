package day18_ForEachLoop;

public class c6_countSumOfEven {
    public static void main(String[] args) {

        //from 2d array
        //create a java logic that will print odd and even numbers
        //count of even and odd
        //also it will print sum of odd numbers and sum of even numbers

        int [][] number2D = {
                {1,2,3,4},
                {5,6,7,25},
                {8,9,10,11,55}

        };

        //count of even : 5
        // //sum even  == 2,4,6,8,10 ==30
        //count odd : 8
        //sum of odd == 1+3,5+7+25+9+11+55==116



        //create your variables first

        int countOdd= 0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;

        //need to create a nested loop

        for (int [] each1D : number2D){
            for (int eachNumber : each1D){
                if (eachNumber%2==0){ //even
                    countEven++;
                    sumEven=sumEven+eachNumber;
                    System.out.println("eachNumber = " + eachNumber);

                }else{
                    System.out.println(eachNumber+ "is a ODD number");
                    countOdd++;
                    sumOdd=sumOdd+eachNumber;

                }
            }
        }

        System.out.println("countEven : " +countEven);
        System.out.println("countOdd : " +countOdd);
        System.out.println("sumEven : " +sumEven);
        System.out.println("sumOdd : " +sumOdd);






    }
}
