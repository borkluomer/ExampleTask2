package InterviewQuestions;

public class a2_reverseString {
    public static void main(String[] args) {

        //1. using for loop method to reverse of String
        //diff bw String and StringBuffer
        //do we have reverse function in String?

        String s = "Selenium";

        int length= s.length(); //8
        String reverse = "";

        for (int i =length-1; i >=0 ; i--) {
            reverse= reverse + s.charAt(i);

        }
        System.out.println(reverse);

        //2. using the buffer method
        StringBuffer st = new StringBuffer(s);

        System.out.println(st.reverse());

        String B= "Brandon";

        int lenght1 = B.length();
        String reverse1 = "";
        for (int j  = lenght1-1; j >=0 ; j--) {
            reverse1=reverse1+B.charAt(j);

        }
        System.out.println(reverse1);

        String G = "Galatasaray";
        int legnth2 =G.length();
        String reverse2 = "";

        for (int k = legnth2-1; k >=0 ; k--) {
            reverse2=reverse2+G.charAt(k);

        }
        System.out.println(reverse2);

        String T  = "Turkiye";
        int lenght3 = T.length();
        String reverse3= "";

        for (int t = lenght3-1; t >=0 ; t--) {
            reverse3= reverse3 +T.charAt(t);

        }
        System.out.println(reverse3);



    }
}
