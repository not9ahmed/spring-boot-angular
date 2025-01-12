var Bank = /** @class */ (function () {
    // constructor
    function Bank(accountNumber, accountName, accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
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
    return Bank;
}());
var account1 = new Bank(101, "John", 1000);
account1.displayDetails();
account1.deposit(100);
account1.displayDetails();
account1.withdraw(200);
account1.displayDetails();
