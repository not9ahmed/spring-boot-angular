const array1 = [1, 2, 4, 5, 6, 7];

// shallow copy with spread
const array2 = [...array1];

// map
// const array2 = array1.map(el => el);



array1[0] = 9999;


console.log(array1);
console.log(array2);

// Merge arrays
const array3 = [...array1, ...array2];
console.log(array3);


// Spread operator in object

const person1 = {
    name: "Ahmed",
    age: 25,
    hobby: "Programming"
}


const person2 = {...person1};

console.log(person1);
console.log(person2);

let email = "ahmed@gmail.com";

person3 = {...person1, extraField1: "Hello", extraField2: "world", email: email}
console.log(person3);