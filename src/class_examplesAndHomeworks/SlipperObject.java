package class_examplesAndHomeworks;

public class SlipperObject {
    public static void main(String[] args) {

        Slipper slipper1 = new Slipper();
        slipper1.brand = "LV";
        slipper1.color="white";
        slipper1.size=12;

        System.out.println(slipper1);

        Slipper slipper2= new Slipper();
        slipper2.brand="Nike";
        slipper2.color="blue";
        slipper2.size=11;

        System.out.println(slipper2);
        slipper2.setSlipperInfo("LV",12,"white");
        System.out.println(slipper2);

        Slipper slipper3 = new Slipper();
        slipper3.setSlipperInfo("ADIDAS",11,"Blue");
        System.out.println(slipper3);

        Slipper slipper4 = new Slipper();
        slipper3.setSlipperInfo("GUCCI", 11,"Green");
        System.out.println(slipper4);

        Slipper slipper5 = new Slipper();
        slipper5.setSlipperInfo("NIKE",12,"Black");
        System.out.println(slipper5);







    }
}
