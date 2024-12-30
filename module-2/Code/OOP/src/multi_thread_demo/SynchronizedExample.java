package multi_thread_demo;

class Banking {

    // synchronized is a lock mechanism to ensure sync
    public synchronized void fundTransfer(BankAccount fromAccount, BankAccount toAccount, int amount) {
        if (fromAccount.withdraw(amount)){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            toAccount.deposit(amount);
        }
    }
}


public class SynchronizedExample {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Ahmed", 1000);
        BankAccount account2 = new BankAccount("John", 300);
        BankAccount account3 = new BankAccount("Bob", 2000);


        Banking bank = new Banking();

        Thread t1 = new Thread(){
            public void run(){
                System.out.println();
                bank.fundTransfer(account1, account2, 1000);
            }
        };

        t1.start();


        Thread t2 = new Thread(){
            public void run(){
                System.out.println();
                bank.fundTransfer(account2, account3, 1000);
            }
        };

        t2.start();


        // Lambda expression with Thread runnable interface
        Runnable t3Runnable = () -> bank.fundTransfer(account2, account3, 1000);
        Thread t3 = new Thread(t3Runnable);


        // Lambda expression with Thread runnable interface
        Thread t4 = new Thread(() -> bank.fundTransfer(account2, account3, 1000));

    }
}
