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

