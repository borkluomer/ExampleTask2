package MyProjects;

public class arrayExampleForFindingOddNumbers {
    public static void main(String[] args) {

        int [] numbers ={1,3,4,5,7,8,10,11,13};


        //let's find the even numbers on the numbers list array

        for (int i =0 ; i<=numbers.length-1; i++){
            if (numbers[i] % 2 == 0){
                System.out.println(numbers[i] + " is a Even number");

            }
        }

        System.out.println("*******************************************");

        //lets find the odd numbers on the numbers list

        for (int i =0 ; i<=numbers.length-1 ; i++){
            if (numbers[i] %2!=0){
                System.out.println(numbers[i] + " is a Odd number");
            }
        }














    }
}
