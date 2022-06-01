const { createTestScheduler } = require("jest");

const {
    Dealership
} = require("./Dealership");

const {
    Car
} = require("./Car");

describe("Tests related to Dealership", () => {

    test("Can access object attributes - name", () => {
        const BHX = new Dealership("BHX", 20)
        expected = "BHX";
        actual = BHX.name;
        expect(actual).toBe(expected);
    });

    test("Count cars in stock", () => {
        const car1 = new Car("Tesla", 10000, "Electric");
        const car2 = new Car("VW", 2500, "1.0L");
        const LDNT = new Dealership("London branch", 10, [car1, car2]);
        expected = 2;
        actual = LDNT.currentStock.length;
        expect(actual).toBe(expected);
    });

    test("Add car to stock", () => {
        const car1 = new Car("Tesla", 10000, "Electric");
        const car2 = new Car("VW", 2500, "1.0L");
        const LDNT2 = new Dealership("London branch", 10, [car1, car2]);
        expected = 3;

        LDNT2.addCarToStock("Jeep", 12000, "4.0L");
        actual = LDNT2.currentStock.length;

        expect(actual).toBe(expected);
    });

    test("Add car to full dealership", () => {
        const car1 = new Car("Tesla", 10000, "Electric");
        const car2 = new Car("VW", 2500, "1.0L");
        const LDNT10 = new Dealership("London branch", 2, [car1, car2]);
        expected = "No more space bro";

        actual = LDNT10.addCarToStock("Land Rover", 1000, "3.5L");

        expect(actual).toBe(expected);
    })

    test("Return array of each cars manufacturer", () => {
        const car1 = new Car("Tesla", 10000, "Electric");
        const car2 = new Car("VW", 2500, "1.0L");
        const LDNT3 = new Dealership("London branch", 10, [car1, car2]);
        expected = "VW";
        actual = LDNT3.allCarManufacturers();
        expect(actual[1]).toBe(expected);
    });

    test("Find all cars from given Manufacturer", () => {
        const car1 = new Car("Tesla", 10000, "Electric");
        const car2 = new Car("VW", 2500, "1.0L");
        const LDNT4 = new Dealership("London branch", 10, [car1, car2]);
        expected = 1;
        actual = LDNT4.findCarFromSpecificManufacturer("VW").length;
        expect(actual).toBe(expected);
    });

    test("Find the total value of the cars in stock", () => {
        const car1 = new Car("Tesla", 10000, "Electric");
        const car2 = new Car("VW", 2500, "1.0L");
        const LDNT5 = new Dealership("London branch", 10, [car1, car2]);

        expected = 12500;

        actual = LDNT5.totalStockValue();

        expect(actual).toBe(expected);
    });



})