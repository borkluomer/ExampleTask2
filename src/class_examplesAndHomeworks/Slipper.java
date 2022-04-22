package class_examplesAndHomeworks;

public class Slipper {

    // /*task1
    // create a class called slipper //Attributes:
    // brand, size , color
    //Actions:
    // wear(), setSlipperInfo, toString;
    //
    //create a slipper object class to set 5 slipperobjectst and print slipper info // */
    // /*

    String brand;
    int size;
    String color;

    public void wear(){
        System.out.println("Omer Just bought a "+brand + " of slippers.");
    }
    public void setSlipperInfo(String slipperBrand, int slipperSize, String slipperColor ){
        brand=slipperBrand;
        size=slipperSize;
        color=slipperColor;

    }

    public String toString(){
        return brand + "-" + size + "-" + color;
    }

}
