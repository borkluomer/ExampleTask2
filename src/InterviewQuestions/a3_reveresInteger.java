package InterviewQuestions;

public class a3_reveresInteger {

    public static void main(String[] args) {


        //1st solution using al go
        int number = 12345;
        int rev = 0;

        while (number !=0){
            rev= rev * 10 + number %10;
            number=number/10;

        }
        System.out.println("Reverse number is :" +rev);

        //2nd solution
        long num1 =12345;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
