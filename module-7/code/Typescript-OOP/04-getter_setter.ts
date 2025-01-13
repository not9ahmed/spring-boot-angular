class Bank {

    // properties
    private accountNumber: number;
    // private accountName: string;
    // private accountBalance: number;

    // static property
    private static lastAccountNumber: number = 100;
    

    // shortcut constructor
    // private can be added to constructor
    // to avoid defining the property up
    constructor(private accountName: string, private _accountBalance: number){
    
        Bank.lastAccountNumber++;
        this.accountNumber = Bank.lastAccountNumber;
        // this.accountName = accountName;
        // this.accountBalance = accountBalance;
    }


    // getter method for accountBalance
    // get() keyword used to create getter
    public get getAccountbalance() {
        return this._accountBalance;
    }  


    // setter method
    public set setAccountBalance(balance: number) {
        this._accountBalance = balance;
    }



    // methods
    public deposit(amount: number) : void {
        if(amount > 0) {
            this._accountBalance += amount;
            console.log("Deposit success");
        } else {
            console.log("Deposit success");
        }
    }

    public withdraw(amount: number): void {
        if (this._accountBalance >= amount) {
            console.log("Withdrawl success");
        } else {
            console.log("Insuffcient balance");
        }
    }

    public displayDetails(): void {
        console.log(`${this.accountName} - ${this.accountNumber} balance is ${this._accountBalance}`);
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

console.log(account1.getAccountbalance);



const account2 = new Bank("Joe", 1000);

Bank.displayLastAccountNumber();