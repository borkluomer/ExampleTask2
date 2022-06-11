package javaInterviewQuestion.AbstractionConcept;

public abstract class Bank  {

    int amt = 100;
    final int rate = 10;
    static int loanRate = 5;


    //partial abstraction
    //hiding the implementation logic--is called Abstraction
    //abstract class can have abstract methods and none abstract methods

    //only prototype
    public abstract void load(); //abstract method --no method body

    //non-abstract methods
    public void credit(){
        System.out.println("Bank -- Credit");
    }
    public void debit(){
        System.out.println("Bank --Debit");
    }



}
