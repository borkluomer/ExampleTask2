package javaInterviewQuestion;

public class HowToFindPrimeNumber {

        //prime number is a special number
        //it's a number can only device by itself and 1
        //2 is the lowest prime number

    public static boolean isPrimeNumber(int num){

        //edge/corner cases:
        if (num<=1){
            return false;
        }
        for (int i = 2; i <num ; i++) {
            if (num% i == 0){
                return false;
            }
        }
        return true;

    }

    public static void getPrimeNumbers(int num){

        for (int i =2 ; i <=num; i ++){

            if (isPrimeNumber(i)){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("2 is a prime number = " +isPrimeNumber(2));
        System.out.println("10 is a prime number = " +isPrimeNumber(10));
        System.out.println("15 is a prime number = " +isPrimeNumber(15));
        System.out.println("17 is a prime number = " +isPrimeNumber(17));

        System.out.println("55 is a prime number = " +isPrimeNumber(55));
        System.out.println("-5 is a prime number = " +isPrimeNumber(-5));
        System.out.println("-33 is a prime number = " +isPrimeNumber(-33));
        System.out.println("20 is a prime number = "  +isPrimeNumber(20));


        getPrimeNumbers(7);
        getPrimeNumbers(13);
        getPrimeNumbers(20);


    }

}
