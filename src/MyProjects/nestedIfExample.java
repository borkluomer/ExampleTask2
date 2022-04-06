package MyProjects;

public class nestedIfExample {
    public static void main(String[] args) {

        //NESTED IF
        // if(condition){
        // nested if else inside the body of "if"
        // //Statement inside the body of nested "if"
        // }else{
        // statement inside the body of nested "else"
        // }else{
        // statement inside the body of "else"
        // }
        //

        //EXAMPLE

        //if a person can vote
        //condition is eligible which is the person is citizen
        //condition 2 is age 18

        //case 1
        boolean personCitizen = true;
        int personAge = 34;

        if (personCitizen==true){
            System.out.println("PERSON IS CITIZEN ");
            if (personAge>=18){
                System.out.println("PERSON ELIGIBLE TO VOTE");
            }else {
                System.out.println("PERSON IS NOT ELIGIBLE TO VOTE BC HE/SHE ISN'T CITIZEN");
            }
        }else {
            System.out.println("PERSON IS NOT CITIZEN");
        }
        System.out.println("****************************************************************");

        //case 2
        boolean personCitizen2 = false;
        int personAge2 = 19;

        if (personCitizen2==true){
            System.out.println("PERSON IS CITIZEN ");
            if (personAge2>=18){
                System.out.println("PERSON ELIGIBLE TO VOTE");
            }else {
                System.out.println("PERSON IS NOT ELIGIBLE TO VOTE BC HE/SHE ISN'T CITIZEN");
            }
        }else {
            System.out.println("PERSON IS NOT CITIZEN");
        }

        System.out.println("**********************************************");
        //case 3

        boolean personCitizen3 = true;
        int personAge3 = 16;

        if (personCitizen3==true){
            System.out.println("PERSON IS CITIZEN ");
            if (personAge3>=18){
                System.out.println("PERSON ELIGIBLE TO VOTE");
            }else {
                System.out.println("PERSON IS NOT ELIGIBLE TO VOTE BC OF AGE");
            }
        }else {
            System.out.println("PERSON IS NOT CITIZEN");
        }







    }
}
