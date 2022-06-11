package javaInterviewQuestion.AbstractionConcept;

public interface Car {

    //only final and static variable
    final int wheel = 4;

    //Always define only abstract methods
    // no method body
    //only method declaration


    public void start();
    public void stop();
    public void refuel();
}
