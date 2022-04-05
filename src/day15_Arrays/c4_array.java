package day15_Arrays;

public class c4_array {
    public static void main(String[] args) {



        //create a condition that will check list of array, and it will print even numbers from the list

        int [] numberList = {1,2,45,67,8,10,500,2,40};

        //loop
        //starting point = 0
        //ending point = length-1

        for (int i =0 ; i < numberList.length ; i++){

            if (numberList[i] % 2 ==0 ){
                System.out.println(numberList[i] + " EVEN NUMBER");
            }

        }

        //create a condition that will print min and max number from giving array

        int [] numberList2 = {1,2,45,67,8,10,500,2,40,695,1 };
        // max number 500
        //min number 1

        //assume min and max
        int max = numberList2[0]; //200
        int min = numberList2[0]; //200

        for (int i =0 ; i<=numberList2.length-1; i++){
            if (numberList2[i] > max){ // numbersList2[0] ==1 >200 ...... 500 >200 YES TRUE and assign now
                max = numberList2[i]; //max ==500 .. your max will be 695

            }
            if (numberList2[i]<min){
                min = numberList2[i]; // min ==45 ...... , 8 compare the rest  ....2 ,1 will effect

            }
        }

        System.out.println("min = "+ min);
        System.out.println("max = " + max);









    }
}
