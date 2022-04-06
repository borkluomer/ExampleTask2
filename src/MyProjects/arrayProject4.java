package MyProjects;

public class arrayProject4 {
    public static void main(String[] args) {

        //Create a java program that will print how many times java is written in the given
        //String array=String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}

        String [] name = {"java","name1","name2","JaVa","JaVA","C","R" ,"Java"};

        int addOfJava=0;

        String str ="java";

        for ( int i =0; i<name.length; i++ ){
            if (name[i].equalsIgnoreCase(str)){
                addOfJava++;


            }

        }
        System.out.println("java written " + addOfJava + " times in this String");










    }
}
