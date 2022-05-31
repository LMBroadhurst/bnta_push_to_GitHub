const sum = function(a, b) {
    return a + b;
};

const subtract = (a, b) => a - b;

function multiply(a, b) {
    return a * b;
};

const divide = function(a, b) {
    return a / b;
}

const modulus = (a, b) => a % b;

function even(a) {
    if (a % 2 == 0) {
        return true;
    }
    return false;
}

const odd = function(a) {
    if (a % 2 != 0) {
        return true;
    }
    return false;
}

module.exports = { 
    sum, 
    subtract, 
    multiply, 
    divide, 
    modulus, 
    even, 
    odd 
};
