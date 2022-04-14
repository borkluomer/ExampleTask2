package class_examplesAndHomeworks;

public class methodsExample2 {

    public static void main(String[] args) {

        String []letters = {"A","a","b","B","c","C","D"};

        for (String each1:letters) {
            int count=0;

            for (String each2:letters) {

                if (each2.equalsIgnoreCase(each1)){
                 count++;
                }

            }

            if (count==1){
                System.out.println("Unique charachter is :" + each1);
            }

        }

    }

}




