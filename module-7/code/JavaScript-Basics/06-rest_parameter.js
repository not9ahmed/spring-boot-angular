// Rest Parameters - recieve infinite number of parameters in function

const sumUp = (initialValue, ...values) => {
    console.log(initialValue, values);

    let sum = 0;
    // values.reduce(sum,curr => sum += prev);
    console.log(sum);
}

sumUp(3,4);
sumUp(1,2,3,4);
sumUp(1,2,3,4);