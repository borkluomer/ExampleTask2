package class_examplesAndHomeworks;

public class car {
    String brand;
    String model;
    int horsePower;
    String color;
    double engineSize;
    int year;

    public void brand(){
        System.out.println(brand);
    }
    public void model(){
        System.out.println("Omer is driving " + model);
    }
    public void horsePower(int horsePower){
        System.out.println();
    }
    public void color(){
        System.out.println("The color of the car is " + color);
    }
    public void engineSize(){
        System.out.println("The car has "+engineSize + "liter engine!");
    }
    public void year(){

    }
    public String toString(){
        return year+ " "+brand+ " " +model+ " " + color + " " +horsePower+ " HP, "+ engineSize+ " liter engine.";
    }
}
