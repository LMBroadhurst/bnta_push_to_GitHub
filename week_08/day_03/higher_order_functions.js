const sum = (n1, n2) => {
    console.log(n1 + n2);
}

const subtract = (n1, n2) => {
    console.log(n1 - n2);
}

const multiply = (n1, n2) => {
    console.log(n1 * n2);
}

const doCalculation = (n1, n2, callback) => {
    callback(n1, n2);
}

doCalculation(10, 20, sum);
doCalculation(10, 20, subtract);

doCalculation(10, 20, (n1, n2) => {
    console.log(n1 / n2);
});