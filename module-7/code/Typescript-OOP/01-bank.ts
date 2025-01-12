class Bank {

    // properties
    accountNumber: number;
    accountName: string;
    accountBalance: number;


    // constructor
    constructor(accountNumber: number, accountName: string, accountBalance: number,){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    // methods
    deposit(amount: number) : void {
        if(amount > 0) {
            this.accountBalance += amount;
            console.log("Deposit success");
        } else {
            console.log("Deposit success");
        }
    }

    withdraw(amount: number): void {
        if (this.accountBalance >= amount) {
            console.log("Withdrawl success");
        } else {
            console.log("Insuffcient balance");
        }
    }

    displayDetails(): void {
        console.log(`${this.accountName} - ${this.accountNumber} balance is ${this.accountBalance}`);
    }
}



const account1 = new Bank(101, "John", 1000);

account1.displayDetails();
account1.deposit(100);
account1.displayDetails();

account1.withdraw(200);
account1.displayDetails();