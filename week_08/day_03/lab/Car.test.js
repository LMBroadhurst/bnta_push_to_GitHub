const { createTestScheduler } = require("jest");

const {
    Car
} = require("./Car");

describe("Tests related to Car", () => {

    test("Can access object attributes - manufacturer", () => {
        const ford = new Car("Ford", 3000, "2.0L");
        expected = "Ford";
        actual = ford.manufacturer;
        expect(actual).toBe(expected);
    });

    test("Can access object attributes - price", () => {
        const ford = new Car("Ford", 3000, "2.0L");
        expected = 3000;
        actual = ford.price;
        expect(actual).toBe(expected);
    });

    test("Can access object attributes - engine", () => {
        const ford = new Car("Ford", 3000, "2.0L");
        expected = "2.0L";
        actual = ford.engine;
        expect(actual).toBe(expected);
    });

});
