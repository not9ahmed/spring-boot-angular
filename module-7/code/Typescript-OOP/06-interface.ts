interface ICalculator {
    number1: number,
    number2: number,
    
    add(): number,
    multiply(): number
}


class Calculator implements ICalculator {

    constructor(public number1: number, public number2: number) {
    }

    add(): number {
        return this.number1 + this.number2 ;
    }
    multiply(): number {
        return this.number1 * this.number2 ;
    }
    
}


const cal = new Calculator(3,100);

console.log(cal.add());
console.log(cal.multiply());