// Will start from 101, then after 102, 103
var accountType;
(function (accountType) {
    accountType[accountType["SavingAccount"] = 101] = "SavingAccount";
    accountType[accountType["CurrentAccount"] = 102] = "CurrentAccount";
    accountType[accountType["LoanAccount"] = 103] = "LoanAccount";
})(accountType || (accountType = {}));
console.log(accountType.SavingAccount);
console.log(accountType.CurrentAccount);
console.log(accountType.LoanAccount);
var direction;
(function (direction) {
    direction["North"] = "N";
    direction["East"] = "E";
    direction["Sount"] = "S";
    direction["West"] = "W";
})(direction || (direction = {}));
console.log(direction.North);
