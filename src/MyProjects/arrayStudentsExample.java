package MyProjects;

public class arrayStudentsExample {
    public static void main(String[] args){

        //declaration of array
        //DataType [] nameOfYourContainer = { data1,data2,data3...} data==variable
        //each container will have their label
        //you CANNOT HAVE MIX CONTAINERS

        String student1 = "Omer";
        String student2 = "Baris";
        String student3 = "Taylan";
        String student4 = "Huseyin";
        String student5 = "Ali";

        //before learning arrays
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("**************************************");
        //with array,
        //we classify

        String [] students = new String [5];
        students[0] = "Omer";
        students[1] = "Baris";
        students[2] = "Taylan";
        students[3] = "Huseyin";
        students[4] = "Ali";

        //we gone run this with loop to gather them up instead of typing it one by one
        for ( int i = 0 ; i < students.length ;  i++ ){
            System.out.println(students[i]);
        }

        System.out.println("----------------------");
        //see the différance between good coding vs. great coding!!!!

        for (String student : students){ //this means go thru every student in students basically the clas
            System.out.println(student);

        }










    }
        }
