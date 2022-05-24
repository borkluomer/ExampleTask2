package class_examplesAndHomeworks.BankAccount;



     /*   practice task:
        create a custom class for bank account
        attrubutes: accountHolder(String), accountNumber(long), balance(double)
        actions: totalBalance(), withDraw( amount ), deposit( amount )
        toString()
        create a class called bankAccountObject to call BankAccount methods,variables.
        Ex : if i deposit 50 dollars my balance should increase 50 dollars
        : if i withdraw 100 dollars my balance should decrease for 100 dollars
        : to check the balance use totalBalance method*/
     public class main {






         public static void main(String[] args) {

             Customer customer1 =new Customer("CHASE BANK","Chad Andrew",11, 0,0);

             Customer[]customers={customer1};

             for (Customer customer:customers) {
                 System.out.println("BankName : " + customer.bankName);
                 System.out.println("Accountholder : "+customer.accountHolder);
                 System.out.println("Account Number :" + customer.accountNumber);
                 System.out.println("Balance is : " + customer.balance);

             }


             CustomerService customerService = new CustomerService();

             customerService.deposit(12);
             customerService.withDraw(10);



         }



    }


