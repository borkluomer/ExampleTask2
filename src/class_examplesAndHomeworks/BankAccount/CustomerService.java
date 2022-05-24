package class_examplesAndHomeworks.BankAccount;


public class CustomerService {

    String accountHolder;
    int accountNumber;
    double balance;
    int amount;



    public double withDraw(int amount){
       this.balance=amount-balance;

       return amount;
    }

    public  void  deposit(int amount){

        this.balance=amount+balance;
        System.out.println(balance);



    }

    public double totalBalance(double balance){
    Customer customer;

    this.balance=balance;


        return balance;

    }


}
