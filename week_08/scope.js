let numbers = [1, 2, 3, 4, 5];

const numbersSquared = [];

const numberToPrint = 0;
let undefinedvariable;
// Can assign a variable without declaring it... not for const though.

for (var number of numbers) {
    let numberToPrint = number;
    console.log(`Value of numberToPrint inside the loop is ${numberToPrint}.`);
}

for (let number of numbers) {
    numbersSquared.push(number ** 2);
}

console.log(numbersSquared);

// let removes the global scope, and line 13 throws an error.
// By using let, we have given the number value "BLOCK" access.

console.log(`Value of numberToPrint outside the loop: ${numberToPrint}`);

