package day13_WhileLoop;

public class c1_JAVApractice {
    public static void main(String[] args) {

        //int i = 10;

        //starting point 1
        //ending point 50
        //iteration +1


        String result = "";
        int count2and3 = 0;

        for (int i =1 ; i<10000 ; i++){ // for i = 1 i=2

            if ( i % 2==0 && i%3==0 ){
                result+= "JAVA";
                count2and3++;
            }else if(i % 3==0){
                result += "VA ";
            }else if (i%2==0){
                result+= "JA "; //result = 1 JA
            }else{
                result+= i + " "; //result is = 1

            }

        }
        System.out.println("result = " +result);
        System.out.println("count2and3 = " +count2and3);







    }
}
