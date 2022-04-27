package class_examplesAndHomeworks;

public class sdetobject {
    public static void main(String[] args) {


        sdet sdet1= new sdet();
        sdet1.name="Omer";
        sdet1.companyName="Apple";
        sdet1.salary=140000;
        sdet1.employeeID=7;
        sdet1.SetEmployeeInfo(sdet1.name,sdet1.employeeID,sdet1.salary);
        System.out.println(sdet1);
        sdet1.Ticket(true);

        }
    }









