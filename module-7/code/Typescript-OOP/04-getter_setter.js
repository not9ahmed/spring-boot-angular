var Bank = /** @class */ (function () {
    // shortcut constructor
    // private can be added to constructor
    // to avoid defining the property up
    function Bank(accountName, _accountBalance) {
        this.accountName = accountName;
        this._accountBalance = _accountBalance;
        Bank.lastAccountNumber++;
        this.accountNumber = Bank.lastAccountNumber;
        // this.accountName = accountName;
        // this.accountBalance = accountBalance;
    }
    Object.defineProperty(Bank.prototype, "getAccountbalance", {
        // getter method for accountBalance
        // get() keyword used to create getter
        get: function () {
            return this._accountBalance;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Bank.prototype.deposit = function (amount) {
        if (amount > 0) {
            this._accountBalance += amount;
            console.log("Deposit success");
        }
        else {
            console.log("Deposit success");
        }
    };
    Bank.prototype.withdraw = function (amount) {
        if (this._accountBalance >= amount) {
            console.log("Withdrawl success");
        }
        else {
            console.log("Insuffcient balance");
        }
    };
    Bank.prototype.displayDetails = function () {
        console.log("".concat(this.accountName, " - ").concat(this.accountNumber, " balance is ").concat(this._accountBalance));
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
console.log(account1.getAccountbalance);
var account2 = new Bank("Joe", 1000);
Bank.displayLastAccountNumber();
