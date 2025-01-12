// normal function
function myFunction(message) {
    console.log(`message variable is ${message}`);
    return "return value from function";
}

const value = myFunction("Yoo");
console.log(value);


// creating function expression
const greet = function(name) {
    const greetMessage = `Welcome ${name}`;
    console.log(greetMessage);
}

greet("john");


// Arrow function
const sum = (num1, num2) =>  num1 + num2;
console.log(sum(4,5));

