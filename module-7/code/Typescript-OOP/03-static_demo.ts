class Bank {

    // properties
    private accountNumber: number;
    // private accountName: string;
    // private accountBalance: number;

    // static property
    private static lastAccountNumber: number = 100;
    

    // constructor
    // constructor(accountName: string, accountBalance: number){
        
    //     Bank.lastAccountNumber++;
    //     this.accountNumber = Bank.lastAccountNumber;
    //     this.accountName = accountName;
    //     this.accountBalance = accountBalance;
    // }


    // shortcut constructor
    // private can be added to constructor
    // to avoid defining the property up
    constructor(private accountName: string, private accountBalance: number){
    
        Bank.lastAccountNumber++;
        this.accountNumber = Bank.lastAccountNumber;
        // this.accountName = accountName;
        // this.accountBalance = accountBalance;
    }



    // methods
    public deposit(amount: number) : void {
        if(amount > 0) {
            this.accountBalance += amount;
            console.log("Deposit success");
        } else {
            console.log("Deposit success");
        }
    }

    public withdraw(amount: number): void {
        if (this.accountBalance >= amount) {
            console.log("Withdrawl success");
        } else {
            console.log("Insuffcient balance");
        }
    }

    public displayDetails(): void {
        console.log(`${this.accountName} - ${this.accountNumber} balance is ${this.accountBalance}`);
    }

    public static displayLastAccountNumber() {
        console.log(`Last used account number is ${Bank.lastAccountNumber}`)
    }
}



Bank.displayLastAccountNumber();

const account1 = new Bank("John", 1000);

account1.displayDetails();
account1.deposit(100);
// account1.displayDetails();

account1.withdraw(500);
// account1.displayDetails();

Bank.displayLastAccountNumber();


const account2 = new Bank("Joe", 1000);

Bank.displayLastAccountNumber();