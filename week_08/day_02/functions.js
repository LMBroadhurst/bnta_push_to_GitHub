// Named function

function greet(name, name2) {
    return console.log(`Hello young squire ${name}, first of his ${name2}`);
}

greet("Gilbert");
greet("Herbert");
greet(false);
greet(myMan = {name: "Jeremiah", age: 2054, crazy: true});

function greet2(name, timeOfDay) {
    console.log(`Hello young squire ${name}, first of his name at ${timeOfDay}`);
}

greet2("Kevin", "Devonshire Way");

const greeting = greet("Cumberdale", "Sausages");

// Quirks...

const greeting2 = greet("Morning", "Joeseph");

console.log(greeting2);

function greet3(timeOfDay, name) {
    return `Good ${timeOfDay}, ${name}.`
}

// Still works even though greet is defined after it is called... HOISTING!


// 
// Anonymous Functions
// 
// Hoisting does not work here though...

const sum = function (number1, number2) {
    return number1 + number2;
}

const total = sum(1, 2);

console.log(total);



// 
// Arrow Function // 
// Big boiz
// Still anonymous...
// If arrow function is on one line, you don't need to add return. Implicit returning.

const multiply = (number1, number2) => number1 * number2;

const product = multiply(4, 5);

console.log(product);

