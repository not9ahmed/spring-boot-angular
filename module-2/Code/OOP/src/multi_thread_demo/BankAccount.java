package multi_thread_demo;

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private int accountBalance;
    private static int lastAccountNumber = 1000;

    BankAccount(){
        BankAccount.lastAccountNumber++;
        accountNumber = BankAccount.lastAccountNumber;
        accountName ="No Name";
        accountBalance = 0;
    }

    BankAccount(String accountName, int accountBalance){
        this.accountNumber = ++BankAccount.lastAccountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    void deposit(int amount){
        if(amount>0){
            accountBalance +=amount;
            System.out.println(amount + " Deposit successful");
        } else{
            System.out.println("Invalid amount");
        }
    }

    boolean withdraw(int amount){
        if(amount <=accountBalance){
            accountBalance -=amount;
            System.out.println(amount + " withdraw successful");
            return true;
        }else{
            System.out.println("Insufficient balance");
            return false;
        }
    }

    void displayBalance(){
        System.out.println(accountName + " with account number "+ accountNumber + " balance is "+ accountBalance);
    }

    static void displayLastUsedAccountNumber(){
        System.out.println("Last used account number is "+ lastAccountNumber);
    }

//    public static void main(String[] args) {
//        BankAccount.displayLastUsedAccountNumber();
//        BankAccount account1 = new BankAccount("John Peter", 1000);
//        BankAccount.displayLastUsedAccountNumber();
//        account1.displayBalance();
//        account1.deposit(500);
//        account1.displayBalance();
//        account1.withdraw(400);
//        account1.displayBalance();
//
//        // ANother account
//        BankAccount account2 = new BankAccount();
//        BankAccount.displayLastUsedAccountNumber();
//        account2.displayBalance();
//    }
}