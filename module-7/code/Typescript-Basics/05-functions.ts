function calculate(title:string, price: number, quantity: number=1, discount: number=0) : void {
    const totalPrice = price * quantity - discount;
    console.log(`Total price of product ${title} : ${totalPrice}`);
}

calculate("iPhone 16", 250, 3, 10);
calculate("iPad Mini", 250);


const sumUp = (...values: number[]): number => {
    return values.reduce((sum, current) => sum + current, 0);
};

const total = sumUp(3,3,1,5);
console.log(total)