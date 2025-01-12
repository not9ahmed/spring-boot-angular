function calculate (price, quantity, discount=0) {
    return (price * quantity) - discount;
}

const result1 = calculate(1000, 20, 40);
const result2 = calculate(1000, 20);

console.log(result1);
console.log(result2);