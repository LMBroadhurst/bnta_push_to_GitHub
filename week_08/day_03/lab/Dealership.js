const { Car } = require("./Car");
const { Customer } = require("./Customer")

class Dealership {

    constructor(name, maxCars) {
        this.name = name;
        this.maxCars = maxCars;
        this.currentCar = null;
        this.currentStock = [];
    }

    countCars() {
        return (this.currentStock.length);
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

    sellCar(car) {
        let filtered = this.currentStock.filter(item => item != car);
        this.cars = filtered;
    }
    
}


module.exports = {
    Dealership
};