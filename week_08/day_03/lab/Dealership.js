const { Car } = require("./Car");
const { Customer } = require("./Customer")

class Dealership {

    constructor(name, maxCars) {
        this.name = name;
        this.maxCars = maxCars;
        this.currentStock = [];
    }

    countCars() {
        console.log(this.currentStock.length);
    }
    addCarToStock(manufacturer, price, engine) {
        const newCar = new Car(manufacturer, price, engine);
        if (this.currentStock.length < this.maxCars) {
            return this.currentStock.push(newCar);
        } else {
            return "No more space bro";
        }
    }
    allCarManufacturers() {
        const availManufacturers = [];
        this.currentStock.forEach(car => {
            availManufacturers.push(car.manufacturer);
        })
        return availManufacturers;
    }
    findCarFromSpecificManufacturer(manufacturer) {
        const foundCars = this.currentStock.filter(
            car => (manufacturer == car.manufacturer)
        );
        return foundCars;
    }
    totalStockValue() {
        let total = 0;
        this.currentStock.forEach(car => {
            total += car.price;
        });
        return total;
    }
    sellCar(Car) {
        const index = this.currentStock.findIndex(Car);
        this.currentStock = this.currentStock.splice(index, (index + 1));
        return this.currentStock;
    }
    
}

const LDN = new Dealership("London branch", 10,
    [new Car("Tesla", 10000, "Electric"), new Car("VW", 2500, "1.0L")]);

LDN.findCarFromSpecificManufacturer("VW");
LDN.totalStockValue();


module.exports = {
    Dealership
};