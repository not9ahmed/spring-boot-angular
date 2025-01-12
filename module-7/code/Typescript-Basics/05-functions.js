function calculate(title, price, quantity, discount) {
    if (quantity === void 0) { quantity = 1; }
    if (discount === void 0) { discount = 0; }
    var totalPrice = price * quantity - discount;
    console.log("Total price of product ".concat(title, " : ").concat(totalPrice));
}
calculate("iPhone 16", 250, 3, 10);
calculate("iPad Mini", 250);
var sumUp = function () {
    var values = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        values[_i] = arguments[_i];
    }
    return values.reduce(function (sum, current) { return sum + current; }, 0);
};
var total = sumUp(3, 3, 1, 5);
console.log(total);
