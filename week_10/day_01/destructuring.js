const numbers = [1, 2, 3, 4, 5];

const otherNumbers = [...numbers];

// Destructuring allows us to take an array and break it down to individual components

const [firstNumber, secondNumber, ...remainingNumbers] = numbers;

otherNumbers.push(6);
numbers.shift();

console.log("numbers: ", numbers);
console.log("otherNumbers: ", otherNumbers);
console.log(firstNumber);



const lewis = {
    name: "Lewis",
    age: 27,
    homeTown: "Birmingham",
    favouriteColours: ["Blue", "Red", "Purple", "Hot Pink"],
}

const {name, age, favouriteColours, homeTown} = lewis;

const [thing1, thing2, ...leftovers] = favouriteColours;

console.log(name);
console.log(homeTown);

console.log(thing2);
console.log(leftovers);





