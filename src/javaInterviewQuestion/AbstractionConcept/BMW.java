package javaInterviewQuestion.AbstractionConcept;

public class BMW implements Car {

    @Override
    public void start() {
        System.out.println("BMW --starts");
    }

    @Override
    public void stop() {
        System.out.println("BMW -- Stop");
    }

    @Override
    public void refuel() {
        System.out.println("BMW -- refuel");
    }
    public void theftSafety(){
        System.out.println("BMW -- theftSafety");
    }
}
