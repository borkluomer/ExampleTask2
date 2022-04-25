package class_examplesAndHomeworks;

import MyUtils.GenericUtils;

public class carObject {
    public static void main(String[] args) {

        car car1 = new car();

        car1.brand="Chevrolet";
        car1.model="Corvette";
        car1.horsePower=460;
        car1.color="Yellow";
        car1.engineSize=6.2;
        car1.year=2015;

        car1.brand();
        car1.horsePower(460);
        car1.engineSize();

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.horsePower);
        System.out.println(car1.color);
        System.out.println(car1.engineSize);
        System.out.println(car1.year);
        GenericUtils.Stars();
        System.out.println(car1.toString());







    }
}
