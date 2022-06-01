const numbers = [1, 2, 3, 4, 5];

numbers.forEach(element => {
    console.log(element);
});

const doubledNumbers = numbers.map(n => n * 2);

console.log(numbers);
console.log(doubledNumbers);

// Use filter to have 2, 4

const result = numbers.filter(n => (n % 2 == 0));
console.log(result);

// Reduce 1 + 2 + 3 + 4 + 5

const initialValue = 1;
const sumWithInitial = numbers.reduce(
    (previousValue, currentValue) => previousValue * currentValue,
    initialValue
);

console.log(sumWithInitial);
