var Calculator = /** @class */ (function () {
    function Calculator(number1, number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    Calculator.prototype.add = function () {
        return this.number1 + this.number2;
    };
    Calculator.prototype.multiply = function () {
        return this.number1 * this.number2;
    };
    return Calculator;
}());
var cal = new Calculator(3, 100);
console.log(cal.add());
console.log(cal.multiply());
