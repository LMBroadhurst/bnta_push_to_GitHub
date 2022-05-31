const {sum} = require('./calculator');

test('Can add two small positive numbers', () => {
    // Arrange - do any setup

    // Act - call the function under test
    const actual = sum(2, 3);

    // Assert - call the assertion method
    const expected = 5;

    expect(actual).toBe(expected);

});