package day18_ForEachLoop;

public class c4_countEvenOddNumbers {

    public static void main(String[] args) {

        //create a java program that will print count off odd numbers and even numbers from the list

        int [] numberList= {33,4,5,6,7,0,19,24,66,78,100,33,35,38,39};

        //even count :8
        //odd count : 7

        //in this example we check all numbers
        //no need for starting point for each loop
        //no need for ending point for each loop

        int evenCount =0;
        int oddCount =0;

        for (int a : numberList){
            if (a%2==0){ //even count
                evenCount++;

            }else{ //for odd count
                oddCount++;
            }

        }
        System.out.println("evenCount : " + evenCount);
        System.out.println("oddCounts : " + oddCount);

        //let's do it with for loop

        for ( int i= 0; i <numberList.length ; i++) {
            if ( numberList[i] % 2 == 0){
                evenCount++;

            }else{
                oddCount++;
            }

        }
        System.out.println("evenCount = " + evenCount);
        System.out.println("oddCount = " + oddCount);


    }
}
