package class_examplesAndHomeworks;

import MyUtils.GenericUtils;

public class sdet {
    String name;
    int employeeID;
    String companyName;
    double salary;

    public void SetEmployeeInfo(String name1,int employeeID1,double salary1){
        System.out.println(name+ " is QA at "+ companyName);
        name = name1;
        employeeID=employeeID1;
        companyName=companyName;
        salary=salary1;
    }
    public void testing(){
        System.out.println(name + "QA Tester");

    }
    public void Ticket(boolean bugTicket){

        if (bugTicket==true){
            System.out.println(name+", "+ "is issuing a bug ticket  ");
        }
        else{
            System.out.println("there is not bug ticket created by the QA");
        }
    }
    public String toString (){
        return name+ "'s employee ID is,"+employeeID+" at "+companyName+", his salary is "+salary;
    }


}
