const { Dealership } = require("./Dealership");
const { Customer } = require("./Customer")

class Car {
    constructor(manufacturer, price, engine) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engine = engine;
    }
}

module.exports = {
    Car
};