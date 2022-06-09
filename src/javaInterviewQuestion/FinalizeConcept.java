package javaInterviewQuestion;

public class FinalizeConcept {

    public void finalize(){
        System.out.println("finalize method");
    }

    public static void main(String[] args) {



        FinalConcept f1 = new FinalConcept();
        FinalConcept f2 = new FinalConcept();

        f1 = null;
        f2 = null;

        System.gc();




    }
}
