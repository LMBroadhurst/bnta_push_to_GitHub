const numbers = [1, 2, 3, 4, 5];

numbers.forEach(element => {
    console.log(element);
});

const doubledNumbers = numbers.map(n => n * 2);

console.log(numbers);
console.log(doubledNumbers);