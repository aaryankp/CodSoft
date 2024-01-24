import java.util.*;

class BankAccount{
    private int balance;
    public BankAccount(int initialBalance){
        this.balance=initialBalance;
    }
    public int balance(){
        return balance;
    }
    public void deposit(int amount ){
        if(amount>0){
            balance+=amount;
            System.out.println("Rs."+amount+"successfully deposited");
            System.out.println("Available Balance: "+balance);
        }
        else {
            System.out.println("Invalid Amount! Enter an amount more than 0");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Successfully withdrawnRs."+amount);
            System.out.println("Available Balance: "+balance);
        } else if (amount>0 && amount>balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
}
class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account=account;
    }
    public void display(){
        System.out.println("Select Transaction");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw Cash");
        System.out.println("3.Balance Enquiry");
        System.out.println("4.Cancel");
    }

    public void run(){
        Scanner sc=new Scanner(System.in);
        int option;
        do{
            display();
            System.out.println("Pick an option");
            option = sc.nextInt();

            switch (option) {
                case 3:
                    System.out.println("Current Balance: "+account.balance());
                    break;
                case 1:
                    System.out.println("Enter amount to deposit");
                    int depositAmount=sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    int withdrawAmount=sc.nextInt();
                    account.withdraw(withdrawAmount);
                case 4:
                    System.out.println("Thank for using our ATM");
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
        }
        while(option!=4);
    }
}

public class ATM_Interface {
    public static void main(String[] args) {
        BankAccount userAccount=new BankAccount(30000);
        ATM atm=new ATM(userAccount);
        atm.run();
    }
}
