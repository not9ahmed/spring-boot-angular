var Bank = /** @class */ (function () {
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
    function Bank(accountName, accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        Bank.lastAccountNumber++;
        this.accountNumber = Bank.lastAccountNumber;
        // this.accountName = accountName;
        // this.accountBalance = accountBalance;
    }
    // methods
    Bank.prototype.deposit = function (amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            console.log("Deposit success");
        }
        else {
            console.log("Deposit success");
        }
    };
    Bank.prototype.withdraw = function (amount) {
        if (this.accountBalance >= amount) {
            console.log("Withdrawl success");
        }
        else {
            console.log("Insuffcient balance");
        }
    };
    Bank.prototype.displayDetails = function () {
        console.log("".concat(this.accountName, " - ").concat(this.accountNumber, " balance is ").concat(this.accountBalance));
    };
    Bank.displayLastAccountNumber = function () {
        console.log("Last used account number is ".concat(Bank.lastAccountNumber));
    };
    // private accountName: string;
    // private accountBalance: number;
    // static property
    Bank.lastAccountNumber = 100;
    return Bank;
}());
Bank.displayLastAccountNumber();
var account1 = new Bank("John", 1000);
account1.displayDetails();
account1.deposit(100);
// account1.displayDetails();
account1.withdraw(500);
// account1.displayDetails();
Bank.displayLastAccountNumber();
var account2 = new Bank("Joe", 1000);
Bank.displayLastAccountNumber();
