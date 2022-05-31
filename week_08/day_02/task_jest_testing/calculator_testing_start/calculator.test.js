const { createTestScheduler } = require("jest");
const {
  sum,
  subtract,
  multiply,
  divide,
  modulus,
  even,
  odd,
} = require("./calculator");

describe('sum', () => { 
  
  test('can add two small positive numbers', () => {
    expected = 5;
    actual = sum(2, 3);
    expect(actual).toBe(expected);
  });

  test('can add two large positive numbers', () => { 
    expected = 742;
    actual = sum(416, 326);
    expect(actual).toBe(expected);
  });

  test('can add two negative numbers', () => {
    expected = -25;
    actual = sum(-16, -9);
    expect(actual).toBe(expected);
  });

  test('can add zero', () => {
    expected = -300;
    actual = sum(-300, 0);
    expect(actual).toBe(expected);
  });

});

describe('subtract', () => {

  test('Can subtract negative numbers', () => {
    expected = -12;
    actual = subtract(-31, -19);
    expect(actual).toBe(expected);
  });

  test('Big positive bigger positive', () => {
    expected = - 140;
    actual = subtract(540, 680);
    expect(actual).toBe(expected);
  });

  test('small postive and small positive', () => {
    expected = 10;
    actual = subtract(32, 22);
    expect(actual).toBe(expected);
  });

});

describe('multiply', () => {

  test('small positive numbers', () => {
    expected = 12;
    actual = multiply(4, 3);
    expect(actual).toBe(expected);
  });

  test('positive and negative numbers', () => {
    expected = -20;
    actual = multiply(-5, 4);
    expect(actual).toBe(expected);
  })

});

describe('divide', () => {

  test('Two small numbers', () => {
    expected = 4;
    actual = divide(12, 3);
    expect(actual).toBe(expected);
  });

  test('Negative division', () => {
    expected = -6;
    actual = divide(12, -2);
    expect(actual).toBe(expected);
  })

});

describe('modulus', () => {

  test('Simple 1 remainder', () => {
    expected = 1;
    actual = modulus(7, 3);
    expect(actual).toBe(expected);
  });

  test('No remainder', () => {
    expected = 0;
    actual = modulus(10, 2);
    expect(actual).toBe(expected);
  });

});

describe('even', () => {

  test('Massive odd number', () => {
    expected = false;
    actual = even(543687645);
    expect(actual).toBe(expected);
  });

  test('Small even number', () => {
    expected = true;
    actual = even(2);
    expect(actual).toBe(expected);
  });

});

describe('odd', () => {

  test('massive even number', () => {
    expected = false;
    actual = odd(473894262398);
    expect(actual).toBe(expected);
  });

  test('Small odd number', () => {
    expected = true;
    actual = odd(3);
    expect(actual).toBe(expected);
  });

});
